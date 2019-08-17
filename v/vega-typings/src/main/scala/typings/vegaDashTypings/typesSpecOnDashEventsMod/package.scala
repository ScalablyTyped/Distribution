package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecOnDashEventsMod {
  import typings.vegaDashTypings.typesSpecExprMod.Expr
  import typings.vegaDashTypings.typesSpecSelectorMod.EventSelector
  import typings.vegaDashTypings.typesSpecStreamMod.EventStream

  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
    - typings.vegaDashTypings.Anon_ScaleString
    - typings.vegaDashTypings.typesSpecStreamMod.Stream
  */
  type EventListener = _EventListener | EventStream
  type Events = EventSelector | EventListener
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecExprMod.Expr
    - typings.vegaDashTypings.typesSpecExprMod.ExprRef
    - typings.vegaDashTypings.typesSpecSignalMod.SignalRef
    - typings.vegaDashTypings.Anon_ValueSignalValue
  */
  type Update = _Update | Expr
}
