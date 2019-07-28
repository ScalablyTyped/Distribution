package typings.terminalDashKit.terminalDashKitMod

import typings.terminalDashKit.Anon_Blending
import typings.terminalDashKit.Anon_ShrinkAnonHeightWidth
import typings.terminalDashKit.screenBufferMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "ScreenBufferHD")
@js.native
class ScreenBufferHD protected ()
  extends typings.terminalDashKit.screenBufferHDMod.^ {
  def this(options: Anon_Blending) = this()
  def this(options: Options) = this()
}

/* static members */
@JSImport("terminal-kit", "ScreenBufferHD")
@js.native
object ScreenBufferHD extends js.Object {
  def loadImage(
    url: String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  def loadImage(
    url: String,
    options: Anon_ShrinkAnonHeightWidth,
    callback: js.Function2[/* error */ js.Any, /* image */ this.type, Unit]
  ): Unit = js.native
}

