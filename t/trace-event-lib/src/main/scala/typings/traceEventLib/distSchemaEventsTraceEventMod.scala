package typings.traceEventLib

import typings.traceEventLib.anon.Labels
import typings.traceEventLib.anon.Name
import typings.traceEventLib.anon.Sortindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsTraceEventMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncEndEvent
    - typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncInstantEvent
    - typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncStartEvent
    - typings.traceEventLib.distSchemaEventsCompleteEventMod.CompleteEvent
    - typings.traceEventLib.distSchemaEventsCounterEventMod.CounterEvent
    - typings.traceEventLib.distSchemaEventsDurationEventMod.DurationBeginEvent
    - typings.traceEventLib.distSchemaEventsDurationEventMod.DurationEndEvent
    - typings.traceEventLib.distSchemaEventsInstantEventMod.GlobalInstantEvent
    - typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessLabelsEvent
    - typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessNameEvent
    - typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessSortIndexEvent
    - typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataThreadNameEvent
    - typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataThreadSortIndexEvent
    - typings.traceEventLib.distSchemaEventsInstantEventMod.ProcessInstantEvent
    - typings.traceEventLib.distSchemaEventsInstantEventMod.ThreadInstantEvent
  */
  trait TraceEvent extends StObject
  object TraceEvent {
    
    inline def AsyncEndEvent(pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncEndEvent = {
      val __obj = js.Dynamic.literal(ph = "e", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncEndEvent]
    }
    
    inline def AsyncInstantEvent(pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncInstantEvent = {
      val __obj = js.Dynamic.literal(ph = "n", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncInstantEvent]
    }
    
    inline def AsyncStartEvent(pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncStartEvent = {
      val __obj = js.Dynamic.literal(ph = "b", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsAsyncEventMod.AsyncStartEvent]
    }
    
    inline def CompleteEvent(cat: String, dur: Double, name: String, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsCompleteEventMod.CompleteEvent = {
      val __obj = js.Dynamic.literal(cat = cat.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ph = "X", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsCompleteEventMod.CompleteEvent]
    }
    
    inline def CounterEvent(name: String, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsCounterEventMod.CounterEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "C", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsCounterEventMod.CounterEvent]
    }
    
    inline def DurationBeginEvent(name: String, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsDurationEventMod.DurationBeginEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "B", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsDurationEventMod.DurationBeginEvent]
    }
    
    inline def DurationEndEvent(pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsDurationEventMod.DurationEndEvent = {
      val __obj = js.Dynamic.literal(ph = "E", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsDurationEventMod.DurationEndEvent]
    }
    
    inline def GlobalInstantEvent(name: String, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsInstantEventMod.GlobalInstantEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "i", pid = pid.asInstanceOf[js.Any], s = "g", tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsInstantEventMod.GlobalInstantEvent]
    }
    
    inline def MetadataProcessLabelsEvent(args: Labels, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessLabelsEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "process_labels", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessLabelsEvent]
    }
    
    inline def MetadataProcessNameEvent(args: Name, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessNameEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "process_name", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessNameEvent]
    }
    
    inline def MetadataProcessSortIndexEvent(args: Sortindex, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessSortIndexEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "process_sort_index", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataProcessSortIndexEvent]
    }
    
    inline def MetadataThreadNameEvent(args: Name, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataThreadNameEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "thread_name", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataThreadNameEvent]
    }
    
    inline def MetadataThreadSortIndexEvent(args: Sortindex, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataThreadSortIndexEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "thread_sort_index", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataThreadSortIndexEvent]
    }
    
    inline def ProcessInstantEvent(name: String, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsInstantEventMod.ProcessInstantEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "i", pid = pid.asInstanceOf[js.Any], s = "p", tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsInstantEventMod.ProcessInstantEvent]
    }
    
    inline def ThreadInstantEvent(name: String, pid: Double, tid: Double, ts: Double): typings.traceEventLib.distSchemaEventsInstantEventMod.ThreadInstantEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "i", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.distSchemaEventsInstantEventMod.ThreadInstantEvent]
    }
  }
}
