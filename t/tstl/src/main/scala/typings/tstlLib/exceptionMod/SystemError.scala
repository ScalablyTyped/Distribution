package typings
package tstlLib.exceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", "SystemError")
@js.native
class SystemError protected ()
  extends tstlLib.exceptionSystemErrorMod.SystemError {
  /**
    * Initializer Constructor.
    *
    * @param code An error code.
    * @param message A detailed error message.
    */
  def this(code: tstlLib.exceptionErrorCodeMod.ErrorCode) = this()
  def this(code: tstlLib.exceptionErrorCodeMod.ErrorCode, message: java.lang.String) = this()
  /**
    * Construct from references.
    *
    * @param val Identnfier of an error code in *category*.
    * @param category An error category.
    * @param message A detailed error message.
    */
  def this(`val`: scala.Double, category: tstlLib.exceptionErrorCategoryMod.ErrorCategory) = this()
  def this(`val`: scala.Double, category: tstlLib.exceptionErrorCategoryMod.ErrorCategory, message: java.lang.String) = this()
}

