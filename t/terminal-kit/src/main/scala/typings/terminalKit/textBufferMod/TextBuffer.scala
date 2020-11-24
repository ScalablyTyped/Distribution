package typings.terminalKit.textBufferMod

import typings.terminalKit.anon.FinalCall
import typings.terminalKit.anon.Height
import typings.terminalKit.anon.Misc
import typings.terminalKit.anon.`4`
import typings.terminalKit.rectMod.Region
import typings.terminalKit.screenBufferMod.Attributes
import typings.terminalKit.screenBufferMod.DrawOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBuffer extends js.Object {
  
  def bulkDelete(): Unit = js.native
  def bulkDelete(n: Double): Unit = js.native
  
  def delete(): Unit = js.native
  def delete(n: Double): Unit = js.native
  
  def draw(): Unit = js.native
  def draw(options: DrawOptions): Unit = js.native
  
  def drawCursor(): Unit = js.native
  def drawCursor(options: `4`): Unit = js.native
  
  def getContentSize(): Height = js.native
  
  def getHidden(): Boolean = js.native
  
  def getMisc(): js.Any = js.native
  
  def getMiscAt(x: Double, y: Double): js.Any = js.native
  
  def getText(): String = js.native
  
  def insert(text: String): Unit = js.native
  def insert(text: String, attr: Double): Unit = js.native
  def insert(text: String, attr: Attributes): Unit = js.native
  
  def iterate(options: FinalCall, callback: js.Function1[/* cellData */ Misc, Unit]): Unit = js.native
  
  def joinLine(): Unit = js.native
  
  def load(filepath: String, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def move(x: Double, y: Double): Unit = js.native
  
  def moveBackward(justSkipNullCells: Boolean): Unit = js.native
  
  def moveDown(): Unit = js.native
  
  def moveForward(justSkipNullCells: Boolean): Unit = js.native
  
  def moveInBound(ignoreCx: Boolean): Unit = js.native
  
  def moveLeft(): Unit = js.native
  
  def moveRight(): Unit = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  def moveToColumn(x: Double): Unit = js.native
  
  def moveToEndOfLine(): Unit = js.native
  
  def moveToLine(y: Double): Unit = js.native
  
  def moveToRow(y: Double): Unit = js.native
  
  def moveUp(): Unit = js.native
  
  def newLine(): Unit = js.native
  
  def save(filepath: String, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def setAttrAt(attr: Double, x: Double, y: Double): Unit = js.native
  def setAttrAt(attr: Attributes, x: Double, y: Double): Unit = js.native
  
  def setAttrCodeAt(attr: Double, x: Double, y: Double): Unit = js.native
  
  def setAttrCodeRegion(attr: Double): Unit = js.native
  def setAttrCodeRegion(attr: Double, region: Region): Unit = js.native
  
  def setAttrRegion(attr: Double): Unit = js.native
  def setAttrRegion(attr: Double, region: Region): Unit = js.native
  def setAttrRegion(attr: Attributes): Unit = js.native
  def setAttrRegion(attr: Attributes, region: Region): Unit = js.native
  
  def setEmptyCellAttr(attr: Double): Unit = js.native
  def setEmptyCellAttr(attr: Attributes): Unit = js.native
  
  def setHidden(state: Boolean): Unit = js.native
  
  def setText(text: String): Unit = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
