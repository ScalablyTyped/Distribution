package typings
package terminalDashKitLib.terminalDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit", "ScreenBuffer")
@js.native
class ScreenBuffer protected ()
  extends terminalDashKitLib.screenbufferMod.namespaced {
  def this(options: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Options) = this()
}

/* static members */
@JSImport("terminal-kit", "ScreenBuffer")
@js.native
object ScreenBuffer extends js.Object {
  def attr2object(attrFlags: scala.Double): scala.Unit = js.native
  def create(options: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Options): terminalDashKitLib.screenbufferMod.ScreenBuffer = js.native
  def createFromString(options: terminalDashKitLib.Anon_Attr, str: java.lang.String): terminalDashKitLib.screenbufferMod.ScreenBuffer = js.native
  def loadImage(
    url: java.lang.String,
    calback: js.Function2[
      /* error */ js.UndefOr[js.Any], 
      /* image */ js.UndefOr[terminalDashKitLib.screenbufferhdMod.namespaced], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadImage(
    url: java.lang.String,
    options: terminalDashKitLib.Anon_Args,
    calback: js.Function2[
      /* error */ js.Any, 
      /* image */ terminalDashKitLib.screenbufferhdMod.namespaced, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadSync(filepath: java.lang.String): terminalDashKitLib.screenbufferMod.ScreenBuffer = js.native
  def object2attr(attrObject: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes): scala.Unit = js.native
}

