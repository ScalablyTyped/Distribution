package typings
package terminalDashKitLib.textbufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBuffer extends js.Object {
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  def bulkDelete(): scala.Unit = js.native
  def bulkDelete(n: scala.Double): scala.Unit = js.native
  def delete(): scala.Unit = js.native
  def delete(n: scala.Double): scala.Unit = js.native
  def draw(): scala.Unit = js.native
  def draw(options: terminalDashKitLib.screenbufferMod.ScreenBufferNs.DrawOptions): scala.Unit = js.native
  def drawCursor(): scala.Unit = js.native
  def drawCursor(options: terminalDashKitLib.Anon_DstNamespaced): scala.Unit = js.native
  def getContentSize(): terminalDashKitLib.Anon_Height = js.native
  def getHidden(): scala.Boolean = js.native
  def getMisc(): js.Any = js.native
  def getMiscAt(x: scala.Double, y: scala.Double): js.Any = js.native
  def getText(): java.lang.String = js.native
  def insert(text: java.lang.String): scala.Unit = js.native
  def insert(text: java.lang.String, attr: scala.Double): scala.Unit = js.native
  def insert(text: java.lang.String, attr: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes): scala.Unit = js.native
  def iterate(
    options: terminalDashKitLib.Anon_FinalCall,
    callback: js.Function1[/* cellData */ terminalDashKitLib.Anon_AttrMisc, scala.Unit]
  ): scala.Unit = js.native
  def joinLine(): scala.Unit = js.native
  def load(filepath: java.lang.String, callback: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def move(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveBackward(justSkipNullCells: scala.Boolean): scala.Unit = js.native
  def moveDown(): scala.Unit = js.native
  def moveForward(justSkipNullCells: scala.Boolean): scala.Unit = js.native
  def moveInBound(ignoreCx: scala.Boolean): scala.Unit = js.native
  def moveLeft(): scala.Unit = js.native
  def moveRight(): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveToColumn(x: scala.Double): scala.Unit = js.native
  def moveToEndOfLine(): scala.Unit = js.native
  def moveToLine(y: scala.Double): scala.Unit = js.native
  def moveToRow(y: scala.Double): scala.Unit = js.native
  def moveUp(): scala.Unit = js.native
  def newLine(): scala.Unit = js.native
  def save(filepath: java.lang.String, callback: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def setAttrAt(attr: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setAttrAt(
    attr: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def setAttrCodeAt(attr: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setAttrCodeRegion(attr: scala.Double): scala.Unit = js.native
  def setAttrCodeRegion(attr: scala.Double, region: terminalDashKitLib.rectMod.RectNs.Region): scala.Unit = js.native
  def setAttrRegion(attr: scala.Double): scala.Unit = js.native
  def setAttrRegion(attr: scala.Double, region: terminalDashKitLib.rectMod.RectNs.Region): scala.Unit = js.native
  def setAttrRegion(attr: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes): scala.Unit = js.native
  def setAttrRegion(
    attr: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes,
    region: terminalDashKitLib.rectMod.RectNs.Region
  ): scala.Unit = js.native
  def setEmptyCellAttr(attr: scala.Double): scala.Unit = js.native
  def setEmptyCellAttr(attr: terminalDashKitLib.screenbufferMod.ScreenBufferNs.Attributes): scala.Unit = js.native
  def setHidden(state: scala.Boolean): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
}

