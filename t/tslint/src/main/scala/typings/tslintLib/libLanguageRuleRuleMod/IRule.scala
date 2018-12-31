package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  @JSName("apply")
  def apply(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): js.Array[RuleFailure]
  def applyWithWalker(walker: tslintLib.libLanguageWalkerWalkerMod.IWalker): js.Array[RuleFailure]
  def getOptions(): IOptions
  def isEnabled(): scala.Boolean
}

