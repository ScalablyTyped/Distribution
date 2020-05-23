package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a DataReceived event on a MobileBroadbandDeviceServiceDataSession when data is received . */
trait MobileBroadbandDeviceServiceDataReceivedEventArgs extends js.Object {
  /** Gets the data received on the MobileBroadbandDeviceServiceDataSession . */
  var receivedData: IBuffer
}

object MobileBroadbandDeviceServiceDataReceivedEventArgs {
  @scala.inline
  def apply(receivedData: IBuffer): MobileBroadbandDeviceServiceDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(receivedData = receivedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceDataReceivedEventArgs]
  }
}

