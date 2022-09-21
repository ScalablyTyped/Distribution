package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.exited
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.started
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  /** The reason for the event.
  				Values: 'started', 'exited', etc.
  			*/
  var reason: started | exited | String
  
  /** The identifier of the thread. */
  var threadId: Double
}
object Reason {
  
  inline def apply(reason: started | exited | String, threadId: Double): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  extension [Self <: Reason](x: Self) {
    
    inline def setReason(value: started | exited | String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
