package typings.traceEventLib

import typings.traceEventLib.distSchemaEventsEventMod.Event
import typings.traceEventLib.traceEventLibStrings.C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsCounterEventMod {
  
  trait CounterEvent
    extends StObject
       with Event {
    
    /**
      * Reportedly, counter events do not have categories.
      */
    @JSName("cat")
    var cat_CounterEvent: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * When an id field exists, the combination of the event name and id is used as the counter name.
      */
    var id: js.UndefOr[Double] = js.undefined
    
    /** @inheritDoc */
    @JSName("name")
    var name_CounterEvent: String
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_CounterEvent: C
  }
  object CounterEvent {
    
    inline def apply(name: String, pid: Double, tid: Double, ts: Double): CounterEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "C", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[CounterEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CounterEvent] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPh(value: C): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
}
