package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceInformation")
@js.native
abstract class MobileBroadbandDeviceServiceInformation ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceInformation {
  /** Gets the unique device service identifier for the mobile broadband device. */
  /* CompleteClass */
  override var deviceServiceId: String = js.native
  /** Determines if the mobile broadband device service is able to read data. */
  /* CompleteClass */
  override var isDataReadSupported: Boolean = js.native
  /** Determines if the mobile broadband device service is able to write data. */
  /* CompleteClass */
  override var isDataWriteSupported: Boolean = js.native
}

