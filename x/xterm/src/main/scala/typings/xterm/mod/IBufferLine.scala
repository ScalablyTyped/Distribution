package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a line in the terminal's buffer.
  */
@js.native
trait IBufferLine extends StObject {
  
  /**
    * Gets a cell from the line, or undefined if the line index does not exist.
    *
    * Note that the result of this function should be used immediately after
    * calling as when the terminal updates it could lead to unexpected
    * behavior.
    *
    * @param x The character index to get.
    * @param cell Optional cell object to load data into for performance
    * reasons. This is mainly useful when every cell in the buffer is being
    * looped over to avoid creating new objects for every cell.
    */
  def getCell(x: Double): js.UndefOr[IBufferCell] = js.native
  def getCell(x: Double, cell: IBufferCell): js.UndefOr[IBufferCell] = js.native
  
  /**
    * Whether the line is wrapped from the previous line.
    */
  val isWrapped: Boolean = js.native
  
  /**
    * The length of the line, all call to getCell beyond the length will result
    * in `undefined`.
    */
  val length: Double = js.native
  
  /**
    * Gets the line as a string. Note that this is gets only the string for the
    * line, not taking isWrapped into account.
    *
    * @param trimRight Whether to trim any whitespace at the right of the line.
    * @param startColumn The column to start from (inclusive).
    * @param endColumn The column to end at (exclusive).
    */
  def translateToString(): String = js.native
  def translateToString(trimRight: Boolean): String = js.native
  def translateToString(trimRight: Boolean, startColumn: Double): String = js.native
  def translateToString(trimRight: Boolean, startColumn: Double, endColumn: Double): String = js.native
  def translateToString(trimRight: Boolean, startColumn: Unit, endColumn: Double): String = js.native
  def translateToString(trimRight: Unit, startColumn: Double): String = js.native
  def translateToString(trimRight: Unit, startColumn: Double, endColumn: Double): String = js.native
  def translateToString(trimRight: Unit, startColumn: Unit, endColumn: Double): String = js.native
}
