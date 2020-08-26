package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an item (data) that is stored in the wallet. */
@js.native
trait WalletItem extends js.Object {
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

object WalletItem {
  @scala.inline
  def apply(
    barcode: WalletBarcode,
    bodyBackgroundImage: IRandomAccessStreamReference,
    bodyColor: Color,
    bodyFontColor: Color,
    displayMessage: String,
    displayName: String,
    displayProperties: IMap[String, WalletItemCustomProperty],
    expirationDate: Date,
    headerBackgroundImage: IRandomAccessStreamReference,
    headerColor: Color,
    headerFontColor: Color,
    id: String,
    isAcknowledged: Boolean,
    isDisplayMessageLaunchable: Boolean,
    isMoreTransactionHistoryLaunchable: Boolean,
    issuerDisplayName: String,
    kind: WalletItemKind,
    lastUpdated: Date,
    logo159x159: IRandomAccessStreamReference,
    logo336x336: IRandomAccessStreamReference,
    logo99x99: IRandomAccessStreamReference,
    logoImage: IRandomAccessStreamReference,
    logoText: String,
    promotionalImage: IRandomAccessStreamReference,
    relevantDate: Date,
    relevantDateDisplayMessage: String,
    relevantLocations: IMap[String, WalletRelevantLocation],
    transactionHistory: IMap[String, WalletTransaction],
    verbs: IMap[String, WalletVerb]
  ): WalletItem = {
    val __obj = js.Dynamic.literal(barcode = barcode.asInstanceOf[js.Any], bodyBackgroundImage = bodyBackgroundImage.asInstanceOf[js.Any], bodyColor = bodyColor.asInstanceOf[js.Any], bodyFontColor = bodyFontColor.asInstanceOf[js.Any], displayMessage = displayMessage.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayProperties = displayProperties.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], headerBackgroundImage = headerBackgroundImage.asInstanceOf[js.Any], headerColor = headerColor.asInstanceOf[js.Any], headerFontColor = headerFontColor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAcknowledged = isAcknowledged.asInstanceOf[js.Any], isDisplayMessageLaunchable = isDisplayMessageLaunchable.asInstanceOf[js.Any], isMoreTransactionHistoryLaunchable = isMoreTransactionHistoryLaunchable.asInstanceOf[js.Any], issuerDisplayName = issuerDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], logo159x159 = logo159x159.asInstanceOf[js.Any], logo336x336 = logo336x336.asInstanceOf[js.Any], logo99x99 = logo99x99.asInstanceOf[js.Any], logoImage = logoImage.asInstanceOf[js.Any], logoText = logoText.asInstanceOf[js.Any], promotionalImage = promotionalImage.asInstanceOf[js.Any], relevantDate = relevantDate.asInstanceOf[js.Any], relevantDateDisplayMessage = relevantDateDisplayMessage.asInstanceOf[js.Any], relevantLocations = relevantLocations.asInstanceOf[js.Any], transactionHistory = transactionHistory.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletItem]
  }
  @scala.inline
  implicit class WalletItemOps[Self <: WalletItem] (val x: Self) extends AnyVal {
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
    def setBarcode(value: WalletBarcode): Self = this.set("barcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBackgroundImage(value: IRandomAccessStreamReference): Self = this.set("bodyBackgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyColor(value: Color): Self = this.set("bodyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFontColor(value: Color): Self = this.set("bodyFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayMessage(value: String): Self = this.set("displayMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayProperties(value: IMap[String, WalletItemCustomProperty]): Self = this.set("displayProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationDate(value: Date): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderBackgroundImage(value: IRandomAccessStreamReference): Self = this.set("headerBackgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderColor(value: Color): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderFontColor(value: Color): Self = this.set("headerFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAcknowledged(value: Boolean): Self = this.set("isAcknowledged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisplayMessageLaunchable(value: Boolean): Self = this.set("isDisplayMessageLaunchable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMoreTransactionHistoryLaunchable(value: Boolean): Self = this.set("isMoreTransactionHistoryLaunchable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuerDisplayName(value: String): Self = this.set("issuerDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: WalletItemKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdated(value: Date): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogo159x159(value: IRandomAccessStreamReference): Self = this.set("logo159x159", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogo336x336(value: IRandomAccessStreamReference): Self = this.set("logo336x336", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogo99x99(value: IRandomAccessStreamReference): Self = this.set("logo99x99", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogoImage(value: IRandomAccessStreamReference): Self = this.set("logoImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogoText(value: String): Self = this.set("logoText", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromotionalImage(value: IRandomAccessStreamReference): Self = this.set("promotionalImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelevantDate(value: Date): Self = this.set("relevantDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelevantDateDisplayMessage(value: String): Self = this.set("relevantDateDisplayMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelevantLocations(value: IMap[String, WalletRelevantLocation]): Self = this.set("relevantLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionHistory(value: IMap[String, WalletTransaction]): Self = this.set("transactionHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbs(value: IMap[String, WalletVerb]): Self = this.set("verbs", value.asInstanceOf[js.Any])
  }
  
}

