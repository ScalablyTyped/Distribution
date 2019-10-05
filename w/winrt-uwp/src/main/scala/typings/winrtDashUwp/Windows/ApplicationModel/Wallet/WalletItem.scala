package typings.winrtDashUwp.Windows.ApplicationModel.Wallet

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtDashUwp.Windows.UI.Color
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
  def this(kind: WalletItemKind, displayName: String) = this()
  /** Gets or sets the barcode that's representative of the wallet item. */
  var barcode: WalletBarcode = js.native
  /** Gets or sets the background image of the body of the wallet item (uses a stream). */
  var bodyBackgroundImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the body color of the wallet item. */
  var bodyColor: Color = js.native
  /** Gets or sets the body font color of the wallet item. */
  var bodyFontColor: Color = js.native
  /** Gets or sets a string that appears next to the app name in About info. */
  var displayMessage: String = js.native
  /** Gets or sets the name or title to be displayed to the user. */
  var displayName: String = js.native
  /** Gets the collection of WalletItemCustomProperty objects associated with the wallet item. */
  var displayProperties: IMap[String, WalletItemCustomProperty] = js.native
  /** Gets or sets the expiration date of the wallet item. */
  var expirationDate: Date = js.native
  /** Gets or sets the header background image of the wallet item. */
  var headerBackgroundImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the header color of the wallet item. */
  var headerColor: Color = js.native
  /** Gets or sets the header font color of the wallet item. */
  var headerFontColor: Color = js.native
  /** Gets the unique identifier of the wallet item. */
  var id: String = js.native
  /** Gets or sets whether this item is acknowledged by the app. */
  var isAcknowledged: Boolean = js.native
  /** Gets or sets whether to launch your app when the user taps on the DisplayMessage . */
  var isDisplayMessageLaunchable: Boolean = js.native
  /** Gets or sets whether your app should be launched when the user taps "see more transaction history". */
  var isMoreTransactionHistoryLaunchable: Boolean = js.native
  /** Gets or sets the issuer name of the wallet item. */
  var issuerDisplayName: String = js.native
  /** Gets the type of the wallet item. */
  var kind: WalletItemKind = js.native
  /** Gets or sets the date and time the data for this item was last updated. */
  var lastUpdated: Date = js.native
  /** Gets or sets the medium (159 x 159) logo image of the wallet item. */
  var logo159x159: IRandomAccessStreamReference = js.native
  /** Gets or sets the large (336 x 336) logo image of the wallet item. */
  var logo336x336: IRandomAccessStreamReference = js.native
  /** Gets or sets the small (99 x 99) logo image of the wallet item. */
  var logo99x99: IRandomAccessStreamReference = js.native
  /** Gets or sets the logo image of the wallet item. */
  var logoImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the logo text of the wallet item. */
  var logoText: String = js.native
  /** Gets or sets the promotional image of the wallet item. */
  var promotionalImage: IRandomAccessStreamReference = js.native
  /** Gets or sets the date on which the item is valid. */
  var relevantDate: Date = js.native
  /** Gets or sets the description of the relevant date of the wallet item. */
  var relevantDateDisplayMessage: String = js.native
  /** Gets a collection of all relevant locations for the wallet item. */
  var relevantLocations: IMap[String, WalletRelevantLocation] = js.native
  /** Gets the transaction history collection of the wallet item. */
  var transactionHistory: IMap[String, WalletTransaction] = js.native
  /** Gets the collection of WalletVerb objects associated with the wallet item. */
  var verbs: IMap[String, WalletVerb] = js.native
}

