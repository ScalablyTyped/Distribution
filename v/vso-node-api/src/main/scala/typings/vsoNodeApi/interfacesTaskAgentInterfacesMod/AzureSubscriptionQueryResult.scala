package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureSubscriptionQueryResult extends StObject {
  
  var errorMessage: String
  
  var value: js.Array[AzureSubscription]
}
object AzureSubscriptionQueryResult {
  
  inline def apply(errorMessage: String, value: js.Array[AzureSubscription]): AzureSubscriptionQueryResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscriptionQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureSubscriptionQueryResult] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[AzureSubscription]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: AzureSubscription*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
