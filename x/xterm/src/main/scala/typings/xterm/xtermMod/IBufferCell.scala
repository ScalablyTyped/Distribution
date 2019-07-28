package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBufferCell extends js.Object {
  /**
    * The character within the cell.
    */
  val char: String
  /**
    * The width of the character. Some examples:
    *
    * - This is `1` for most cells.
    * - This is `2` for wide character like CJK glyphs.
    * - This is `0` for cells immediately following cells with a width of `2`.
    */
  val width: Double
}

object IBufferCell {
  @scala.inline
  def apply(char: String, width: Double): IBufferCell = {
    val __obj = js.Dynamic.literal(char = char, width = width)
  
    __obj.asInstanceOf[IBufferCell]
  }
}

