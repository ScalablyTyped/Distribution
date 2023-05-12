package typings.traceEventLib

import typings.traceEventLib.distSchemaEventsEventMod.Event
import typings.traceEventLib.distSchemaEventsTraceEventMod.TraceEvent
import typings.traceEventLib.traceEventLibStrings.b_
import typings.traceEventLib.traceEventLibStrings.e_
import typings.traceEventLib.traceEventLibStrings.n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsAsyncEventMod {
  
  trait AsyncEndEvent
    extends StObject
       with AsyncEvent
       with TraceEvent {
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_AsyncEndEvent: e_
  }
  object AsyncEndEvent {
    
    inline def apply(pid: Double, tid: Double, ts: Double): AsyncEndEvent = {
      val __obj = js.Dynamic.literal(ph = "e", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncEndEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncEndEvent] (val x: Self) extends AnyVal {
      
      inline def setPh(value: e_): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsyncEvent
    extends StObject
       with Event {
    
    /**
      * An additional required parameter id.
      * We consider the events with the same {@link Event#cat} and {@link #id} as events from the same event tree.
      * A nested async event should have the same category and id as its parent.
      * @see {#id2}
      */
    var id: js.UndefOr[Double] = js.undefined
    
    /**
      * An alternative required parameter id2.
      * Can be used instead of the default {@link #id} field and explicitly specify if it is process-local or global.
      */
    var id2: js.UndefOr[AsyncID2] = js.undefined
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_AsyncEvent: b_ | n | e_
    
    /**
      * An optional scope string can be specified to avoid {@link #id} conflicts,
      * in which case we consider events with the same {@Link Event#cat}, {@link #scope}, and {@link #id}
      * as events from the same event tree.
      */
    var scope: js.UndefOr[String] = js.undefined
  }
  object AsyncEvent {
    
    inline def apply(ph: b_ | n | e_, pid: Double, tid: Double, ts: Double): AsyncEvent = {
      val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncEvent] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setId2(value: AsyncID2): Self = StObject.set(x, "id2", value.asInstanceOf[js.Any])
      
      inline def setId2Undefined: Self = StObject.set(x, "id2", js.undefined)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPh(value: b_ | n | e_): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.traceEventLib.anon.Local
    - typings.traceEventLib.anon.Global
  */
  trait AsyncID2 extends StObject
  object AsyncID2 {
    
    inline def Global(global: String): typings.traceEventLib.anon.Global = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.anon.Global]
    }
    
    inline def Local(local: String): typings.traceEventLib.anon.Local = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.traceEventLib.anon.Local]
    }
  }
  
  trait AsyncInstantEvent
    extends StObject
       with AsyncEvent
       with TraceEvent {
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_AsyncInstantEvent: n
  }
  object AsyncInstantEvent {
    
    inline def apply(pid: Double, tid: Double, ts: Double): AsyncInstantEvent = {
      val __obj = js.Dynamic.literal(ph = "n", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncInstantEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncInstantEvent] (val x: Self) extends AnyVal {
      
      inline def setPh(value: n): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsyncStartEvent
    extends StObject
       with AsyncEvent
       with TraceEvent {
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_AsyncStartEvent: b_
  }
  object AsyncStartEvent {
    
    inline def apply(pid: Double, tid: Double, ts: Double): AsyncStartEvent = {
      val __obj = js.Dynamic.literal(ph = "b", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncStartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncStartEvent] (val x: Self) extends AnyVal {
      
      inline def setPh(value: b_): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
}
