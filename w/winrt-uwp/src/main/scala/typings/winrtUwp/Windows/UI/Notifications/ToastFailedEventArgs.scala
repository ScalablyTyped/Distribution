package typings.winrtUwp.Windows.UI.Notifications

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the error code that was generated in the process of raising a toast notification. */
@js.native
trait ToastFailedEventArgs extends js.Object {
  /** Gets the error code that was generated in the process of raising a toast notification. */
  var errorCode: WinRTError = js.native
}

object ToastFailedEventArgs {
  @scala.inline
  def apply(errorCode: WinRTError): ToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastFailedEventArgs]
  }
  @scala.inline
  implicit class ToastFailedEventArgsOps[Self <: ToastFailedEventArgs] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: WinRTError): Self = this.set("errorCode", value.asInstanceOf[js.Any])
  }
  
}

