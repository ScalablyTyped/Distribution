package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorPlatformEvent
  extends StObject
     with EventObject {
  
  var data: Any
}
object ErrorPlatformEvent {
  
  inline def apply(data: Any, `type`: String): ErrorPlatformEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPlatformEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorPlatformEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
