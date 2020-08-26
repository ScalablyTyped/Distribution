package typings.winrtUwp.Windows.Devices.WiFi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the results of an attempt to connect to a Wi-Fi network. */
@js.native
trait WiFiConnectionResult extends js.Object {
  /** Gets the connection result value. */
  var connectionStatus: WiFiConnectionStatus = js.native
}

object WiFiConnectionResult {
  @scala.inline
  def apply(connectionStatus: WiFiConnectionStatus): WiFiConnectionResult = {
    val __obj = js.Dynamic.literal(connectionStatus = connectionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiConnectionResult]
  }
  @scala.inline
  implicit class WiFiConnectionResultOps[Self <: WiFiConnectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionStatus(value: WiFiConnectionStatus): Self = this.set("connectionStatus", value.asInstanceOf[js.Any])
  }
  
}

