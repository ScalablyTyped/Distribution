package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents relevant location data for a wallet item. */
trait WalletRelevantLocation extends js.Object {
  /** Gets or sets the message associated with a relevant location. */
  var displayMessage: String
  /** Gets or sets the basic geographic position information of the location. */
  var position: BasicGeoposition
}

object WalletRelevantLocation {
  @scala.inline
  def apply(displayMessage: String, position: BasicGeoposition): WalletRelevantLocation = {
    val __obj = js.Dynamic.literal(displayMessage = displayMessage.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletRelevantLocation]
  }
}

