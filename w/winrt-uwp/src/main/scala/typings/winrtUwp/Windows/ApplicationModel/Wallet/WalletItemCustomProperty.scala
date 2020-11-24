package typings.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a custom property on a wallet item. Apps can show data in the details view or back of card view of the item. */
@js.native
trait WalletItemCustomProperty extends js.Object {
  
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
  
  @scala.inline
  implicit class WalletItemCustomPropertyOps[Self <: WalletItemCustomProperty] (val x: Self) extends AnyVal {
    
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
    def setAutoDetectLinks(value: Boolean): Self = this.set("autoDetectLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailViewPosition(value: WalletDetailViewPosition): Self = this.set("detailViewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryViewPosition(value: WalletSummaryViewPosition): Self = this.set("summaryViewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
