package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents relevant location data for a wallet item. */
@js.native
trait WalletRelevantLocation extends js.Object {
  /** Gets or sets the message associated with a relevant location. */
  var displayMessage: String = js.native
  /** Gets or sets the basic geographic position information of the location. */
  var position: BasicGeoposition = js.native
}

object WalletRelevantLocation {
  @scala.inline
  def apply(displayMessage: String, position: BasicGeoposition): WalletRelevantLocation = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletRelevantLocation]
  }
  @scala.inline
  implicit class WalletRelevantLocationOps[Self <: WalletRelevantLocation] (val x: Self) extends AnyVal {
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
    def setDisplayMessage(value: String): Self = this.set("displayMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: BasicGeoposition): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

