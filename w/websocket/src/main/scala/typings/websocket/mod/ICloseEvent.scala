package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICloseEvent extends StObject {
  
  var code: Double
  
  var reason: String
  
  var wasClean: Boolean
}
object ICloseEvent {
  
  @scala.inline
  def apply(code: Double, reason: String, wasClean: Boolean): ICloseEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloseEvent]
  }
  
  @scala.inline
  implicit class ICloseEventMutableBuilder[Self <: ICloseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
  }
}
