package typings
package tstlLib.exceptionExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/Exception", "Exception")
@js.native
/**
  * Default Constructor.
  */
class Exception ()
  extends stdLib.Error {
  /**
    * Initializer Constructor.
    *
    * @param message The error messgae.
    */
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Get error message.
    *
    * @return The error message.
    */
  def what(): java.lang.String = js.native
}

