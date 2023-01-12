package typings.twilsock.mod.Messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Telemetry
  extends StObject
     with AbstractMessage {
  
  var events: js.Array[TelemetryEvent]
  
  val method: MessageType
}
object Telemetry {
  
  inline def apply(events: js.Array[TelemetryEvent], id: String, method: MessageType): Telemetry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Telemetry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Telemetry] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: js.Array[TelemetryEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: TelemetryEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
