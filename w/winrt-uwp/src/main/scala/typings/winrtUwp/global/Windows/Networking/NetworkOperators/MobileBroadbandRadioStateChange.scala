package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a radio state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange")
@js.native
abstract class MobileBroadbandRadioStateChange ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange {
  /** Gets the device ID of the device whose radio state changed. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the new state of the radio. */
  /* CompleteClass */
  override var radioState: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandRadioState = js.native
}

