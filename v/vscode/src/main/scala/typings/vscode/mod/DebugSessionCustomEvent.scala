package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSessionCustomEvent extends StObject {
  
  /**
    * Event specific information.
    */
  val body: js.UndefOr[js.Any] = js.native
  
  /**
    * Type of event.
    */
  val event: String = js.native
  
  /**
    * The [debug session](#DebugSession) for which the custom event was received.
    */
  val session: DebugSession = js.native
}
object DebugSessionCustomEvent {
  
  @scala.inline
  def apply(event: String, session: DebugSession): DebugSessionCustomEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSessionCustomEvent]
  }
  
  @scala.inline
  implicit class DebugSessionCustomEventMutableBuilder[Self <: DebugSessionCustomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: DebugSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
