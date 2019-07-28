package typings.tslint.libLanguageRuleTypedRuleMod

import typings.tslint.libLanguageRuleAbstractRuleMod.AbstractRule
import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.ITypedRule
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import typings.tslint.libLanguageWalkerWalkerMod.IWalker
import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/typedRule", "TypedRule")
@js.native
abstract class TypedRule ()
  extends AbstractRule
     with ITypedRule {
  @JSName("apply")
  def apply(): js.Array[RuleFailure] = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
  /* CompleteClass */
  override def applyWithProgram(sourceFile: SourceFile, program: Program): js.Array[RuleFailure] = js.native
  /* CompleteClass */
  override def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
  /* CompleteClass */
  override def getOptions(): IOptions = js.native
  /* CompleteClass */
  override def isEnabled(): Boolean = js.native
}

