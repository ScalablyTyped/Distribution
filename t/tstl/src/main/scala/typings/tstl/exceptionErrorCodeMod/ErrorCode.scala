package typings.tstl.exceptionErrorCodeMod

import typings.tstl.baseErrorInstanceMod.ErrorInstance
import typings.tstl.exceptionErrorCategoryMod.ErrorCategory
import typings.tstl.exceptionErrorConditionMod.ErrorCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/ErrorCode", "ErrorCode")
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

