package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureSubscription extends StObject {
  
  var displayName: String
  
  var subscriptionId: String
  
  var subscriptionTenantId: String
  
  var subscriptionTenantName: String
}
object AzureSubscription {
  
  inline def apply(
    displayName: String,
    subscriptionId: String,
    subscriptionTenantId: String,
    subscriptionTenantName: String
  ): AzureSubscription = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any], subscriptionTenantId = subscriptionTenantId.asInstanceOf[js.Any], subscriptionTenantName = subscriptionTenantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureSubscription] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTenantId(value: String): Self = StObject.set(x, "subscriptionTenantId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTenantName(value: String): Self = StObject.set(x, "subscriptionTenantName", value.asInstanceOf[js.Any])
  }
}
