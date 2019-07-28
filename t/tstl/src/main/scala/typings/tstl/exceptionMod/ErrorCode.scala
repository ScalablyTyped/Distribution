package typings.tstl.exceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", "ErrorCode")
@js.native
/**
  * Default Constructor.
  */
class ErrorCode ()
  extends typings.tstl.exceptionErrorCodeMod.ErrorCode {
  /**
    * Initializer Constructor.
    *
    * @param val Identifier of an error instance.
    * @param category An error category instance.
    */
  def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
}

