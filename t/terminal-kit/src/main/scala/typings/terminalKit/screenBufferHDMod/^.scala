package typings.terminalKit.screenBufferHDMod

import typings.terminalKit.anon.`0`
import typings.terminalKit.screenBufferMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/ScreenBufferHD", JSImport.Namespace)
@js.native
class ^ protected () extends ScreenBufferHD {
  def this(options: typings.terminalKit.anon.Blending) = this()
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
    options: `0`,
    callback: js.Function2[/* error */ js.Any, /* image */ ScreenBufferHD, Unit]
  ): Unit = js.native
}

