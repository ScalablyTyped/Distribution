package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a custom property on a wallet item. Apps can show data in the details view or back of card view of the item. */
trait WalletItemCustomProperty extends StObject {
  
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
  
  @scala.inline
  implicit class WalletItemCustomPropertyMutableBuilder[Self <: WalletItemCustomProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDetectLinks(value: Boolean): Self = StObject.set(x, "autoDetectLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailViewPosition(value: WalletDetailViewPosition): Self = StObject.set(x, "detailViewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryViewPosition(value: WalletSummaryViewPosition): Self = StObject.set(x, "summaryViewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
