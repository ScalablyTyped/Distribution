package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberParams
  extends SharedEditorParams
     with _EditorParams {
  var max: js.UndefOr[Double] = js.native
  // range,number
  var min: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var verticalNavigation: js.UndefOr[editor | table] = js.native
}

object NumberParams {
  @scala.inline
  def apply(): NumberParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberParams]
  }
  @scala.inline
  implicit class NumberParamsOps[Self <: NumberParams] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setVerticalNavigation(value: editor | table): Self = this.set("verticalNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalNavigation: Self = this.set("verticalNavigation", js.undefined)
  }
  
}

