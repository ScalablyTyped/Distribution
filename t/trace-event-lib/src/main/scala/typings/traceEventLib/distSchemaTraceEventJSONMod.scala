package typings.traceEventLib

import typings.std.Record
import typings.traceEventLib.distSchemaEventsEventMod.Event
import typings.traceEventLib.distSchemaMiscGlobalSampleMod.GlobalSample
import typings.traceEventLib.distSchemaMiscStackFrameMod.StackFrame
import typings.traceEventLib.distSchemaMiscStackFrameMod.StackFrameId
import typings.traceEventLib.traceEventLibStrings.ms
import typings.traceEventLib.traceEventLibStrings.ns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaTraceEventJSONMod {
  
  type TraceEventJSON = TraceEventJSONArray | TraceEventJSONObject
  
  type TraceEventJSONArray = js.Array[Event]
  
  trait TraceEventJSONObject extends StObject {
    
    /**
      * String that specifies in which unit timestamps should be displayed.
      * @default 'ms'
      */
    var displayTimeUnit: js.UndefOr[ms | ns] = js.undefined
    
    /**
      * Any other properties seen in the object, in this case otherData are assumed to be metadata for the trace.
      * They will be collected and stored in an array in the trace model.
      * This metadata is accessible through the Metadata button in Trace Viewer.
      */
    var otherData: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * String of BattOr power data.
      */
    var powerTraceAsString: js.UndefOr[String] = js.undefined
    
    /**
      * Stores sampling profiler data from a OS level profiler.
      * The stored samples are different from trace event samples, and is meant to augment the traceEvent data with lower level information.
      * It is OK to have a trace event file with just sample data, but in that case {@link TraceEventJSONObject#traceEvents}
      * must still be provided and set to [].
      */
    var samples: js.UndefOr[js.Array[GlobalSample]] = js.undefined
    
    /**
      * Dictionary of stack frames, their ids, and their parents that allows compact representation of stack traces throughout the rest of the trace file.
      * It is optional but sometimes very useful in shrinking file sizes.
      */
    var stackFrames: js.UndefOr[Record[StackFrameId, StackFrame]] = js.undefined
    
    /**
      * String of Linux ftrace data or Windows ETW trace data.
      * This data must start with # tracer: and adhere to the Linux ftrace format or adhere to Windows ETW format.
      * @see http://lwn.net/Articles/365835/
      */
    var systemTraceEvents: js.UndefOr[String] = js.undefined
    
    /**
      * Essentially, an array of event objects. The events do not have to be in timestamp-sorted order.
      */
    var traceEvents: js.Array[Event]
  }
  object TraceEventJSONObject {
    
    inline def apply(traceEvents: js.Array[Event]): TraceEventJSONObject = {
      val __obj = js.Dynamic.literal(traceEvents = traceEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceEventJSONObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraceEventJSONObject] (val x: Self) extends AnyVal {
      
      inline def setDisplayTimeUnit(value: ms | ns): Self = StObject.set(x, "displayTimeUnit", value.asInstanceOf[js.Any])
      
      inline def setDisplayTimeUnitUndefined: Self = StObject.set(x, "displayTimeUnit", js.undefined)
      
      inline def setOtherData(value: Record[String, Any]): Self = StObject.set(x, "otherData", value.asInstanceOf[js.Any])
      
      inline def setOtherDataUndefined: Self = StObject.set(x, "otherData", js.undefined)
      
      inline def setPowerTraceAsString(value: String): Self = StObject.set(x, "powerTraceAsString", value.asInstanceOf[js.Any])
      
      inline def setPowerTraceAsStringUndefined: Self = StObject.set(x, "powerTraceAsString", js.undefined)
      
      inline def setSamples(value: js.Array[GlobalSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setSamplesVarargs(value: GlobalSample*): Self = StObject.set(x, "samples", js.Array(value*))
      
      inline def setStackFrames(value: Record[StackFrameId, StackFrame]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
      
      inline def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
      
      inline def setSystemTraceEvents(value: String): Self = StObject.set(x, "systemTraceEvents", value.asInstanceOf[js.Any])
      
      inline def setSystemTraceEventsUndefined: Self = StObject.set(x, "systemTraceEvents", js.undefined)
      
      inline def setTraceEvents(value: js.Array[Event]): Self = StObject.set(x, "traceEvents", value.asInstanceOf[js.Any])
      
      inline def setTraceEventsVarargs(value: Event*): Self = StObject.set(x, "traceEvents", js.Array(value*))
    }
  }
}
