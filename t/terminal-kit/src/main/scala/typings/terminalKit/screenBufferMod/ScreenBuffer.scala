package typings.terminalKit.screenBufferMod

import typings.terminalKit.AnonAttr
import typings.terminalKit.AnonAttrChar
import typings.terminalKit.AnonDst
import typings.terminalKit.AnonX
import typings.terminalKit.screenBufferHDMod.IsBlending
import typings.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBuffer
  extends typings.nextgenEvents.mod.^ {
  val blending: Boolean | IsBlending = js.native
  val dst: Terminal | ScreenBuffer = js.native
  val x: Double = js.native
  val y: Double = js.native
  def attr2object(attrFlags: Double): Unit = js.native
  def clear(): Unit = js.native
  def draw(): Unit = js.native
  def draw(options: DrawOptions): Unit = js.native
  def drawCursor(): Unit = js.native
  def drawCursor(options: AnonDst): Unit = js.native
  def dumpChars(): String = js.native
  def fill(): Unit = js.native
  def fill(options: AnonAttr): Unit = js.native
  def get(): AnonAttrChar = js.native
  def get(options: AnonX): AnonAttrChar = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def object2attr(attrObject: Attributes): Unit = js.native
  def put(options: PutOptions, format: String, formatArgumets: js.Any*): Unit = js.native
  def resize(fromRect: typings.terminalKit.rectMod.Options): Unit = js.native
  def resize(fromRect: typings.terminalKit.rectMod.^): Unit = js.native
  def saveSync(filepath: String): Unit = js.native
  def vScroll(offset: Double, drawToTerminal: Boolean): Unit = js.native
}

