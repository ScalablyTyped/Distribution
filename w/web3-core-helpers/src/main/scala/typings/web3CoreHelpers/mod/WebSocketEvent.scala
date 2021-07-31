package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketEvent extends StObject {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object WebSocketEvent {
  
  @scala.inline
  def apply(): WebSocketEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSocketEvent]
  }
  
  @scala.inline
  implicit class WebSocketEventMutableBuilder[Self <: WebSocketEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
