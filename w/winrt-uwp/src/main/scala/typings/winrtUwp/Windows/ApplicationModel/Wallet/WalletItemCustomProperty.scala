package typings.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a custom property on a wallet item. Apps can show data in the details view or back of card view of the item. */
trait WalletItemCustomProperty extends js.Object {
  /** Gets or sets whether this WalletItemCustomProperty is entity-extracted and actionable upon display. */
  var autoDetectLinks: Boolean
  /** Gets or sets the optional position of this property when shown in the wallet item's detail view. */
  var detailViewPosition: WalletDetailViewPosition
  /** Gets or sets the custom property label. */
  var name: String
  /** Gets or sets the optional position of this property when shown in the summary view for a wallet item. */
  var summaryViewPosition: WalletSummaryViewPosition
  /** Gets or sets the custom property value. */
  var value: String
}

object WalletItemCustomProperty {
  @scala.inline
  def apply(
    autoDetectLinks: Boolean,
    detailViewPosition: WalletDetailViewPosition,
    name: String,
    summaryViewPosition: WalletSummaryViewPosition,
    value: String
  ): WalletItemCustomProperty = {
    val __obj = js.Dynamic.literal(autoDetectLinks = autoDetectLinks.asInstanceOf[js.Any], detailViewPosition = detailViewPosition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summaryViewPosition = summaryViewPosition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletItemCustomProperty]
  }
}

