package typings.tslint

import org.scalablytyped.runtime.TopLevel
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRule
import typings.tslint.ruleMod.IRuleMetadata
import typings.tslint.ruleMod.RuleFailure
import typings.tslint.ruleMod.RuleSeverity
import typings.tslint.walkerMod.WalkContext
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractRuleMod {
  
  @JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule")
  @js.native
  abstract class AbstractRule protected () extends IRule {
    def this(options: IOptions) = this()
    
    /* protected */ def applyWithFunction(
      sourceFile: SourceFile,
      walkFn: js.Function1[/* ctx */ WalkContext[js.UndefOr[scala.Nothing]], Unit]
    ): js.Array[RuleFailure] = js.native
    /* protected */ def applyWithFunction[T](sourceFile: SourceFile, walkFn: js.Function1[/* ctx */ WalkContext[T], Unit], options: NoInfer[T]): js.Array[RuleFailure] = js.native
    /* protected */ def applyWithFunction[T, U](
      sourceFile: SourceFile,
      walkFn: js.Function2[/* ctx */ WalkContext[T], /* programOrChecker */ U, Unit],
      options: NoInfer[T],
      checker: NoInfer[U]
    ): js.Array[RuleFailure] = js.native
    
    /**
      * @deprecated
      * Failures will be filtered based on `tslint:disable` comments by tslint.
      * This method now does nothing.
      */
    /* protected */ def filterFailures(failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
    
    val options: js.Any = js.native
    
    val ruleArguments: js.Array[_] = js.native
    
    var ruleName: String = js.native
    
    val ruleSeverity: RuleSeverity = js.native
  }
  /* static members */
  object AbstractRule {
    
    @JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  type NoInfer[T] = T with typings.tslint.tslintStrings.NoInfer with TopLevel[T]
}
