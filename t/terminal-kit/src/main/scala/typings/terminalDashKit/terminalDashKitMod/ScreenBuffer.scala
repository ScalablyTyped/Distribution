package typings.terminalDashKit.terminalDashKitMod

import typings.terminalDashKit.Anon_AttrTransparencyChar
import typings.terminalDashKit.Anon_Shrink
import typings.terminalDashKit.screenBufferMod.Attributes
import typings.terminalDashKit.screenBufferMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "ScreenBuffer")
@js.native
class ScreenBuffer protected ()
  extends typings.terminalDashKit.screenBufferMod.^ {
  def this(options: Options) = this()
}

/* static members */
@JSImport("terminal-kit", "ScreenBuffer")
@js.native
object ScreenBuffer extends js.Object {
  def attr2object(attrFlags: Double): Unit = js.native
  def create(options: Options): typings.terminalDashKit.screenBufferMod.ScreenBuffer = js.native
  def createFromString(options: Anon_AttrTransparencyChar, str: String): typings.terminalDashKit.screenBufferMod.ScreenBuffer = js.native
  def loadImage(
    url: String,
    calback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* image */ js.UndefOr[typings.terminalDashKit.screenBufferHDMod.^], 
      Unit
    ]
  ): Unit = js.native
  def loadImage(
    url: String,
    options: Anon_Shrink,
    calback: js.Function2[/* error */ js.Any, /* image */ typings.terminalDashKit.screenBufferHDMod.^, Unit]
  ): Unit = js.native
  def loadSync(filepath: String): typings.terminalDashKit.screenBufferMod.ScreenBuffer = js.native
  def object2attr(attrObject: Attributes): Unit = js.native
}

