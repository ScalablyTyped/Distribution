package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryPreferencesEditable extends StObject {
  
  var deliveryPreferencesEditable: scala.Double
  
  var isGroup: scala.Double
  
  var isTeam: scala.Double
  
  var isUser: scala.Double
  
  var none: scala.Double
  
  var supportsEachMemberDelivery: scala.Double
  
  var supportsNoDelivery: scala.Double
  
  var supportsPreferredEmailAddressDelivery: scala.Double
}
object DeliveryPreferencesEditable {
  
  @scala.inline
  def apply(
    deliveryPreferencesEditable: scala.Double,
    isGroup: scala.Double,
    isTeam: scala.Double,
    isUser: scala.Double,
    none: scala.Double,
    supportsEachMemberDelivery: scala.Double,
    supportsNoDelivery: scala.Double,
    supportsPreferredEmailAddressDelivery: scala.Double
  ): DeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal(deliveryPreferencesEditable = deliveryPreferencesEditable.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isTeam = isTeam.asInstanceOf[js.Any], isUser = isUser.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], supportsEachMemberDelivery = supportsEachMemberDelivery.asInstanceOf[js.Any], supportsNoDelivery = supportsNoDelivery.asInstanceOf[js.Any], supportsPreferredEmailAddressDelivery = supportsPreferredEmailAddressDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryPreferencesEditable]
  }
  
  @scala.inline
  implicit class DeliveryPreferencesEditableMutableBuilder[Self <: DeliveryPreferencesEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryPreferencesEditable(value: scala.Double): Self = StObject.set(x, "deliveryPreferencesEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroup(value: scala.Double): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTeam(value: scala.Double): Self = StObject.set(x, "isTeam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUser(value: scala.Double): Self = StObject.set(x, "isUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsEachMemberDelivery(value: scala.Double): Self = StObject.set(x, "supportsEachMemberDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsNoDelivery(value: scala.Double): Self = StObject.set(x, "supportsNoDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPreferredEmailAddressDelivery(value: scala.Double): Self = StObject.set(x, "supportsPreferredEmailAddressDelivery", value.asInstanceOf[js.Any])
  }
}
