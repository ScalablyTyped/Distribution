package typings.traceEventLib

import typings.traceEventLib.distSchemaEventsEventWithStackMod.EventWithStack
import typings.traceEventLib.traceEventLibStrings.g
import typings.traceEventLib.traceEventLibStrings.i
import typings.traceEventLib.traceEventLibStrings.p
import typings.traceEventLib.traceEventLibStrings.t
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsInstantEventMod {
  
  trait GlobalInstantEvent
    extends StObject
       with InstantEvent {
    
    /** @inheritDoc */
    @JSName("s")
    var s_GlobalInstantEvent: g
  }
  object GlobalInstantEvent {
    
    inline def apply(name: String, pid: Double, tid: Double, ts: Double): GlobalInstantEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "i", pid = pid.asInstanceOf[js.Any], s = "g", tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalInstantEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalInstantEvent] (val x: Self) extends AnyVal {
      
      inline def setS(value: g): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstantEvent
    extends StObject
       with EventWithStack {
    
    /** @inheritDoc */
    @JSName("name")
    var name_InstantEvent: String
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_InstantEvent: i
    
    /**
      * The scope of the event.
      * There are four scopes available global (g), process (p) and thread (t).
      * If no scope is provided we default to thread scoped events.
      */
    var s: js.UndefOr[g | p | t] = js.undefined
  }
  object InstantEvent {
    
    inline def apply(name: String, pid: Double, tid: Double, ts: Double): InstantEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "i", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstantEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstantEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPh(value: i): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
      
      inline def setS(value: g | p | t): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    }
  }
  
  trait ProcessInstantEvent
    extends StObject
       with InstantEvent {
    
    /** @inheritDoc */
    @JSName("s")
    var s_ProcessInstantEvent: p
  }
  object ProcessInstantEvent {
    
    inline def apply(name: String, pid: Double, tid: Double, ts: Double): ProcessInstantEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "i", pid = pid.asInstanceOf[js.Any], s = "p", tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessInstantEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessInstantEvent] (val x: Self) extends AnyVal {
      
      inline def setS(value: p): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThreadInstantEvent
    extends StObject
       with InstantEvent {
    
    /** @inheritDoc */
    @JSName("s")
    var s_ThreadInstantEvent: js.UndefOr[t] = js.undefined
  }
  object ThreadInstantEvent {
    
    inline def apply(name: String, pid: Double, tid: Double, ts: Double): ThreadInstantEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "i", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreadInstantEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThreadInstantEvent] (val x: Self) extends AnyVal {
      
      inline def setS(value: t): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    }
  }
}
