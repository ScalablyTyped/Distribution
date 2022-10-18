package typings.vegaTypings

import typings.vegaTypings.typesSpecExprMod.Expr
import typings.vegaTypings.typesSpecSelectorMod.EventSelector
import typings.vegaTypings.typesSpecSignalMod.SignalValue
import typings.vegaTypings.typesSpecStreamMod.EventType
import typings.vegaTypings.typesSpecStreamMod.Stream
import typings.vegaTypings.typesSpecStreamMod.WindowEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecOnEventsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.typesSpecSignalMod.SignalRef
    - typings.vegaTypings.anon.ScaleString
    - typings.vegaTypings.typesSpecStreamMod.Stream
  */
  trait EventListener extends StObject
  object EventListener {
    
    inline def DerivedStream(stream: Stream): typings.vegaTypings.typesSpecStreamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecStreamMod.DerivedStream]
    }
    
    inline def MergedStream(merge: js.Array[Stream]): typings.vegaTypings.typesSpecStreamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecStreamMod.MergedStream]
    }
    
    inline def ScaleString(scale: String): typings.vegaTypings.anon.ScaleString = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.ScaleString]
    }
    
    inline def SignalRef(signal: String): typings.vegaTypings.typesSpecSignalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecSignalMod.SignalRef]
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
    - typings.vegaTypings.typesSpecExprMod.Expr
    - typings.vegaTypings.typesSpecExprMod.ExprRef
    - typings.vegaTypings.typesSpecSignalMod.SignalRef
    - typings.vegaTypings.anon.ValueSignalValue
  */
  type Update = _Update | Expr
  
  trait _Update extends StObject
  object _Update {
    
    inline def ExprRef(expr: Expr): typings.vegaTypings.typesSpecExprMod.ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecExprMod.ExprRef]
    }
    
    inline def SignalRef(signal: String): typings.vegaTypings.typesSpecSignalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.typesSpecSignalMod.SignalRef]
    }
    
    inline def ValueSignalValue(value: SignalValue): typings.vegaTypings.anon.ValueSignalValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.ValueSignalValue]
    }
  }
}
