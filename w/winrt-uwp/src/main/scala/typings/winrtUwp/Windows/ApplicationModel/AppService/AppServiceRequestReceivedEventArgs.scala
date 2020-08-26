package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
@js.native
trait AppServiceRequestReceivedEventArgs extends js.Object {
  /** Gets the request that was received from the app service. */
  var request: AppServiceRequest = js.native
  /**
    * Informs the system that the event handler might continue to perform work after the event handler returns.
    * @return The deferral.
    */
  def getDeferral(): AppServiceDeferral = js.native
}

object AppServiceRequestReceivedEventArgs {
  @scala.inline
  def apply(getDeferral: () => AppServiceDeferral, request: AppServiceRequest): AppServiceRequestReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceRequestReceivedEventArgs]
  }
  @scala.inline
  implicit class AppServiceRequestReceivedEventArgsOps[Self <: AppServiceRequestReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => AppServiceDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setRequest(value: AppServiceRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

