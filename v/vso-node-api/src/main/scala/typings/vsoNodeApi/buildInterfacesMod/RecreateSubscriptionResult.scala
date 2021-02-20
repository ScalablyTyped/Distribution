package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecreateSubscriptionResult extends StObject {
  
  var eventType: String = js.native
  
  var repositoryType: String = js.native
}
object RecreateSubscriptionResult {
  
  @scala.inline
  def apply(eventType: String, repositoryType: String): RecreateSubscriptionResult = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecreateSubscriptionResult]
  }
  
  @scala.inline
  implicit class RecreateSubscriptionResultMutableBuilder[Self <: RecreateSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryType(value: String): Self = StObject.set(x, "repositoryType", value.asInstanceOf[js.Any])
  }
}
