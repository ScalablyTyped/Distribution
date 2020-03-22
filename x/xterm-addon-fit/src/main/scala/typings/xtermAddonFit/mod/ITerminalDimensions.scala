package typings.xtermAddonFit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITerminalDimensions extends js.Object {
  /**
    * The number of columns in the terminal.
    */
  var cols: Double
  /**
    * The number of rows in the terminal.
    */
  var rows: Double
}

object ITerminalDimensions {
  @scala.inline
  def apply(cols: Double, rows: Double): ITerminalDimensions = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITerminalDimensions]
  }
}

