package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.IRule
import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import typings.tslint.libLanguageRuleRuleMod.RuleSeverity
import typings.tslint.libLanguageWalkerMod.WalkContext
import typings.tslint.libLanguageWalkerWalkerMod.IWalker
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageRuleAbstractRuleMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule")
  @js.native
  open class AbstractRule protected ()
    extends StObject
       with IRule {
    def this(options: IOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(sourceFile: SourceFile): js.Array[RuleFailure] = js.native
    
    /* protected */ def applyWithFunction(sourceFile: SourceFile, walkFn: js.Function1[/* ctx */ WalkContext[Unit], Unit]): js.Array[RuleFailure] = js.native
    /* protected */ def applyWithFunction[T](sourceFile: SourceFile, walkFn: js.Function1[/* ctx */ WalkContext[T], Unit], options: NoInfer[T]): js.Array[RuleFailure] = js.native
    /* protected */ def applyWithFunction[T, U](
      sourceFile: SourceFile,
      walkFn: js.Function2[/* ctx */ WalkContext[T], /* programOrChecker */ U, Unit],
      options: NoInfer[T],
      checker: NoInfer[U]
    ): js.Array[RuleFailure] = js.native
    
    /* CompleteClass */
    override def applyWithWalker(walker: IWalker): js.Array[RuleFailure] = js.native
    
    /**
      * @deprecated
      * Failures will be filtered based on `tslint:disable` comments by tslint.
      * This method now does nothing.
      */
    /* protected */ def filterFailures(failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
    
    /* CompleteClass */
    override def getOptions(): IOptions = js.native
    
    /* CompleteClass */
    override def isEnabled(): Boolean = js.native
    
    /* private */ val options: Any = js.native
    
    /* protected */ val ruleArguments: js.Array[Any] = js.native
    
    var ruleName: String = js.native
    
    /* protected */ val ruleSeverity: RuleSeverity = js.native
  }
  /* static members */
  object AbstractRule {
    
    @JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/language/rule/abstractRule", "AbstractRule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  type NoInfer[T] = T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any)
}
