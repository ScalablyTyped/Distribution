package typings
package tslintLib.libLanguageRuleTypedRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/typedRule", "TypedRule")
@js.native
abstract class TypedRule ()
  extends tslintLib.libLanguageRuleAbstractRuleMod.AbstractRule
     with tslintLib.libLanguageRuleRuleMod.ITypedRule {
  @JSName("apply")
  def apply(): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
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

