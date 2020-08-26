package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
@js.native
trait AppServiceClosedEventArgs extends js.Object {
  /** Gets the status that was set when the endpoint for the app service was closed. */
  var status: AppServiceClosedStatus = js.native
}

object AppServiceClosedEventArgs {
  @scala.inline
  def apply(status: AppServiceClosedStatus): AppServiceClosedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceClosedEventArgs]
  }
  @scala.inline
  implicit class AppServiceClosedEventArgsOps[Self <: AppServiceClosedEventArgs] (val x: Self) extends AnyVal {
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
    def setStatus(value: AppServiceClosedStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

