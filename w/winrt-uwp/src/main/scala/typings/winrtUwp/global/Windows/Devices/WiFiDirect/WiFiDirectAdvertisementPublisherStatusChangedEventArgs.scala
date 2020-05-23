package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs")
@js.native
abstract class WiFiDirectAdvertisementPublisherStatusChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs {
  /** Gets the error status for a StatusChanged event on a WiFiDirectAdvertisementPublisher . */
  /* CompleteClass */
  override var error: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectError = js.native
  /** Gets the new status of the WiFiDirectAdvertisementPublisher . */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus = js.native
}

