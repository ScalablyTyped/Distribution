package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
trait AppServiceRequestReceivedEventArgs extends js.Object {
  /** Gets the request that was received from the app service. */
  var request: AppServiceRequest
  /**
    * Informs the system that the event handler might continue to perform work after the event handler returns.
    * @return The deferral.
    */
  def getDeferral(): AppServiceDeferral
}

object AppServiceRequestReceivedEventArgs {
  @scala.inline
  def apply(getDeferral: () => AppServiceDeferral, request: AppServiceRequest): AppServiceRequestReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceRequestReceivedEventArgs]
  }
}

