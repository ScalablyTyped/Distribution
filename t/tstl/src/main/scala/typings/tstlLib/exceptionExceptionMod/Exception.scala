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
    * Native function for `JSON.stringify()`.
    *
    * The {@link Exception.toJSON} function returns only three properties; ({@link name}, {@link message} and {@link stack}). If you want to define a new sub-class extending the {@link Exception} and let the class to export additional props (or remove some props), override this {@link Exception.toJSON} method.
    *
    * @return An object for `JSON.stringify()`.
    */
  def toJSON(): js.Object = js.native
  /**
    * Get error message.
    *
    * @return The error message.
    */
  def what(): java.lang.String = js.native
}

