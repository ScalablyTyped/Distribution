package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresenceResponse extends StObject {
  
  /**
    * The connectivity type of the presence.
    */
  val connectivityType: ConnectivityType
  
  /**
    * The host address of the presence.
    */
  val hostAddress: String
  
  /**
    * The resource type of the presence.
    */
  val resourceType: ResourceType | Null
  
  /**
    * The results type of presence.
    */
  val resultType: PresenceResponseResultType
  
  /**
    * The trigger type of presence. It is set only if a response result type is "OK".
    */
  val triggerType: PresenceTriggerType | Null
}
object PresenceResponse {
  
  inline def apply(connectivityType: ConnectivityType, hostAddress: String, resultType: PresenceResponseResultType): PresenceResponse = {
    val __obj = js.Dynamic.literal(connectivityType = connectivityType.asInstanceOf[js.Any], hostAddress = hostAddress.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any], resourceType = null, triggerType = null)
    __obj.asInstanceOf[PresenceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PresenceResponse] (val x: Self) extends AnyVal {
    
    inline def setConnectivityType(value: ConnectivityType): Self = StObject.set(x, "connectivityType", value.asInstanceOf[js.Any])
    
    inline def setHostAddress(value: String): Self = StObject.set(x, "hostAddress", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResultType(value: PresenceResponseResultType): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    inline def setTriggerType(value: PresenceTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypeNull: Self = StObject.set(x, "triggerType", null)
  }
}
