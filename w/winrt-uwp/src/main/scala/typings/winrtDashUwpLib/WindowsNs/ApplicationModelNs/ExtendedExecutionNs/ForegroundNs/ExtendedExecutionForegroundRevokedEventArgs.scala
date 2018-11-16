package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Passed to the event handler that is invoked when the system revokes extended execution. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedEventArgs")
@js.native
abstract class ExtendedExecutionForegroundRevokedEventArgs () extends js.Object {
  /** Gets the reason extended execution was revoked. */
  var reason: ExtendedExecutionForegroundRevokedReason = js.native
}

