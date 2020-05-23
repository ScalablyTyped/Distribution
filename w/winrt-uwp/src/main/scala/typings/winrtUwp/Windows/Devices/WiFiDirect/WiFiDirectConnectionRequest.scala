package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
trait WiFiDirectConnectionRequest extends js.Object {
  /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
  var deviceInformation: DeviceInformation
  /** Closes the WiFiDirectConnectionRequest object. */
  def close(): Unit
}

object WiFiDirectConnectionRequest {
  @scala.inline
  def apply(close: () => Unit, deviceInformation: DeviceInformation): WiFiDirectConnectionRequest = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceInformation = deviceInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectConnectionRequest]
  }
}

