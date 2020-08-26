package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalDimensions extends js.Object {
  /**
    * The number of columns in the terminal.
    */
  val columns: Double = js.native
  /**
    * The number of rows in the terminal.
    */
  val rows: Double = js.native
}

object TerminalDimensions {
  @scala.inline
  def apply(columns: Double, rows: Double): TerminalDimensions = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminalDimensions]
  }
  @scala.inline
  implicit class TerminalDimensionsOps[Self <: TerminalDimensions] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

