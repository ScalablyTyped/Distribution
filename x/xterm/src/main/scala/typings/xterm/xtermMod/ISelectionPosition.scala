package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a selection within the terminal.
  */
trait ISelectionPosition extends js.Object {
  /**
    * The end column of the selection.
    */
  var endColumn: Double
  /**
    * The end row of the selection.
    */
  var endRow: Double
  /**
    * The start column of the selection.
    */
  var startColumn: Double
  /**
    * The start row of the selection.
    */
  var startRow: Double
}

object ISelectionPosition {
  @scala.inline
  def apply(endColumn: Double, endRow: Double, startColumn: Double, startRow: Double): ISelectionPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectionPosition]
  }
}

