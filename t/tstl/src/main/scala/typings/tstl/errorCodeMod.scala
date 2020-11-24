package typings.tstl

import typings.tstl.errorCategoryMod.ErrorCategory
import typings.tstl.errorConditionMod.ErrorCondition
import typings.tstl.errorInstanceMod.ErrorInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/ErrorCode", JSImport.Namespace)
@js.native
object errorCodeMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCode () extends ErrorInstance {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error instance.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: ErrorCategory) = this()
    
    /**
      * Get default error condition.
      *
      * @return The default error condition object.
      */
    def default_error_condition(): ErrorCondition = js.native
  }
}
