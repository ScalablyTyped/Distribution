package typings
package tslintLib.libLanguageRuleAbstractRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule")
@js.native
abstract class AbstractRule protected ()
  extends tslintLib.libLanguageRuleRuleMod.IRule {
  def this(options: tslintLib.libLanguageRuleRuleMod.IOptions) = this()
  val options: js.Any = js.native
  val ruleArguments: js.Array[_] = js.native
  var ruleName: java.lang.String = js.native
  val ruleSeverity: tslintLib.libLanguageRuleRuleMod.RuleSeverity = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* protected */ def applyWithFunction(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    walkFn: js.Function1[/* ctx */ tslintLib.libLanguageWalkerMod.WalkContext[scala.Unit], scala.Unit]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* protected */ def applyWithFunction[T](
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    walkFn: js.Function1[/* ctx */ tslintLib.libLanguageWalkerMod.WalkContext[T], scala.Unit],
    options: NoInfer[T]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* protected */ def applyWithFunction[T, U](
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    walkFn: js.Function2[
      /* ctx */ tslintLib.libLanguageWalkerMod.WalkContext[T], 
      /* programOrChecker */ U, 
      scala.Unit
    ],
    options: NoInfer[T],
    checker: NoInfer[U]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* CompleteClass */
  override def applyWithWalker(walker: tslintLib.libLanguageWalkerWalkerMod.IWalker): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /**
    * @deprecated
    * Failures will be filtered based on `tslint:disable` comments by tslint.
    * This method now does nothing.
    */
  /* protected */ def filterFailures(failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  /* CompleteClass */
  override def getOptions(): tslintLib.libLanguageRuleRuleMod.IOptions = js.native
  /* CompleteClass */
  override def isEnabled(): scala.Boolean = js.native
}

/* static members */
@JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule")
@js.native
object AbstractRule extends js.Object {
  var metadata: tslintLib.libLanguageRuleRuleMod.IRuleMetadata = js.native
}

