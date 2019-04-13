package typings
package tslintLib.libLanguageRuleOptionallyTypedRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/optionallyTypedRule", "OptionallyTypedRule")
@js.native
abstract class OptionallyTypedRule ()
  extends tslintLib.libLanguageRuleAbstractRuleMod.AbstractRule
     with tslintLib.libLanguageRuleRuleMod.ITypedRule {
  /* CompleteClass */
  @JSName("apply")
  override def apply(sourceFile: typescriptLib.typescriptMod.SourceFile): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* CompleteClass */
  override def applyWithProgram(sourceFile: typescriptLib.typescriptMod.SourceFile, program: typescriptLib.typescriptMod.Program): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* CompleteClass */
  override def applyWithWalker(walker: tslintLib.libLanguageWalkerWalkerMod.IWalker): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* CompleteClass */
  override def getOptions(): tslintLib.libLanguageRuleRuleMod.IOptions = js.native
  /* CompleteClass */
  override def isEnabled(): scala.Boolean = js.native
}

