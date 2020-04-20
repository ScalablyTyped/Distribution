package typings.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastFailedEventArgs extends js.Object {
  var errorCode: Double
}

object IToastFailedEventArgs {
  @scala.inline
  def apply(errorCode: Double): IToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastFailedEventArgs]
  }
}

