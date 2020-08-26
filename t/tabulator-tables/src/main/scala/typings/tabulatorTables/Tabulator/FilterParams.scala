package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterParams extends js.Object {
  var matchAll: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
}

object FilterParams {
  @scala.inline
  def apply(): FilterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterParams]
  }
  @scala.inline
  implicit class FilterParamsOps[Self <: FilterParams] (val x: Self) extends AnyVal {
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
    def setMatchAll(value: Boolean): Self = this.set("matchAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchAll: Self = this.set("matchAll", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

