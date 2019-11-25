package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a cell position within the viewport of the terminal.
  */
trait IViewportRangePosition extends js.Object {
  /**
    * The x position of the cell. This is a 0-based index that refers to the
    * space in between columns, not the column itself. Index 0 refers to the
    * left side of the viewport, index `Terminal.cols` refers to the right side
    * of the viewport. This can be thought of as how a cursor is positioned in
    * a text editor.
    */
  var x: Double
  /**
    * The y position of the cell. This is a 0-based index that refers to a
    * specific row.
    */
  var y: Double
}

object IViewportRangePosition {
  @scala.inline
  def apply(x: Double, y: Double): IViewportRangePosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IViewportRangePosition]
  }
}

