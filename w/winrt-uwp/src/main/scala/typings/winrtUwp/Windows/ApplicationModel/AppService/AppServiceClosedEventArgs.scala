package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
trait AppServiceClosedEventArgs extends js.Object {
  /** Gets the status that was set when the endpoint for the app service was closed. */
  var status: AppServiceClosedStatus
}

object AppServiceClosedEventArgs {
  @scala.inline
  def apply(status: AppServiceClosedStatus): AppServiceClosedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppServiceClosedEventArgs]
  }
}

