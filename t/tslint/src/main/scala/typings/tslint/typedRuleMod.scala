package typings.tslint

import typings.tslint.abstractRuleMod.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.ITypedRule
import typings.tslint.ruleMod.RuleFailure
import typings.tslint.walkerWalkerMod.IWalker
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/typedRule", JSImport.Namespace)
@js.native
object typedRuleMod extends js.Object {
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
  
}

