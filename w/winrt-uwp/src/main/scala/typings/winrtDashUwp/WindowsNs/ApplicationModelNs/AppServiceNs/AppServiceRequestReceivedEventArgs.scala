package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
@JSGlobal("Windows.ApplicationModel.AppService.AppServiceRequestReceivedEventArgs")
@js.native
abstract class AppServiceRequestReceivedEventArgs () extends js.Object {
  /** Gets the request that was received from the app service. */
  var request: AppServiceRequest = js.native
  /**
    * Informs the system that the event handler might continue to perform work after the event handler returns.
    * @return The deferral.
    */
  def getDeferral(): AppServiceDeferral = js.native
}

