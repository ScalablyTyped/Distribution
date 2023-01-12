package typings.traceEventLib

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsEventMod {
  
  trait Event extends StObject {
    
    /**
      *  Any arguments provided for the event.
      *  Some of the event types have required argument fields, otherwise, you can put any information you wish in here.
      *  The arguments are displayed in Trace Viewer when you view an event in the analysis section.
      */
    var args: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * The event categories. This is a comma separated list of categories for the event.
      * The categories can be used to hide events in the Trace Viewer UI.
      */
    var cat: js.UndefOr[String] = js.undefined
    
    /**
      * A fixed color name to associate with the event.
      * If provided, cname must be one of the names listed in trace-viewer's base color scheme's
      * [reserved color names list]{@link https://github.com/catapult-project/catapult/blob/main/tracing/tracing/base/color_scheme.html}.
      */
    var cname: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the event, as displayed in Trace Viewer
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The event type.
      * This is a single character which changes depending on the type of event being output.
      */
    var ph: String
    
    /**
      * The process ID for the process that output this event.
      */
    var pid: Double
    
    /**
      * The thread ID for the thread that output this event.
      */
    var tid: Double
    
    /**
      * The tracing clock timestamp of the event. The timestamps are provided at microsecond granularity.
      */
    var ts: Double
    
    /**
      * Optional. The thread clock timestamp of the event. The timestamps are provided at microsecond granularity.
      */
    var tts: js.UndefOr[Double] = js.undefined
  }
  object Event {
    
    inline def apply(ph: String, pid: Double, tid: Double, ts: Double): Event = {
      val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Record[String, Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setCat(value: String): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
      
      inline def setCatUndefined: Self = StObject.set(x, "cat", js.undefined)
      
      inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
      
      inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPh(value: String): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTts(value: Double): Self = StObject.set(x, "tts", value.asInstanceOf[js.Any])
      
      inline def setTtsUndefined: Self = StObject.set(x, "tts", js.undefined)
    }
  }
}
