package typings
package tslintLib.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedRule extends IRule {
  def applyWithProgram(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    program: typescriptLib.typescriptMod.tsNs.Program
  ): js.Array[RuleFailure]
}

object ITypedRule {
  @scala.inline
  def apply(
    apply: js.Function1[typescriptLib.typescriptMod.tsNs.SourceFile, js.Array[RuleFailure]],
    applyWithProgram: js.Function2[
      typescriptLib.typescriptMod.tsNs.SourceFile, 
      typescriptLib.typescriptMod.tsNs.Program, 
      js.Array[RuleFailure]
    ],
    applyWithWalker: js.Function1[tslintLib.libLanguageWalkerWalkerMod.IWalker, js.Array[RuleFailure]],
    getOptions: js.Function0[IOptions],
    isEnabled: js.Function0[scala.Boolean]
  ): ITypedRule = {
    val __obj = js.Dynamic.literal(apply = apply, applyWithProgram = applyWithProgram, applyWithWalker = applyWithWalker, getOptions = getOptions, isEnabled = isEnabled)
  
    __obj.asInstanceOf[ITypedRule]
  }
}

