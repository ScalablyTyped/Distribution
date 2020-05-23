package typings.winrtUwp.Windows.Devices.WiFiDirect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
trait WiFiDirectAdvertisementPublisherStatusChangedEventArgs extends js.Object {
  /** Gets the error status for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
  var error: WiFiDirectError
  /** Gets the new status of the WiFiDirectAdvertisementPublisher . */
  var status: WiFiDirectAdvertisementPublisherStatus
}

object WiFiDirectAdvertisementPublisherStatusChangedEventArgs {
  @scala.inline
  def apply(error: WiFiDirectError, status: WiFiDirectAdvertisementPublisherStatus): WiFiDirectAdvertisementPublisherStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectAdvertisementPublisherStatusChangedEventArgs]
  }
}

