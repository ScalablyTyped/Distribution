package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to access information specific to a WLAN connection. */
@js.native
trait WlanConnectionProfileDetails extends js.Object {
  /**
    * Retrieves the Service Set Identifier (SSID) for a WLAN connection.
    * @return The service set identifier (SSID).
    */
  def getConnectedSsid(): String = js.native
}

object WlanConnectionProfileDetails {
  @scala.inline
  def apply(getConnectedSsid: () => String): WlanConnectionProfileDetails = {
    val __obj = js.Dynamic.literal(getConnectedSsid = js.Any.fromFunction0(getConnectedSsid))
    __obj.asInstanceOf[WlanConnectionProfileDetails]
  }
  @scala.inline
  implicit class WlanConnectionProfileDetailsOps[Self <: WlanConnectionProfileDetails] (val x: Self) extends AnyVal {
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
    def setGetConnectedSsid(value: () => String): Self = this.set("getConnectedSsid", js.Any.fromFunction0(value))
  }
  
}

