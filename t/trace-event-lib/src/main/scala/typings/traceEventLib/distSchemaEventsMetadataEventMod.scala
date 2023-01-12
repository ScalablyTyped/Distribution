package typings.traceEventLib

import typings.traceEventLib.anon.Labels
import typings.traceEventLib.anon.Name
import typings.traceEventLib.anon.Sortindex
import typings.traceEventLib.distSchemaEventsEventMod.Event
import typings.traceEventLib.traceEventLibStrings.M
import typings.traceEventLib.traceEventLibStrings.process_labels
import typings.traceEventLib.traceEventLibStrings.process_name
import typings.traceEventLib.traceEventLibStrings.process_sort_index
import typings.traceEventLib.traceEventLibStrings.thread_name
import typings.traceEventLib.traceEventLibStrings.thread_sort_index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsMetadataEventMod {
  
  trait MetadataEvent
    extends StObject
       with Event {
    
    @JSName("cat")
    var cat_MetadataEvent: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_MetadataEvent: M
  }
  object MetadataEvent {
    
    inline def apply(pid: Double, tid: Double, ts: Double): MetadataEvent = {
      val __obj = js.Dynamic.literal(ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataEvent] (val x: Self) extends AnyVal {
      
      inline def setPh(value: M): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataProcessLabelsEvent
    extends StObject
       with MetadataEvent {
    
    @JSName("args")
    var args_MetadataProcessLabelsEvent: Labels
    
    @JSName("name")
    var name_MetadataProcessLabelsEvent: process_labels
  }
  object MetadataProcessLabelsEvent {
    
    inline def apply(args: Labels, pid: Double, tid: Double, ts: Double): MetadataProcessLabelsEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "process_labels", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataProcessLabelsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataProcessLabelsEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Labels): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: process_labels): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataProcessNameEvent
    extends StObject
       with MetadataEvent {
    
    @JSName("args")
    var args_MetadataProcessNameEvent: Name
    
    @JSName("name")
    var name_MetadataProcessNameEvent: process_name
  }
  object MetadataProcessNameEvent {
    
    inline def apply(args: Name, pid: Double, tid: Double, ts: Double): MetadataProcessNameEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "process_name", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataProcessNameEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataProcessNameEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Name): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: process_name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataProcessSortIndexEvent
    extends StObject
       with MetadataEvent {
    
    @JSName("args")
    var args_MetadataProcessSortIndexEvent: Sortindex
    
    @JSName("name")
    var name_MetadataProcessSortIndexEvent: process_sort_index
  }
  object MetadataProcessSortIndexEvent {
    
    inline def apply(args: Sortindex, pid: Double, tid: Double, ts: Double): MetadataProcessSortIndexEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "process_sort_index", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataProcessSortIndexEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataProcessSortIndexEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Sortindex): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: process_sort_index): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataThreadNameEvent
    extends StObject
       with MetadataEvent {
    
    @JSName("args")
    var args_MetadataThreadNameEvent: Name
    
    @JSName("name")
    var name_MetadataThreadNameEvent: thread_name
  }
  object MetadataThreadNameEvent {
    
    inline def apply(args: Name, pid: Double, tid: Double, ts: Double): MetadataThreadNameEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "thread_name", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataThreadNameEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataThreadNameEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Name): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: thread_name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetadataThreadSortIndexEvent
    extends StObject
       with MetadataEvent {
    
    @JSName("args")
    var args_MetadataThreadSortIndexEvent: Sortindex
    
    @JSName("name")
    var name_MetadataThreadSortIndexEvent: thread_sort_index
  }
  object MetadataThreadSortIndexEvent {
    
    inline def apply(args: Sortindex, pid: Double, tid: Double, ts: Double): MetadataThreadSortIndexEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "thread_sort_index", ph = "M", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataThreadSortIndexEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataThreadSortIndexEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: Sortindex): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setName(value: thread_sort_index): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
