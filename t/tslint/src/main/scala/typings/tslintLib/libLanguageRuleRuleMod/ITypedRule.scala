package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedRule extends IRule {
  def applyWithProgram(sourceFile: typescriptLib.typescriptMod.SourceFile, program: typescriptLib.typescriptMod.Program): js.Array[RuleFailure]
}

object ITypedRule {
  @scala.inline
  def apply(
    apply: typescriptLib.typescriptMod.SourceFile => js.Array[RuleFailure],
    applyWithProgram: (typescriptLib.typescriptMod.SourceFile, typescriptLib.typescriptMod.Program) => js.Array[RuleFailure],
    applyWithWalker: tslintLib.libLanguageWalkerWalkerMod.IWalker => js.Array[RuleFailure],
    getOptions: () => IOptions,
    isEnabled: () => scala.Boolean
  ): ITypedRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyWithProgram = js.Any.fromFunction2(applyWithProgram), applyWithWalker = js.Any.fromFunction1(applyWithWalker), getOptions = js.Any.fromFunction0(getOptions), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[ITypedRule]
  }
}

