package typings.tablesorter.controlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlOptions extends js.Object {
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.native
}

object ControlOptions {
  @scala.inline
  def apply(): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlOptions]
  }
  @scala.inline
  implicit class ControlOptionsOps[Self <: ControlOptions] (val x: Self) extends AnyVal {
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
    def setCellText(value: String): Self = this.set("cellText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellText: Self = this.set("cellText", js.undefined)
  }
  
}

