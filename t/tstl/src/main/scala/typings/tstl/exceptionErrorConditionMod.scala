package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.exceptionErrorCategoryMod.ErrorCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/ErrorCondition", JSImport.Namespace)
@js.native
object exceptionErrorConditionMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorInstance * / any */ @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: ErrorCategory) = this()
  }
  
  var error_condition: Instantiable0[ErrorCondition] = js.native
  type error_condition = ErrorCondition
}

