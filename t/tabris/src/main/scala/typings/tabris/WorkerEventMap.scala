package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerEventMap extends StObject {
  
  var error: Event
  
  var message: MessageEvent
  
  var messageerror: Event
}
object WorkerEventMap {
  
  inline def apply(error: Event, message: MessageEvent, messageerror: Event): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
  
  extension [Self <: WorkerEventMap](x: Self) {
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: Event): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
