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

object IRule {
  @scala.inline
  def apply(
    apply: js.Function1[typescriptLib.typescriptMod.tsNs.SourceFile, js.Array[RuleFailure]],
    applyWithWalker: js.Function1[tslintLib.libLanguageWalkerWalkerMod.IWalker, js.Array[RuleFailure]],
    getOptions: js.Function0[IOptions],
    isEnabled: js.Function0[scala.Boolean]
  ): IRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("applyWithWalker")(applyWithWalker)
    __obj.updateDynamic("getOptions")(getOptions)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.asInstanceOf[IRule]
  }
}

