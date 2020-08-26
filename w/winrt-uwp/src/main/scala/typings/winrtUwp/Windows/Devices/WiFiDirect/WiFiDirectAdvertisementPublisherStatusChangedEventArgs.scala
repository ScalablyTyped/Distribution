package typings.winrtUwp.Windows.Devices.WiFiDirect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
@js.native
trait WiFiDirectAdvertisementPublisherStatusChangedEventArgs extends js.Object {
  /** Gets the error status for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
  var error: WiFiDirectError = js.native
  /** Gets the new status of the WiFiDirectAdvertisementPublisher . */
  var status: WiFiDirectAdvertisementPublisherStatus = js.native
}

object WiFiDirectAdvertisementPublisherStatusChangedEventArgs {
  @scala.inline
  def apply(error: WiFiDirectError, status: WiFiDirectAdvertisementPublisherStatus): WiFiDirectAdvertisementPublisherStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectAdvertisementPublisherStatusChangedEventArgs]
  }
  @scala.inline
  implicit class WiFiDirectAdvertisementPublisherStatusChangedEventArgsOps[Self <: WiFiDirectAdvertisementPublisherStatusChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setError(value: WiFiDirectError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: WiFiDirectAdvertisementPublisherStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

