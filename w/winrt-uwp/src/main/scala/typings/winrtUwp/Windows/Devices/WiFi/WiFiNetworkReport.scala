package typings.winrtUwp.Windows.Devices.WiFi

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result of a network scan operation. */
@js.native
trait WiFiNetworkReport extends js.Object {
  /** A list of available networks. */
  var availableNetworks: IVectorView[WiFiAvailableNetwork] = js.native
  /** Contains the result of a network scan operation. */
  var timestamp: Date = js.native
}

object WiFiNetworkReport {
  @scala.inline
  def apply(availableNetworks: IVectorView[WiFiAvailableNetwork], timestamp: Date): WiFiNetworkReport = {
    val __obj = js.Dynamic.literal(availableNetworks = availableNetworks.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiNetworkReport]
  }
  @scala.inline
  implicit class WiFiNetworkReportOps[Self <: WiFiNetworkReport] (val x: Self) extends AnyVal {
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
    def setAvailableNetworks(value: IVectorView[WiFiAvailableNetwork]): Self = this.set("availableNetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

