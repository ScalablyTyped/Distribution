package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecExprMod.Expr
import typings.vegaDashTypings.typesSpecOnDashEventsMod.EventListener
import typings.vegaDashTypings.typesSpecOnDashEventsMod._EventListener
import typings.vegaDashTypings.typesSpecOnDashEventsMod._Update
import typings.vegaDashTypings.typesSpecSelectorMod.EventSelector
import typings.vegaDashTypings.typesSpecStreamMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/spec/on-events", JSImport.Namespace)
@js.native
object typesSpecOnDashEventsMod extends js.Object {
  trait _EventListener extends js.Object
  
  trait _Update extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
    - typings.vegaDashTypings.Anon_ScaleString
    - typings.vegaDashTypings.typesSpecStreamMod.Stream
  */
  type EventListener = _EventListener | EventStream
  type Events = EventSelector | EventListener
  type OnEvent = (Anon_Encode | Anon_Update) with Anon_Events
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecExprMod.Expr
    - typings.vegaDashTypings.typesSpecExprMod.ExprRef
    - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
    - typings.vegaDashTypings.Anon_ValueSignalValue
  */
  type Update = _Update | Expr
}

