package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorPlatformEvent
  extends StObject
     with EventObject {
  
  var data: js.Any
}
object ErrorPlatformEvent {
  
  @scala.inline
  def apply(data: js.Any, `type`: String): ErrorPlatformEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPlatformEvent]
  }
  
  @scala.inline
  implicit class ErrorPlatformEventMutableBuilder[Self <: ErrorPlatformEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
