package typings.vegaTypings

import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.selectorMod.EventSelector
import typings.vegaTypings.signalMod.SignalValue
import typings.vegaTypings.streamMod.EventType
import typings.vegaTypings.streamMod.Stream
import typings.vegaTypings.streamMod.WindowEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onEventsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.anon.ScaleString
    - typings.vegaTypings.streamMod.Stream
  */
  trait EventListener extends StObject
  object EventListener {
    
    inline def DerivedStream(stream: Stream): typings.vegaTypings.streamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.streamMod.DerivedStream]
    }
    
    inline def MergedStream(merge: js.Array[Stream]): typings.vegaTypings.streamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.streamMod.MergedStream]
    }
    
    inline def ScaleString(scale: String): typings.vegaTypings.anon.ScaleString = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.ScaleString]
    }
    
    inline def SignalRef(signal: String): typings.vegaTypings.signalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.signalMod.SignalRef]
    }
    
    inline def sourceviewscopeundefinedt(`type`: EventType): typings.vegaTypings.anon.sourceviewscopeundefinedt = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.sourceviewscopeundefinedt]
    }
    
    inline def sourcewindowtypeWindowEveBetween(`type`: WindowEventType): typings.vegaTypings.anon.sourcewindowtypeWindowEveBetween = {
      val __obj = js.Dynamic.literal(source = "window")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.sourcewindowtypeWindowEveBetween]
    }
  }
  
  type Events = EventSelector | EventListener
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.anon.encodestringeventsEventsA
    - typings.vegaTypings.anon.updateUpdateeventsEventsA
  */
  trait OnEvent extends StObject
  object OnEvent {
    
    inline def encodestringeventsEventsA(encode: String, events: Events | js.Array[EventListener]): typings.vegaTypings.anon.encodestringeventsEventsA = {
      val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.encodestringeventsEventsA]
    }
    
    inline def updateUpdateeventsEventsA(events: Events | js.Array[EventListener], update: Update): typings.vegaTypings.anon.updateUpdateeventsEventsA = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.updateUpdateeventsEventsA]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.exprMod.Expr
    - typings.vegaTypings.exprMod.ExprRef
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.anon.ValueSignalValue
  */
  type Update = _Update | Expr
  
  trait _Update extends StObject
  object _Update {
    
    inline def ExprRef(expr: Expr): typings.vegaTypings.exprMod.ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.exprMod.ExprRef]
    }
    
    inline def SignalRef(signal: String): typings.vegaTypings.signalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.signalMod.SignalRef]
    }
    
    inline def ValueSignalValue(value: SignalValue): typings.vegaTypings.anon.ValueSignalValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.ValueSignalValue]
    }
  }
}
