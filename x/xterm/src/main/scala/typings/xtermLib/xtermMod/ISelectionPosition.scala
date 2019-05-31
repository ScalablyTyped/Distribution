package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a selecrtion within the terminal.
  */
trait ISelectionPosition extends js.Object {
  /**
    * The end column of the selection.
    */
  var endColumn: scala.Double
  /**
    * The end row of the selection.
    */
  var endRow: scala.Double
  /**
    * The start column of the selection.
    */
  var startColumn: scala.Double
  /**
    * The start row of the selection.
    */
  var startRow: scala.Double
}

object ISelectionPosition {
  @scala.inline
  def apply(endColumn: scala.Double, endRow: scala.Double, startColumn: scala.Double, startRow: scala.Double): ISelectionPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn, endRow = endRow, startColumn = startColumn, startRow = startRow)
  
    __obj.asInstanceOf[ISelectionPosition]
  }
}

