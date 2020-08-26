package typings.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastFailedEventArgs extends IToastFailedEventArgs

object ToastFailedEventArgs {
  @scala.inline
  def apply(errorCode: Double): ToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastFailedEventArgs]
  }
}

