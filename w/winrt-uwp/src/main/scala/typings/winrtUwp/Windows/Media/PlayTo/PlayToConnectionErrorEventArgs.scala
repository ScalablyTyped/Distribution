package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Error event. */
@js.native
trait PlayToConnectionErrorEventArgs extends js.Object {
  /** Gets the error code for a Play To connection error. */
  var code: PlayToConnectionError = js.native
  /** Gets the error message for a Play To connection error. */
  var message: String = js.native
}

object PlayToConnectionErrorEventArgs {
  @scala.inline
  def apply(code: PlayToConnectionError, message: String): PlayToConnectionErrorEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionErrorEventArgs]
  }
  @scala.inline
  implicit class PlayToConnectionErrorEventArgsOps[Self <: PlayToConnectionErrorEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: PlayToConnectionError): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

