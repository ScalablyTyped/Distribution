package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureSubscription extends StObject {
  
  var azureSubscription: scala.Double = js.native
  
  var chef: scala.Double = js.native
  
  var custom: scala.Double = js.native
  
  var generic: scala.Double = js.native
}
object AzureSubscription {
  
  @scala.inline
  def apply(azureSubscription: scala.Double, chef: scala.Double, custom: scala.Double, generic: scala.Double): AzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription.asInstanceOf[js.Any], chef = chef.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
  
  @scala.inline
  implicit class AzureSubscriptionMutableBuilder[Self <: AzureSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAzureSubscription(value: scala.Double): Self = StObject.set(x, "azureSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChef(value: scala.Double): Self = StObject.set(x, "chef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneric(value: scala.Double): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
