package typings.terminalDashKit.screenBufferMod

import typings.terminalDashKit.Anon_AttrTransparencyChar
import typings.terminalDashKit.Anon_Shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/ScreenBuffer", JSImport.Namespace)
@js.native
class ^ protected () extends ScreenBuffer {
  def this(options: Options) = this()
}

@JSImport("terminal-kit/ScreenBuffer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def attr2object(attrFlags: Double): Unit = js.native
  def create(options: Options): ScreenBuffer = js.native
  def createFromString(options: Anon_AttrTransparencyChar, str: String): ScreenBuffer = js.native
  def loadImage(
    url: String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  def loadImage(
    url: String,
    options: Anon_Shrink,
    calback: js.Function2[/* error */ js.Any, /* image */ this.type, Unit]
  ): Unit = js.native
  def loadSync(filepath: String): ScreenBuffer = js.native
  def object2attr(attrObject: Attributes): Unit = js.native
}

