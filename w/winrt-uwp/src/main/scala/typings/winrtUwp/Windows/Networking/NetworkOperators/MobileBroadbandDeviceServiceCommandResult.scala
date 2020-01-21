package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a mobile broadband device service command. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandResult")
@js.native
abstract class MobileBroadbandDeviceServiceCommandResult () extends js.Object {
  /** Gets the response data from the command execution on a mobile broadband device service. */
  var responseData: IBuffer = js.native
  /** Gets the status code of the command execution on a mobile broadband device service. */
  var statusCode: Double = js.native
}

