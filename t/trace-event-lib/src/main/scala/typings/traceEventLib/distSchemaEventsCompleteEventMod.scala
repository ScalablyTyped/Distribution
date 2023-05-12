package typings.traceEventLib

import typings.traceEventLib.distSchemaEventsEventWithStackMod.EventWithStack
import typings.traceEventLib.distSchemaEventsTraceEventMod.TraceEvent
import typings.traceEventLib.traceEventLibStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsCompleteEventMod {
  
  trait CompleteEvent
    extends StObject
       with EventWithStack
       with TraceEvent {
    
    /** @inheritDoc */
    @JSName("cat")
    var cat_CompleteEvent: String
    
    /**
      * Specifies the tracing clock duration of complete events in microseconds.
      */
    var dur: Double
    
    /**
      * Similar to {@link EventWithStack#sf}, but it specifies the end stack trace of the event instead.
      * Mutually exclusive with {@link #estack}.
      */
    var esf: js.UndefOr[Double] = js.undefined
    
    /**
      * Similar to {@link EventWithStack#stack}, but it specifies the end stack trace of the event instead.
      * Mutually exclusive with {@link #esf}.
      */
    var estack: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @inheritDoc */
    @JSName("name")
    var name_CompleteEvent: String
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_CompleteEvent: X
    
    /**
      * Specifies the thread clock duration of complete events in microseconds.
      */
    var tdur: js.UndefOr[Double] = js.undefined
  }
  object CompleteEvent {
    
    inline def apply(cat: String, dur: Double, name: String, pid: Double, tid: Double, ts: Double): CompleteEvent = {
      val __obj = js.Dynamic.literal(cat = cat.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ph = "X", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompleteEvent] (val x: Self) extends AnyVal {
      
      inline def setCat(value: String): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      inline def setEsf(value: Double): Self = StObject.set(x, "esf", value.asInstanceOf[js.Any])
      
      inline def setEsfUndefined: Self = StObject.set(x, "esf", js.undefined)
      
      inline def setEstack(value: js.Array[String]): Self = StObject.set(x, "estack", value.asInstanceOf[js.Any])
      
      inline def setEstackUndefined: Self = StObject.set(x, "estack", js.undefined)
      
      inline def setEstackVarargs(value: String*): Self = StObject.set(x, "estack", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPh(value: X): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
      
      inline def setTdur(value: Double): Self = StObject.set(x, "tdur", value.asInstanceOf[js.Any])
      
      inline def setTdurUndefined: Self = StObject.set(x, "tdur", js.undefined)
    }
  }
}
