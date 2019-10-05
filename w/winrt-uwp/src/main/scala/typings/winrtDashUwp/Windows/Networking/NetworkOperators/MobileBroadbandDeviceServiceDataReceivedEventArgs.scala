package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a DataReceived event on a MobileBroadbandDeviceServiceDataSession when data is received . */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataReceivedEventArgs")
@js.native
abstract class MobileBroadbandDeviceServiceDataReceivedEventArgs () extends js.Object {
  /** Gets the data received on the MobileBroadbandDeviceServiceDataSession . */
  var receivedData: IBuffer = js.native
}

