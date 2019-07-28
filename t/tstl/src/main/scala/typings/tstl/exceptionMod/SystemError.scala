package typings.tstl.exceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", "SystemError")
@js.native
class SystemError protected ()
  extends typings.tstl.exceptionSystemErrorMod.SystemError {
  /**
    * Initializer Constructor.
    *
    * @param code An error code.
    * @param message A detailed error message.
    */
  def this(code: typings.tstl.exceptionErrorCodeMod.ErrorCode) = this()
  def this(code: typings.tstl.exceptionErrorCodeMod.ErrorCode, message: String) = this()
  /**
    * Construct from references.
    *
    * @param val Identnfier of an error code in *category*.
    * @param category An error category.
    * @param message A detailed error message.
    */
  def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
  def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory, message: String) = this()
}

