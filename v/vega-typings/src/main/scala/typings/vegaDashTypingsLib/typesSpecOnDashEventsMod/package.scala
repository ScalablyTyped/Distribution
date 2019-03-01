package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecOnDashEventsMod {
  type Events = vegaDashTypingsLib.typesSpecSelectorMod.EventSelector | EventListener
  type OnEvent = (vegaDashTypingsLib.Anon_Encode | vegaDashTypingsLib.Anon_Update) with vegaDashTypingsLib.Anon_Events
  type Update = _Update | vegaDashTypingsLib.typesSpecExprMod.Expr
}
