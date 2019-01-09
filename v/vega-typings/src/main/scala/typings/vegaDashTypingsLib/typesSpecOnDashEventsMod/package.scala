package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecOnDashEventsMod {
  type EventListener = vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.Anon_ScaleString | vegaDashTypingsLib.typesSpecStreamMod.Stream
  type Events = vegaDashTypingsLib.typesSpecSelectorMod.EventSelector | EventListener
  type OnEvent = (vegaDashTypingsLib.Anon_Encode | vegaDashTypingsLib.Anon_Update) with vegaDashTypingsLib.Anon_Events
  type Update = vegaDashTypingsLib.typesSpecExprMod.Expr | vegaDashTypingsLib.typesSpecExprMod.ExprRef | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | vegaDashTypingsLib.Anon_ValueSignalValue
}
