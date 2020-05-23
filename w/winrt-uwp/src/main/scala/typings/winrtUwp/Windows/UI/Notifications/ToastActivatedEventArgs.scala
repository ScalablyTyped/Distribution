package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes a method that retrieves the arguments associated with a toast action initiated by the user. This lets the app tell which action was taken when multiple actions were exposed. */
trait ToastActivatedEventArgs extends js.Object {
  /** Gets the arguments associated with a toast action initiated by the user. This arguments string was included in the toast's XML payload. */
  var arguments: String
}

object ToastActivatedEventArgs {
  @scala.inline
  def apply(arguments: String): ToastActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastActivatedEventArgs]
  }
}

