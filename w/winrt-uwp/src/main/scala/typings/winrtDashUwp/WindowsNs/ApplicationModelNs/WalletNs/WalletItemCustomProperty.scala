package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.WalletNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a custom property on a wallet item. Apps can show data in the details view or back of card view of the item. */
@JSGlobal("Windows.ApplicationModel.Wallet.WalletItemCustomProperty")
@js.native
class WalletItemCustomProperty protected () extends js.Object {
  /**
    * Initializes a new instance of the WalletItemCustomProperty class.
    * @param name The custom property label. Sets the initial Name value.
    * @param value The value of the property. Sets the initial Value value.
    */
  def this(name: String, value: String) = this()
  /** Gets or sets whether this WalletItemCustomProperty is entity-extracted and actionable upon display. */
  var autoDetectLinks: Boolean = js.native
  /** Gets or sets the optional position of this property when shown in the wallet item's detail view. */
  var detailViewPosition: WalletDetailViewPosition = js.native
  /** Gets or sets the custom property label. */
  var name: String = js.native
  /** Gets or sets the optional position of this property when shown in the summary view for a wallet item. */
  var summaryViewPosition: WalletSummaryViewPosition = js.native
  /** Gets or sets the custom property value. */
  var value: String = js.native
}

