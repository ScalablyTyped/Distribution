package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureSubscriptionQueryResult extends StObject {
  
  var errorMessage: String = js.native
  
  var value: js.Array[AzureSubscription] = js.native
}
object AzureSubscriptionQueryResult {
  
  @scala.inline
  def apply(errorMessage: String, value: js.Array[AzureSubscription]): AzureSubscriptionQueryResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscriptionQueryResult]
  }
  
  @scala.inline
  implicit class AzureSubscriptionQueryResultMutableBuilder[Self <: AzureSubscriptionQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[AzureSubscription]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: AzureSubscription*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
