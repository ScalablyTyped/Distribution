package typings
package terminalDashKitLib.screenBufferMod

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
  def attr2object(attrFlags: scala.Double): scala.Unit = js.native
  def create(options: Options): ScreenBuffer = js.native
  def createFromString(options: terminalDashKitLib.Anon_AttrTransparencyChar, str: java.lang.String): ScreenBuffer = js.native
  def loadImage(
    url: java.lang.String,
    calback: js.Function2[/* error */ js.UndefOr[js.Any], /* image */ js.UndefOr[this.type], scala.Unit]
  ): scala.Unit = js.native
  def loadImage(
    url: java.lang.String,
    options: terminalDashKitLib.Anon_Shrink,
    calback: js.Function2[/* error */ js.Any, /* image */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def loadSync(filepath: java.lang.String): ScreenBuffer = js.native
  def object2attr(attrObject: Attributes): scala.Unit = js.native
}

