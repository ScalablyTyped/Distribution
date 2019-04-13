package typings
package terminalDashKitLib.screenBufferHDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
class ^ protected () extends ScreenBufferHD {
  def this(options: terminalDashKitLib.Anon_Blending) = this()
  def this(options: terminalDashKitLib.screenBufferMod.Options) = this()
}

@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def loadImage(
    url: java.lang.String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[ScreenBufferHD], scala.Unit]
  ): scala.Unit = js.native
  def loadImage(
    url: java.lang.String,
    options: terminalDashKitLib.Anon_ShrinkAnonHeightWidth,
    callback: js.Function2[/* error */ js.Any, /* image */ ScreenBufferHD, scala.Unit]
  ): scala.Unit = js.native
}

