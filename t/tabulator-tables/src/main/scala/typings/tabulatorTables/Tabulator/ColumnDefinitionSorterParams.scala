package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.avg
import typings.tabulatorTables.tabulatorTablesStrings.bottom
import typings.tabulatorTables.tabulatorTablesStrings.length
import typings.tabulatorTables.tabulatorTablesStrings.max
import typings.tabulatorTables.tabulatorTablesStrings.min
import typings.tabulatorTables.tabulatorTablesStrings.sum
import typings.tabulatorTables.tabulatorTablesStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinitionSorterParams extends js.Object {
  var alignEmptyValues: js.UndefOr[top | bottom] = js.native
  var format: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String | Boolean] = js.native
  var `type`: js.UndefOr[length | sum | max | min | avg] = js.native
}

object ColumnDefinitionSorterParams {
  @scala.inline
  def apply(): ColumnDefinitionSorterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinitionSorterParams]
  }
  @scala.inline
  implicit class ColumnDefinitionSorterParamsOps[Self <: ColumnDefinitionSorterParams] (val x: Self) extends AnyVal {
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
    def setAlignEmptyValues(value: top | bottom): Self = this.set("alignEmptyValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignEmptyValues: Self = this.set("alignEmptyValues", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLocale(value: String | Boolean): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setType(value: length | sum | max | min | avg): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

