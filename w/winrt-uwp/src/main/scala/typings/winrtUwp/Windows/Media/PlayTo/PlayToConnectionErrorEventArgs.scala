package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Error event. */
trait PlayToConnectionErrorEventArgs extends js.Object {
  /** Gets the error code for a Play To connection error. */
  var code: PlayToConnectionError
  /** Gets the error message for a Play To connection error. */
  var message: String
}

object PlayToConnectionErrorEventArgs {
  @scala.inline
  def apply(code: PlayToConnectionError, message: String): PlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionErrorEventArgs]
  }
}

