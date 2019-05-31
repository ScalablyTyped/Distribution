package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuffer extends js.Object {
  /**
    * The line within the buffer where the top of the bottom page is (when
    * fully scrolled down);
    */
  val baseY: scala.Double
  /**
    * The x position of the cursor. This ranges between `0` (left side) and
    * `Terminal.cols - 1` (right side).
    */
  val cursorX: scala.Double
  /**
    * The y position of the cursor. This ranges between `0` (when the
    * cursor is at baseY) and `Terminal.rows - 1` (when the cursor is on the
    * last row).
    */
  val cursorY: scala.Double
  /**
    * The amount of lines in the buffer.
    */
  val length: scala.Double
  /**
    * The line within the buffer where the top of the viewport is.
    */
  val viewportY: scala.Double
  /**
    * Gets a line from the buffer, or undefined if the line index does not exist.
    *
    * Note that the result of this function should be used immediately after calling as when the
    * terminal updates it could lead to unexpected behavior.
    *
    * @param y The line index to get.
    */
  def getLine(y: scala.Double): js.UndefOr[IBufferLine]
}

object IBuffer {
  @scala.inline
  def apply(
    baseY: scala.Double,
    cursorX: scala.Double,
    cursorY: scala.Double,
    getLine: scala.Double => js.UndefOr[IBufferLine],
    length: scala.Double,
    viewportY: scala.Double
  ): IBuffer = {
    val __obj = js.Dynamic.literal(baseY = baseY, cursorX = cursorX, cursorY = cursorY, getLine = js.Any.fromFunction1(getLine), length = length, viewportY = viewportY)
  
    __obj.asInstanceOf[IBuffer]
  }
}

