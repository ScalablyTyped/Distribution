package typings
package tslintLib.libLanguageWalkerWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWalker extends js.Object {
  def getFailures(): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  def getSourceFile(): typescriptLib.typescriptMod.tsNs.SourceFile
  def walk(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): scala.Unit
}

object IWalker {
  @scala.inline
  def apply(
    getFailures: js.Function0[js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]],
    getSourceFile: js.Function0[typescriptLib.typescriptMod.tsNs.SourceFile],
    walk: js.Function1[typescriptLib.typescriptMod.tsNs.SourceFile, scala.Unit]
  ): IWalker = {
    val __obj = js.Dynamic.literal(getFailures = getFailures, getSourceFile = getSourceFile, walk = walk)
  
    __obj.asInstanceOf[IWalker]
  }
}

