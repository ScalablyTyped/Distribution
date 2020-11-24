package typings.terminalKit.mod

import typings.terminalKit.anon.Blending
import typings.terminalKit.anon.`0`
import typings.terminalKit.screenBufferHDMod.^
import typings.terminalKit.screenBufferMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("terminal-kit", "ScreenBufferHD")
@js.native
class ScreenBufferHD protected () extends ^ {
  def this(options: Blending) = this()
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
  def loadImage(url: String, options: `0`, callback: js.Function2[/* error */ js.Any, /* image */ this.type, Unit]): Unit = js.native
}
