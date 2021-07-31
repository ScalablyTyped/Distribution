package typings.tslint

import typings.tslint.abstractRuleMod.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.ITypedRule
import typings.tslint.ruleMod.RuleFailure
import typings.tslint.walkerWalkerMod.IWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedRuleMod {
  
  @JSImport("tslint/lib/language/rule/typedRule", "TypedRule")
  @js.native
  abstract class TypedRule protected ()
    extends AbstractRule
       with ITypedRule {
    def this(options: IOptions) = this()
    
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
}
