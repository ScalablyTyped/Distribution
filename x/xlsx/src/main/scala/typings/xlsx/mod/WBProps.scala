package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WBProps extends js.Object {
  /** Defined Names */
  var Names: js.UndefOr[js.Array[DefinedName]] = js.native
  /** Sheet Properties */
  var Sheets: js.UndefOr[js.Array[SheetProps]] = js.native
  /** Workbook Views */
  var Views: js.UndefOr[js.Array[WBView]] = js.native
  /** Other Workbook Properties */
  var WBProps: js.UndefOr[WorkbookProperties] = js.native
}

object WBProps {
  @scala.inline
  def apply(): WBProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WBProps]
  }
  @scala.inline
  implicit class WBPropsOps[Self <: WBProps] (val x: Self) extends AnyVal {
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
    def setNamesVarargs(value: DefinedName*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[DefinedName]): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setSheetsVarargs(value: SheetProps*): Self = this.set("Sheets", js.Array(value :_*))
    @scala.inline
    def setSheets(value: js.Array[SheetProps]): Self = this.set("Sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheets: Self = this.set("Sheets", js.undefined)
    @scala.inline
    def setViewsVarargs(value: WBView*): Self = this.set("Views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[WBView]): Self = this.set("Views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("Views", js.undefined)
    @scala.inline
    def setWBProps(value: WorkbookProperties): Self = this.set("WBProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWBProps: Self = this.set("WBProps", js.undefined)
  }
  
}

