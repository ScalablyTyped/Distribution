package typings.traceEventLib

import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.traceEventLib.anon.PartialEvent
import typings.traceEventLib.anon.SimplifiedAsyncEndEvent
import typings.traceEventLib.anon.SimplifiedAsyncInstantEve
import typings.traceEventLib.anon.SimplifiedAsyncStartEvent
import typings.traceEventLib.anon.SimplifiedCompleteEvent
import typings.traceEventLib.anon.SimplifiedCounterEvent
import typings.traceEventLib.anon.SimplifiedDurationBeginEv
import typings.traceEventLib.anon.SimplifiedDurationEndEven
import typings.traceEventLib.anon.SimplifiedInstantEvent
import typings.traceEventLib.distSchemaEventsEventMod.Event
import typings.traceEventLib.distSchemaEventsMetadataEventMod.MetadataEvent
import typings.traceEventLib.traceEventLibStrings.ph
import typings.traceEventLib.traceEventLibStrings.pid
import typings.traceEventLib.traceEventLibStrings.tid
import typings.traceEventLib.traceEventLibStrings.ts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuilderMod {
  
  /* note: abstract class */ @JSImport("trace-event-lib/dist/builder", "AbstractEventBuilder")
  @js.native
  open class AbstractEventBuilder () extends StObject {
    
    /* private */ val _callSend: Any = js.native
    
    def begin(event: SimplifiedDurationBeginEv): Unit = js.native
    
    def beginAsync(event: SimplifiedAsyncStartEvent): Unit = js.native
    
    def complete(event: SimplifiedCompleteEvent): Unit = js.native
    
    def counter(event: SimplifiedCounterEvent): Unit = js.native
    
    /* protected */ def defaults[T /* <: PartialEvent */](event: T): T & AutocompletedEventFields = js.native
    
    def end(): Unit = js.native
    def end(event: SimplifiedDurationEndEven): Unit = js.native
    
    def endAsync(event: SimplifiedAsyncEndEvent): Unit = js.native
    
    def instant(event: SimplifiedInstantEvent): Unit = js.native
    
    def instantAsync(event: SimplifiedAsyncInstantEve): Unit = js.native
    
    def metadata[T /* <: MetadataEvent */](event: Simplified[T]): Unit = js.native
    
    def process_labels(labels: js.Array[String]): Unit = js.native
    def process_labels(labels: js.Array[String], pid: Double): Unit = js.native
    
    def process_name(name: String): Unit = js.native
    def process_name(name: String, pid: Double): Unit = js.native
    
    def process_sort_index(index: Double): Unit = js.native
    def process_sort_index(index: Double, pid: Double): Unit = js.native
    
    /* protected */ def send[T /* <: Event */](event: T): Unit = js.native
    
    def thread_name(name: String): Unit = js.native
    def thread_name(name: String, tid: Double): Unit = js.native
    def thread_name(name: String, tid: Double, pid: Double): Unit = js.native
    def thread_name(name: String, tid: Unit, pid: Double): Unit = js.native
    
    def thread_sort_index(index: Double): Unit = js.native
    def thread_sort_index(index: Double, tid: Double): Unit = js.native
    def thread_sort_index(index: Double, tid: Double, pid: Double): Unit = js.native
    def thread_sort_index(index: Double, tid: Unit, pid: Double): Unit = js.native
  }
  
  /* Inlined std.Pick<trace-event-lib.trace-event-lib/dist/schema.Event, 'ts' | 'pid' | 'tid'> */
  trait AutocompletedEventFields extends StObject {
    
    var pid: Double
    
    var tid: Double
    
    var ts: Double
  }
  object AutocompletedEventFields {
    
    inline def apply(pid: Double, tid: Double, ts: Double): AutocompletedEventFields = {
      val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompletedEventFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompletedEventFields] (val x: Self) extends AnyVal {
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setTid(value: Double): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    }
  }
  
  type Completable[T /* <: Event */] = OmitOptionally[T, ts | pid | tid]
  
  type OmitOptionally[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) & (Partial[Pick[T, K]])
  
  type Simplified[T /* <: Event */] = OmitOptionally[T, ts | pid | tid | ph]
}
