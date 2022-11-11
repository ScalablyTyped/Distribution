package typings.traceEventLib

import typings.traceEventLib.distSchemaEventsEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsEventWithStackMod {
  
  trait EventWithStack
    extends StObject
       with Event {
    
    /**
      * An id for a stackFrame object in {@see TraceEventJSONObject#stackFrames}
      */
    var sf: js.UndefOr[Double] = js.undefined
    
    /**
      * A stack is just an array of strings.
      * Mutually exclusive with {@link DurationEvent#sf} property.
      * The 0th item in the array is the rootmost part of the callstack, the last item is the leafmost entry in the stack,
      * e.g. the closest to what was running when the event was issued.
      * You can put anything you want in each trace, but strings in hex form ("0x1234")
      * are treated as program counter addresses and are eligible for symbolization.
      *
      * @example ["0x1", "0x2"]
      */
    var stack: js.UndefOr[js.Array[String]] = js.undefined
  }
  object EventWithStack {
    
    inline def apply(ph: String, pid: Double, tid: Double, ts: Double): EventWithStack = {
      val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventWithStack]
    }
    
    extension [Self <: EventWithStack](x: Self) {
      
      inline def setSf(value: Double): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
      
      inline def setSfUndefined: Self = StObject.set(x, "sf", js.undefined)
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
}
