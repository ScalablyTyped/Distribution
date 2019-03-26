package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecOnDashEventsMod {
  /* Rewritten from type alias, can be one of: 
    - vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    - vegaDashTypingsLib.Anon_ScaleString
    - vegaDashTypingsLib.typesSpecStreamMod.Stream
  */
  type EventListener = _EventListener | vegaDashTypingsLib.typesSpecStreamMod.EventStream
  type Events = vegaDashTypingsLib.typesSpecSelectorMod.EventSelector | EventListener
  type OnEvent = (vegaDashTypingsLib.Anon_Encode | vegaDashTypingsLib.Anon_Update) with vegaDashTypingsLib.Anon_Events
  /* Rewritten from type alias, can be one of: 
    - vegaDashTypingsLib.typesSpecExprMod.Expr
    - vegaDashTypingsLib.typesSpecExprMod.ExprRef
    - vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    - vegaDashTypingsLib.Anon_ValueSignalValue
  */
  type Update = _Update | vegaDashTypingsLib.typesSpecExprMod.Expr
}
