package typings.traceEventLib

import typings.traceEventLib.distSchemaEventsEventWithStackMod.EventWithStack
import typings.traceEventLib.traceEventLibStrings.B
import typings.traceEventLib.traceEventLibStrings.E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaEventsDurationEventMod {
  
  trait DurationBeginEvent
    extends StObject
       with DurationEvent {
    
    /** @inheritDoc */
    @JSName("name")
    var name_DurationBeginEvent: String
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_DurationBeginEvent: B
  }
  object DurationBeginEvent {
    
    inline def apply(name: String, pid: Double, tid: Double, ts: Double): DurationBeginEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ph = "B", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[DurationBeginEvent]
    }
    
    extension [Self <: DurationBeginEvent](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPh(value: B): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
  
  trait DurationEndEvent
    extends StObject
       with DurationEvent {
    
    @JSName("cat")
    var cat_DurationEndEvent: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("name")
    var name_DurationEndEvent: js.UndefOr[scala.Nothing] = js.undefined
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_DurationEndEvent: E
  }
  object DurationEndEvent {
    
    inline def apply(pid: Double, tid: Double, ts: Double): DurationEndEvent = {
      val __obj = js.Dynamic.literal(ph = "E", pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[DurationEndEvent]
    }
    
    extension [Self <: DurationEndEvent](x: Self) {
      
      inline def setPh(value: E): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
  
  trait DurationEvent
    extends StObject
       with EventWithStack {
    
    /** @inheritDoc */
    @JSName("ph")
    var ph_DurationEvent: B | E
  }
  object DurationEvent {
    
    inline def apply(ph: B | E, pid: Double, tid: Double, ts: Double): DurationEvent = {
      val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[DurationEvent]
    }
    
    extension [Self <: DurationEvent](x: Self) {
      
      inline def setPh(value: B | E): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    }
  }
}
