package typings.winrtUwp.Windows.Devices.WiFiDirect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionRequested event on a WiFiDirectConnectionListener . */
@js.native
trait WiFiDirectConnectionRequestedEventArgs extends js.Object {
  /**
    * Retrieves the WiFiDirectConnectionRequest received on a ConnectionRequested event by a WiFiDirectConnectionListener .
    * @return The Wi-FI Direct connection request.
    */
  def getConnectionRequest(): WiFiDirectConnectionRequest = js.native
}

object WiFiDirectConnectionRequestedEventArgs {
  @scala.inline
  def apply(getConnectionRequest: () => WiFiDirectConnectionRequest): WiFiDirectConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(getConnectionRequest = js.Any.fromFunction0(getConnectionRequest))
    __obj.asInstanceOf[WiFiDirectConnectionRequestedEventArgs]
  }
  @scala.inline
  implicit class WiFiDirectConnectionRequestedEventArgsOps[Self <: WiFiDirectConnectionRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setGetConnectionRequest(value: () => WiFiDirectConnectionRequest): Self = this.set("getConnectionRequest", js.Any.fromFunction0(value))
  }
  
}

