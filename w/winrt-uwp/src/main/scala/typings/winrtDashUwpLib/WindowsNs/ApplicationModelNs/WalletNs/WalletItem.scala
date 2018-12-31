package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an item (data) that is stored in the wallet. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletItem")
@js.native
class WalletItem protected () extends js.Object {
  /**
    * Initializes a new instance of the WalletItem class.
    * @param kind The type of wallet item.
    * @param displayName The display name of the item.
    */
  def this(kind: WalletItemKind, displayName: java.lang.String) = this()
  /** Gets or sets the barcode that's representative of the wallet item. */
  var barcode: WalletBarcode = js.native
  /** Gets or sets the background image of the body of the wallet item (uses a stream). */
  var bodyBackgroundImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the body color of the wallet item. */
  var bodyColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets or sets the body font color of the wallet item. */
  var bodyFontColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets or sets a string that appears next to the app name in About info. */
  var displayMessage: java.lang.String = js.native
  /** Gets or sets the name or title to be displayed to the user. */
  var displayName: java.lang.String = js.native
  /** Gets the collection of WalletItemCustomProperty objects associated with the wallet item. */
  var displayProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, WalletItemCustomProperty] = js.native
  /** Gets or sets the expiration date of the wallet item. */
  var expirationDate: stdLib.Date = js.native
  /** Gets or sets the header background image of the wallet item. */
  var headerBackgroundImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the header color of the wallet item. */
  var headerColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets or sets the header font color of the wallet item. */
  var headerFontColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets the unique identifier of the wallet item. */
  var id: java.lang.String = js.native
  /** Gets or sets whether this item is acknowledged by the app. */
  var isAcknowledged: scala.Boolean = js.native
  /** Gets or sets whether to launch your app when the user taps on the DisplayMessage . */
  var isDisplayMessageLaunchable: scala.Boolean = js.native
  /** Gets or sets whether your app should be launched when the user taps "see more transaction history". */
  var isMoreTransactionHistoryLaunchable: scala.Boolean = js.native
  /** Gets or sets the issuer name of the wallet item. */
  var issuerDisplayName: java.lang.String = js.native
  /** Gets the type of the wallet item. */
  var kind: WalletItemKind = js.native
  /** Gets or sets the date and time the data for this item was last updated. */
  var lastUpdated: stdLib.Date = js.native
  /** Gets or sets the medium (159 x 159) logo image of the wallet item. */
  var logo159x159: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the large (336 x 336) logo image of the wallet item. */
  var logo336x336: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the small (99 x 99) logo image of the wallet item. */
  var logo99x99: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the logo image of the wallet item. */
  var logoImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the logo text of the wallet item. */
  var logoText: java.lang.String = js.native
  /** Gets or sets the promotional image of the wallet item. */
  var promotionalImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the date on which the item is valid. */
  var relevantDate: stdLib.Date = js.native
  /** Gets or sets the description of the relevant date of the wallet item. */
  var relevantDateDisplayMessage: java.lang.String = js.native
  /** Gets a collection of all relevant locations for the wallet item. */
  var relevantLocations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, WalletRelevantLocation] = js.native
  /** Gets the transaction history collection of the wallet item. */
  var transactionHistory: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, WalletTransaction] = js.native
  /** Gets the collection of WalletVerb objects associated with the wallet item. */
  var verbs: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, WalletVerb] = js.native
}

