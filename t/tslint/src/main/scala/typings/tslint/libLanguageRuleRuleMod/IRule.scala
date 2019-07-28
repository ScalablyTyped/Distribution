package typings.tslint.libLanguageRuleRuleMod

import typings.tslint.libLanguageWalkerWalkerMod.IWalker
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  @JSName("apply")
  def apply(sourceFile: SourceFile): js.Array[RuleFailure]
  def applyWithWalker(walker: IWalker): js.Array[RuleFailure]
  def getOptions(): IOptions
  def isEnabled(): Boolean
}

object IRule {
  @scala.inline
  def apply(
    apply: SourceFile => js.Array[RuleFailure],
    applyWithWalker: IWalker => js.Array[RuleFailure],
    getOptions: () => IOptions,
    isEnabled: () => Boolean
  ): IRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[IRule]
  }
}

