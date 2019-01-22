package typings
package tstlLib.exceptionErrorCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/ErrorCode", "ErrorCode")
@js.native
/**
  * Default Constructor.
  */
class ErrorCode ()
  extends tstlLib.baseErrorInstanceMod.ErrorInstance {
  /**
    * Initializer Constructor.
    *
    * @param val Identifier of an error instance.
    * @param category An error category instance.
    */
  def this(`val`: scala.Double, category: tstlLib.exceptionErrorCategoryMod.ErrorCategory) = this()
  /**
    * Get default error condition.
    *
    * @return The default error condition object.
    */
  def default_error_condition(): tstlLib.exceptionErrorConditionMod.ErrorCondition = js.native
}

