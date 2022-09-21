package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnqueueAttributes extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var maxQueueSize: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var waitUrl: js.UndefOr[String] = js.undefined
  
  var waitUrlMethod: js.UndefOr[String] = js.undefined
  
  var workflowSid: js.UndefOr[String] = js.undefined
}
object EnqueueAttributes {
  
  inline def apply(): EnqueueAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnqueueAttributes]
  }
  
  extension [Self <: EnqueueAttributes](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMaxQueueSize(value: Double): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
    
    inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setWaitUrl(value: String): Self = StObject.set(x, "waitUrl", value.asInstanceOf[js.Any])
    
    inline def setWaitUrlMethod(value: String): Self = StObject.set(x, "waitUrlMethod", value.asInstanceOf[js.Any])
    
    inline def setWaitUrlMethodUndefined: Self = StObject.set(x, "waitUrlMethod", js.undefined)
    
    inline def setWaitUrlUndefined: Self = StObject.set(x, "waitUrl", js.undefined)
    
    inline def setWorkflowSid(value: String): Self = StObject.set(x, "workflowSid", value.asInstanceOf[js.Any])
    
    inline def setWorkflowSidUndefined: Self = StObject.set(x, "workflowSid", js.undefined)
  }
}
