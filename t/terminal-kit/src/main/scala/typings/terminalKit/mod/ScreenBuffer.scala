package typings.terminalKit.mod

import typings.terminalKit.anon.Shrink
import typings.terminalKit.anon.TransparencyChar
import typings.terminalKit.screenBufferMod.Attributes
import typings.terminalKit.screenBufferMod.Options
import typings.terminalKit.screenBufferMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "ScreenBuffer")
@js.native
class ScreenBuffer protected () extends ^ {
  def this(options: Options) = this()
}

/* static members */
@JSImport("terminal-kit", "ScreenBuffer")
@js.native
object ScreenBuffer extends js.Object {
  def attr2object(attrFlags: Double): Unit = js.native
  def create(options: Options): typings.terminalKit.screenBufferMod.ScreenBuffer = js.native
  def createFromString(options: TransparencyChar, str: String): typings.terminalKit.screenBufferMod.ScreenBuffer = js.native
  def loadImage(
    url: String,
    calback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* image */ js.UndefOr[typings.terminalKit.screenBufferHDMod.^], 
      Unit
    ]
  ): Unit = js.native
  def loadImage(
    url: String,
    options: Shrink,
    calback: js.Function2[/* error */ js.Any, /* image */ typings.terminalKit.screenBufferHDMod.^, Unit]
  ): Unit = js.native
  def loadSync(filepath: String): typings.terminalKit.screenBufferMod.ScreenBuffer = js.native
  def object2attr(attrObject: Attributes): Unit = js.native
}

