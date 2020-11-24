package typings.vegaTypings

import typings.vegaTypings.anon.Encode
import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.selectorMod.EventSelector
import typings.vegaTypings.streamMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/spec/on-events", JSImport.Namespace)
@js.native
object onEventsMod extends js.Object {
  
  trait _EventListener extends js.Object
  
  trait _Update extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.anon.ScaleString
    - typings.vegaTypings.streamMod.Stream
  */
  type EventListener = _EventListener | EventStream
  
  type Events = EventSelector | EventListener
  
  type OnEvent = (Encode | typings.vegaTypings.anon.Update) with typings.vegaTypings.anon.Events
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.exprMod.Expr
    - typings.vegaTypings.exprMod.ExprRef
    - typings.vegaTypings.signalMod.SignalRef
    - typings.vegaTypings.anon.ValueSignalValue
  */
  type Update = _Update | Expr
}
