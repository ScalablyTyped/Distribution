package typings.xtermAddonFit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITerminalDimensions extends js.Object {
  /**
    * The number of columns in the terminal.
    */
  var cols: Double = js.native
  /**
    * The number of rows in the terminal.
    */
  var rows: Double = js.native
}

object ITerminalDimensions {
  @scala.inline
  def apply(cols: Double, rows: Double): ITerminalDimensions = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITerminalDimensions]
  }
  @scala.inline
  implicit class ITerminalDimensionsOps[Self <: ITerminalDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

