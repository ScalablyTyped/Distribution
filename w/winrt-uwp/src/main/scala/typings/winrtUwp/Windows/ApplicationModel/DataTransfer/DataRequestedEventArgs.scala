package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the DataRequested event. The system fires this event when the user invokes the Share UI. */
trait DataRequestedEventArgs extends js.Object {
  /** Enables you to get the DataRequest object and either give it data or a failure message. */
  var request: DataRequest
}

object DataRequestedEventArgs {
  @scala.inline
  def apply(request: DataRequest): DataRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequestedEventArgs]
  }
}

