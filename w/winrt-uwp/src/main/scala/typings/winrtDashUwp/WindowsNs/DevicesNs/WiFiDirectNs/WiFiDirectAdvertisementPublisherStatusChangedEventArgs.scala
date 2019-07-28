package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs")
@js.native
abstract class WiFiDirectAdvertisementPublisherStatusChangedEventArgs () extends js.Object {
  /** Gets the error status for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
  var error: WiFiDirectError = js.native
  /** Gets the new status of the WiFiDirectAdvertisementPublisher . */
  var status: WiFiDirectAdvertisementPublisherStatus = js.native
}

