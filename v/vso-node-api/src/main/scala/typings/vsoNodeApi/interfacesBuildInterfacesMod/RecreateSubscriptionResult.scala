package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecreateSubscriptionResult extends StObject {
  
  var eventType: String
  
  var repositoryType: String
}
object RecreateSubscriptionResult {
  
  inline def apply(eventType: String, repositoryType: String): RecreateSubscriptionResult = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecreateSubscriptionResult]
  }
  
  extension [Self <: RecreateSubscriptionResult](x: Self) {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setRepositoryType(value: String): Self = StObject.set(x, "repositoryType", value.asInstanceOf[js.Any])
  }
}
