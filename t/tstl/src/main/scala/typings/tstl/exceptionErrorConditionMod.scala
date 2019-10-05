package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseErrorInstanceMod.ErrorInstance
import typings.tstl.exceptionErrorCategoryMod.ErrorCategory
import typings.tstl.exceptionErrorConditionMod.ErrorCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/ErrorCondition", JSImport.Namespace)
@js.native
object exceptionErrorConditionMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition () extends ErrorInstance {
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

