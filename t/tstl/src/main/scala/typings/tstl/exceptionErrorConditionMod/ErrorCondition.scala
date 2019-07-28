package typings.tstl.exceptionErrorConditionMod

import typings.tstl.baseErrorInstanceMod.ErrorInstance
import typings.tstl.exceptionErrorCategoryMod.ErrorCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/ErrorCondition", "ErrorCondition")
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

