package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents relevant location data for a wallet item. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletRelevantLocation")
@js.native
/** Initializes a new instance of the WalletRelevantLocation class. */
class WalletRelevantLocation () extends js.Object {
  /** Gets or sets the message associated with a relevant location. */
  var displayMessage: java.lang.String = js.native
  /** Gets or sets the basic geographic position information of the location. */
  var position: winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.BasicGeoposition = js.native
}

