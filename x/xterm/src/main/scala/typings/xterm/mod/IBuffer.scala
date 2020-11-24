package typings.xterm.mod

import typings.xterm.xtermStrings.alternate
import typings.xterm.xtermStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a terminal buffer.
  */
@js.native
trait IBuffer extends js.Object {
  
  /**
    * The line within the buffer where the top of the bottom page is (when
    * fully scrolled down).
    */
  val baseY: Double = js.native
  
  /**
    * The x position of the cursor. This ranges between `0` (left side) and
    * `Terminal.cols` (after last cell of the row).
    */
  val cursorX: Double = js.native
  
  /**
    * The y position of the cursor. This ranges between `0` (when the
    * cursor is at baseY) and `Terminal.rows - 1` (when the cursor is on the
    * last row).
    */
  val cursorY: Double = js.native
  
  /**
    * Gets a line from the buffer, or undefined if the line index does not
    * exist.
    *
    * Note that the result of this function should be used immediately after
    * calling as when the terminal updates it could lead to unexpected
    * behavior.
    *
    * @param y The line index to get.
    */
  def getLine(y: Double): js.UndefOr[IBufferLine] = js.native
  
  /**
    * Creates an empty cell object suitable as a cell reference in
    * `line.getCell(x, cell)`. Use this to avoid costly recreation of
    * cell objects when dealing with tons of cells.
    */
  def getNullCell(): IBufferCell = js.native
  
  /**
    * The amount of lines in the buffer.
    */
  val length: Double = js.native
  
  /**
    * The type of the buffer.
    */
  val `type`: normal | alternate = js.native
  
  /**
    * The line within the buffer where the top of the viewport is.
    */
  val viewportY: Double = js.native
}
object IBuffer {
  
  @scala.inline
  def apply(
    baseY: Double,
    cursorX: Double,
    cursorY: Double,
    getLine: Double => js.UndefOr[IBufferLine],
    getNullCell: () => IBufferCell,
    length: Double,
    `type`: normal | alternate,
    viewportY: Double
  ): IBuffer = {
    val __obj = js.Dynamic.literal(baseY = baseY.asInstanceOf[js.Any], cursorX = cursorX.asInstanceOf[js.Any], cursorY = cursorY.asInstanceOf[js.Any], getLine = js.Any.fromFunction1(getLine), getNullCell = js.Any.fromFunction0(getNullCell), length = length.asInstanceOf[js.Any], viewportY = viewportY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuffer]
  }
  
  @scala.inline
  implicit class IBufferOps[Self <: IBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseY(value: Double): Self = this.set("baseY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorX(value: Double): Self = this.set("cursorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorY(value: Double): Self = this.set("cursorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLine(value: Double => js.UndefOr[IBufferLine]): Self = this.set("getLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNullCell(value: () => IBufferCell): Self = this.set("getNullCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: normal | alternate): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportY(value: Double): Self = this.set("viewportY", value.asInstanceOf[js.Any])
  }
}
