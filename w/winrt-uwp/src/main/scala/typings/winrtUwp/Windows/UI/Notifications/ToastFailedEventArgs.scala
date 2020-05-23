package typings.winrtUwp.Windows.UI.Notifications

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the error code that was generated in the process of raising a toast notification. */
trait ToastFailedEventArgs extends js.Object {
  /** Gets the error code that was generated in the process of raising a toast notification. */
  var errorCode: WinRTError
}

object ToastFailedEventArgs {
  @scala.inline
  def apply(errorCode: WinRTError): ToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastFailedEventArgs]
  }
}

