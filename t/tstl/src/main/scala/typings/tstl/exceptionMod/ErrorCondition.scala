package typings.tstl.exceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", "ErrorCondition")
@js.native
/**
  * Default Constructor.
  */
class ErrorCondition ()
  extends typings.tstl.exceptionErrorConditionMod.ErrorCondition {
  /**
    * Initializer Constructor.
    *
    * @param val Identifier of an error condition.
    * @param category An error category instance.
    */
  def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
}

