package typings.terminalDashKit.screenBufferHDMod

import typings.terminalDashKit.Anon_Blending
import typings.terminalDashKit.Anon_ShrinkAnonHeightWidth
import typings.terminalDashKit.screenBufferMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
class ^ protected () extends ScreenBufferHD {
  def this(options: Anon_Blending) = this()
  def this(options: Options) = this()
}

@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def loadImage(
    url: String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[ScreenBufferHD], Unit]
  ): Unit = js.native
  def loadImage(
    url: String,
    options: Anon_ShrinkAnonHeightWidth,
    callback: js.Function2[/* error */ js.Any, /* image */ ScreenBufferHD, Unit]
  ): Unit = js.native
}

