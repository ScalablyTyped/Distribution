package typings.terminalKit.screenBufferHDMod

import typings.terminalKit.AnonBlending
import typings.terminalKit.AnonShrinkAnonHeightWidth
import typings.terminalKit.screenBufferMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
class ^ protected () extends ScreenBufferHD {
  def this(options: AnonBlending) = this()
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
    options: AnonShrinkAnonHeightWidth,
    callback: js.Function2[/* error */ js.Any, /* image */ ScreenBufferHD, Unit]
  ): Unit = js.native
}

