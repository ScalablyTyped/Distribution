package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network device service notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceTriggerDetails")
@js.native
abstract class MobileBroadbandDeviceServiceTriggerDetails () extends js.Object {
  /** Gets the device ID of the device that triggered a broadband device service event. */
  var deviceId: String = js.native
  /** Gets the device service identifier for the device service trigger event. */
  var deviceServiceId: String = js.native
  /** Gets the received data associated with the triggered event. */
  var receivedData: IBuffer = js.native
}

