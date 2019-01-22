package typings
package tstlLib.exceptionErrorCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/ErrorCategory", "ErrorCategory")
@js.native
/**
  * Default Constructor.
  */
abstract class ErrorCategory () extends js.Object {
  /**
    * Get default error condition.
    *
    * @param val Identifier of an error condition.
    * @return The error condition.
    */
  def default_error_condition(`val`: scala.Double): tstlLib.exceptionErrorConditionMod.ErrorCondition = js.native
  /**
    * Test equivalence.
    *
    * @param code An error code.
    * @param val_cond Identifier of an error condition.
    * @return Whether equivalent or not.
    */
  def equivalent(code: tstlLib.exceptionErrorCodeMod.ErrorCode, val_cond: scala.Double): scala.Boolean = js.native
  /**
    * Test equivalence.
    *
    * @param val_code Identifier of an error code.
    * @param cond An error condition.
    * @return Whether equivalent or not.
    */
  def equivalent(val_code: scala.Double, cond: tstlLib.exceptionErrorConditionMod.ErrorCondition): scala.Boolean = js.native
  /**
    * Get error message.
    *
    * @param val Identifier of an error condition.
    * @return The error message.
    */
  def message(`val`: scala.Double): java.lang.String = js.native
  /**
    * Get category name.
    */
  def name(): java.lang.String = js.native
}

