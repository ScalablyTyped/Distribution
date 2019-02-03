package typings
package terminalDashKitLib.terminalDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "ScreenBufferHD")
@js.native
class ScreenBufferHD protected ()
  extends terminalDashKitLib.screenbufferhdMod.namespaced {
  def this(options: terminalDashKitLib.Anon_Blending) = this()
  def this(options: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Options) = this()
}

/* static members */
@JSImport("terminal-kit", "ScreenBufferHD")
@js.native
object ScreenBufferHD extends js.Object {
  def loadImage(
    url: java.lang.String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[this.type], scala.Unit]
  ): scala.Unit = js.native
  def loadImage(
    url: java.lang.String,
    options: terminalDashKitLib.Anon_Shrink,
    callback: js.Function2[/* error */ js.Any, /* image */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

