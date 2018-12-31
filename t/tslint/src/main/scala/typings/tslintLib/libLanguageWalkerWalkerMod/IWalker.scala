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

