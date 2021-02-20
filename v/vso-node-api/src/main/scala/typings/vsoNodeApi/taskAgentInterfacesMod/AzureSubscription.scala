package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureSubscription extends StObject {
  
  var displayName: String = js.native
  
  var subscriptionId: String = js.native
  
  var subscriptionTenantId: String = js.native
  
  var subscriptionTenantName: String = js.native
}
object AzureSubscription {
  
  @scala.inline
  def apply(
    displayName: String,
    subscriptionId: String,
    subscriptionTenantId: String,
    subscriptionTenantName: String
  ): AzureSubscription = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any], subscriptionTenantId = subscriptionTenantId.asInstanceOf[js.Any], subscriptionTenantName = subscriptionTenantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
  
  @scala.inline
  implicit class AzureSubscriptionMutableBuilder[Self <: AzureSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionTenantId(value: String): Self = StObject.set(x, "subscriptionTenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionTenantName(value: String): Self = StObject.set(x, "subscriptionTenantName", value.asInstanceOf[js.Any])
  }
}
