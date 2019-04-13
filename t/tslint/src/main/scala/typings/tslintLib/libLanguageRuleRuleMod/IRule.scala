package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  @JSName("apply")
  def apply(sourceFile: typescriptLib.typescriptMod.SourceFile): js.Array[RuleFailure]
  def applyWithWalker(walker: tslintLib.libLanguageWalkerWalkerMod.IWalker): js.Array[RuleFailure]
  def getOptions(): IOptions
  def isEnabled(): scala.Boolean
}

object IRule {
  @scala.inline
  def apply(
    apply: typescriptLib.typescriptMod.SourceFile => js.Array[RuleFailure],
    applyWithWalker: tslintLib.libLanguageWalkerWalkerMod.IWalker => js.Array[RuleFailure],
    getOptions: () => IOptions,
    isEnabled: () => scala.Boolean
  ): IRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[IRule]
  }
}

