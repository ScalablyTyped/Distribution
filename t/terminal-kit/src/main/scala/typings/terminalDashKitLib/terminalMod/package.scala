package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terminalMod {
  type Callback[T] = (js.Function1[/* err */ js.Any, scala.Unit]) | (js.Function2[/* err */ js.UndefOr[scala.Nothing], /* arg */ T, scala.Unit])
  type Terminal = terminalDashKitLib.terminalMod.TerminalNs.Impl with nextgenDashEventsLib.nextgenDashEventsMod.namespaced
}
