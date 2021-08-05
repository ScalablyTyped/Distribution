package typings.xterm.mod

import typings.xterm.xtermStrings.alternate
import typings.xterm.xtermStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a terminal buffer.
  */
trait IBuffer extends StObject {
  
  /**
    * The line within the buffer where the top of the bottom page is (when
    * fully scrolled down).
    */
  val baseY: Double
  
  /**
    * The x position of the cursor. This ranges between `0` (left side) and
    * `Terminal.cols` (after last cell of the row).
    */
  val cursorX: Double
  
  /**
    * The y position of the cursor. This ranges between `0` (when the
    * cursor is at baseY) and `Terminal.rows - 1` (when the cursor is on the
    * last row).
    */
  val cursorY: Double
  
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
  def getLine(y: Double): js.UndefOr[IBufferLine]
  
  /**
    * Creates an empty cell object suitable as a cell reference in
    * `line.getCell(x, cell)`. Use this to avoid costly recreation of
    * cell objects when dealing with tons of cells.
    */
  def getNullCell(): IBufferCell
  
  /**
    * The amount of lines in the buffer.
    */
  val length: Double
  
  /**
    * The type of the buffer.
    */
  val `type`: normal | alternate
  
  /**
    * The line within the buffer where the top of the viewport is.
    */
  val viewportY: Double
}
object IBuffer {
  
  inline def apply(
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
  
  extension [Self <: IBuffer](x: Self) {
    
    inline def setBaseY(value: Double): Self = StObject.set(x, "baseY", value.asInstanceOf[js.Any])
    
    inline def setCursorX(value: Double): Self = StObject.set(x, "cursorX", value.asInstanceOf[js.Any])
    
    inline def setCursorY(value: Double): Self = StObject.set(x, "cursorY", value.asInstanceOf[js.Any])
    
    inline def setGetLine(value: Double => js.UndefOr[IBufferLine]): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
    
    inline def setGetNullCell(value: () => IBufferCell): Self = StObject.set(x, "getNullCell", js.Any.fromFunction0(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setType(value: normal | alternate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewportY(value: Double): Self = StObject.set(x, "viewportY", value.asInstanceOf[js.Any])
  }
}
