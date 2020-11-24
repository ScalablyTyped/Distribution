package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSessionCustomEvent extends js.Object {
  
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
  implicit class DebugSessionCustomEventOps[Self <: DebugSessionCustomEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: DebugSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
}
