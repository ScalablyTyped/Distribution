package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceInformation")
@js.native
abstract class MobileBroadbandDeviceServiceInformation () extends js.Object {
  /** Gets the unique device service identifier for the mobile broadband device. */
  var deviceServiceId: java.lang.String = js.native
  /** Determines if the mobile broadband device service is able to read data. */
  var isDataReadSupported: scala.Boolean = js.native
  /** Determines if the mobile broadband device service is able to write data. */
  var isDataWriteSupported: scala.Boolean = js.native
}

