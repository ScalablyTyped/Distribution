package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network device service notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceTriggerDetails")
@js.native
abstract class MobileBroadbandDeviceServiceTriggerDetails () extends js.Object {
  /** Gets the device ID of the device that triggered a broadband device service event. */
  var deviceId: java.lang.String = js.native
  /** Gets the device service identifier for the device service trigger event. */
  var deviceServiceId: java.lang.String = js.native
  /** Gets the received data associated with the triggered event. */
  var receivedData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
}

