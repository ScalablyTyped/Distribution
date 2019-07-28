package typings.terminalDashKit.screenBufferMod

import typings.terminalDashKit.Anon_Attr
import typings.terminalDashKit.Anon_AttrChar
import typings.terminalDashKit.Anon_Dst
import typings.terminalDashKit.Anon_X
import typings.terminalDashKit.screenBufferHDMod.IsBlending
import typings.terminalDashKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBuffer
  extends typings.nextgenDashEvents.nextgenDashEventsMod.^ {
  val blending: Boolean | IsBlending = js.native
  val dst: Terminal | ScreenBuffer = js.native
  val x: Double = js.native
  val y: Double = js.native
  def attr2object(attrFlags: Double): Unit = js.native
  def clear(): Unit = js.native
  def draw(): Unit = js.native
  def draw(options: DrawOptions): Unit = js.native
  def drawCursor(): Unit = js.native
  def drawCursor(options: Anon_Dst): Unit = js.native
  def dumpChars(): String = js.native
  def fill(): Unit = js.native
  def fill(options: Anon_Attr): Unit = js.native
  def get(): Anon_AttrChar = js.native
  def get(options: Anon_X): Anon_AttrChar = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def object2attr(attrObject: Attributes): Unit = js.native
  def put(options: PutOptions, format: String, formatArgumets: js.Any*): Unit = js.native
  def resize(fromRect: typings.terminalDashKit.rectMod.Options): Unit = js.native
  def resize(fromRect: typings.terminalDashKit.rectMod.^): Unit = js.native
  def saveSync(filepath: String): Unit = js.native
  def vScroll(offset: Double, drawToTerminal: Boolean): Unit = js.native
}

