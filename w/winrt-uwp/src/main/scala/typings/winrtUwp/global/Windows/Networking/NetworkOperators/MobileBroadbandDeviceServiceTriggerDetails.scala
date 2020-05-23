package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network device service notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceTriggerDetails")
@js.native
abstract class MobileBroadbandDeviceServiceTriggerDetails ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceTriggerDetails {
  /** Gets the device ID of the device that triggered a broadband device service event. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the device service identifier for the device service trigger event. */
  /* CompleteClass */
  override var deviceServiceId: String = js.native
  /** Gets the received data associated with the triggered event. */
  /* CompleteClass */
  override var receivedData: IBuffer = js.native
}

