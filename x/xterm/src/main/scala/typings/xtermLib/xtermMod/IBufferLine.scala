package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBufferLine extends js.Object {
  /**
    * Whether the line is wrapped from the previous line.
    */
  val isWrapped: scala.Boolean = js.native
  /**
    * Gets a cell from the line, or undefined if the line index does not exist.
    *
    * Note that the result of this function should be used immediately after calling as when the
    * terminal updates it could lead to unexpected behavior.
    *
    * @param x The character index to get.
    */
  def getCell(x: scala.Double): IBufferCell = js.native
  /**
    * Gets the line as a string. Note that this is gets only the string for the line, not taking
    * isWrapped into account.
    *
    * @param trimRight Whether to trim any whitespace at the right of the line.
    * @param startColumn The column to start from (inclusive).
    * @param endColumn The column to end at (exclusive).
    */
  def translateToString(): java.lang.String = js.native
  def translateToString(trimRight: scala.Boolean): java.lang.String = js.native
  def translateToString(trimRight: scala.Boolean, startColumn: scala.Double): java.lang.String = js.native
  def translateToString(trimRight: scala.Boolean, startColumn: scala.Double, endColumn: scala.Double): java.lang.String = js.native
}

