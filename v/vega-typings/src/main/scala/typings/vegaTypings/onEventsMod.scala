package typings.vegaTypings

import typings.vegaTypings.anon.Encode
import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.selectorMod.EventSelector
import typings.vegaTypings.signalMod.SignalValue
import typings.vegaTypings.streamMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onEventsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.anon.ScaleString
    - typings.vegaTypings.streamMod.Stream
  */
  type EventListener = _EventListener | EventStream
  
  type Events = EventSelector | EventListener
  
  type OnEvent = (Encode | typings.vegaTypings.anon.Update) & typings.vegaTypings.anon.Events
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.exprMod.Expr
    - typings.vegaTypings.exprMod.ExprRef
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.anon.ValueSignalValue
  */
  type Update = _Update | Expr
  
  trait _EventListener extends StObject
  
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
