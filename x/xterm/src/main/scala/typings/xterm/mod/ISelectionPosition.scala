package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a selection within the terminal.
  */
@js.native
trait ISelectionPosition extends js.Object {
  /**
    * The end column of the selection.
    */
  var endColumn: Double = js.native
  /**
    * The end row of the selection.
    */
  var endRow: Double = js.native
  /**
    * The start column of the selection.
    */
  var startColumn: Double = js.native
  /**
    * The start row of the selection.
    */
  var startRow: Double = js.native
}

object ISelectionPosition {
  @scala.inline
  def apply(endColumn: Double, endRow: Double, startColumn: Double, startRow: Double): ISelectionPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionPosition]
  }
  @scala.inline
  implicit class ISelectionPositionOps[Self <: ISelectionPosition] (val x: Self) extends AnyVal {
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
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndRow(value: Double): Self = this.set("endRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
  }
  
}

