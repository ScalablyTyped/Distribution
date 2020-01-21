package typings.winrtUwp.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes a method that retrieves the arguments associated with a toast action initiated by the user. This lets the app tell which action was taken when multiple actions were exposed. */
@JSGlobal("Windows.UI.Notifications.ToastActivatedEventArgs")
@js.native
abstract class ToastActivatedEventArgs () extends js.Object {
  /** Gets the arguments associated with a toast action initiated by the user. This arguments string was included in the toast's XML payload. */
  var arguments: String = js.native
}

