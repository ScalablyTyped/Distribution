package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugSessionCustomEvent extends StObject {
  
  /**
  		 * Event specific information.
  		 */
  val body: Any
  
  /**
  		 * Type of event.
  		 */
  val event: String
  
  /**
  		 * The {@link DebugSession debug session} for which the custom event was received.
  		 */
  val session: DebugSession
}
object DebugSessionCustomEvent {
  
  inline def apply(body: Any, event: String, session: DebugSession): DebugSessionCustomEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSessionCustomEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugSessionCustomEvent] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setSession(value: DebugSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
