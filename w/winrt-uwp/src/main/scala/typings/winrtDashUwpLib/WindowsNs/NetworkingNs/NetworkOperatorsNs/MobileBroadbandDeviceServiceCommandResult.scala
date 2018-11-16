package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband device service command. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandResult")
@js.native
abstract class MobileBroadbandDeviceServiceCommandResult () extends js.Object {
  /** Gets the response data from the command execution on a mobile broadband device service. */
  var responseData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the status code of the command execution on a mobile broadband device service. */
  var statusCode: scala.Double = js.native
}

