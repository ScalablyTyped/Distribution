package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceClosedEventArgs")
@js.native
abstract class AppServiceClosedEventArgs () extends js.Object {
  /** Gets the status that was set when the endpoint for the app service was closed. */
  var status: AppServiceClosedStatus = js.native
}

