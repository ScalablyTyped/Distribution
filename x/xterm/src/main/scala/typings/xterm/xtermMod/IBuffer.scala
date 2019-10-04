package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a terminal buffer.
  */
trait IBuffer extends js.Object {
  /**
    * The line within the buffer where the top of the bottom page is (when
    * fully scrolled down);
    */
  val baseY: Double
  /**
    * The x position of the cursor. This ranges between `0` (left side) and
    * `Terminal.cols - 1` (right side).
    */
  val cursorX: Double
  /**
    * The y position of the cursor. This ranges between `0` (when the
    * cursor is at baseY) and `Terminal.rows - 1` (when the cursor is on the
    * last row).
    */
  val cursorY: Double
  /**
    * The amount of lines in the buffer.
    */
  val length: Double
  /**
    * The line within the buffer where the top of the viewport is.
    */
  val viewportY: Double
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
}

object IBuffer {
  @scala.inline
  def apply(
    baseY: Double,
    cursorX: Double,
    cursorY: Double,
    getLine: Double => js.UndefOr[IBufferLine],
    length: Double,
    viewportY: Double
  ): IBuffer = {
    val __obj = js.Dynamic.literal(baseY = baseY, cursorX = cursorX, cursorY = cursorY, getLine = js.Any.fromFunction1(getLine), length = length, viewportY = viewportY)
  
    __obj.asInstanceOf[IBuffer]
  }
}

