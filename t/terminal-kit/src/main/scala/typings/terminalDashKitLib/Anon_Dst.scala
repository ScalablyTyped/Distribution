package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dst extends js.Object {
  var dst: terminalDashKitLib.terminalMod.Terminal | terminalDashKitLib.screenbufferMod.ScreenBuffer
}

object Anon_Dst {
  @scala.inline
  def apply(dst: terminalDashKitLib.terminalMod.Terminal | terminalDashKitLib.screenbufferMod.ScreenBuffer): Anon_Dst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dst")(dst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dst]
  }
}

