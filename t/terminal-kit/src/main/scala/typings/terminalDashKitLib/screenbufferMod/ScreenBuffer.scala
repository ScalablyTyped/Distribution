package typings
package terminalDashKitLib.screenbufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBuffer
  extends nextgenDashEventsLib.nextgenDashEventsMod.namespaced {
  val blending: scala.Boolean | terminalDashKitLib.screenbufferhdMod.ScreenBufferHDNs.IsBlending = js.native
  val dst: terminalDashKitLib.terminalMod.Terminal | ScreenBuffer = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  def attr2object(attrFlags: scala.Double): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def draw(): scala.Unit = js.native
  def draw(options: terminalDashKitLib.screenbufferMod.ScreenBufferNs.DrawOptions): scala.Unit = js.native
  def drawCursor(): scala.Unit = js.native
  def drawCursor(options: terminalDashKitLib.Anon_Dst): scala.Unit = js.native
  def dumpChars(): java.lang.String = js.native
  def fill(): scala.Unit = js.native
  def fill(options: terminalDashKitLib.Anon_AttrChar): scala.Unit = js.native
  def get(): terminalDashKitLib.Anon_AttrCharAttributes = js.native
  def get(options: terminalDashKitLib.Anon_X): terminalDashKitLib.Anon_AttrCharAttributes = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def object2attr(attrObject: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes): scala.Unit = js.native
  def put(
    options: terminalDashKitLib.screenbufferMod.ScreenBufferNs.PutOptions,
    format: java.lang.String,
    formatArgumets: js.Any*
  ): scala.Unit = js.native
  def resize(fromRect: terminalDashKitLib.rectMod.RectNs.Options): scala.Unit = js.native
  def resize(fromRect: terminalDashKitLib.rectMod.namespaced): scala.Unit = js.native
  def saveSync(filepath: java.lang.String): scala.Unit = js.native
  def vScroll(offset: scala.Double, drawToTerminal: scala.Boolean): scala.Unit = js.native
}

