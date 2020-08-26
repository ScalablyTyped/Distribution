package typings.tablesorter.pagerDataPartMod

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerDataPart[TElement] extends js.Object {
  /**
    * The number of filtered rows.
    */
  var filteredRows: js.UndefOr[Double] = js.native
  /**
    * The column-names of the table.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The output to display in the output-area.
    *
    * Following portions of text are substituted:
    *
    * | Tag                | Replacement                                  |
    * |--------------------|----------------------------------------------|
    * | `{size}`           | The current page size.                       |
    * | `{page}`           | The current page.                            |
    * | `{page:input}`     | The page inputted by the user.               |
    * | `{totalPages}`     | The total amount of pages.                   |
    * | `{filteredPages}`  | The filtered number of pages.                |
    * | `{startRow}`       | The number of the first row being displayed. |
    * | `{startRow:input}` | The start-row inputted by the user.          |
    * | `{endRow}`         | The number of the last row being displayed.  |
    * | `{filteredRows}`   | The amount of filtered rows.                 |
    * | `{totalRows}`      | The total amount of rows.                    |
    */
  var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.native
  /**
    * The data to show.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]] | JQuery[HTMLElement]] = js.native
  /**
    * The number of total rows.
    */
  var total: Double = js.native
}

object PagerDataPart {
  @scala.inline
  def apply[TElement](total: Double): PagerDataPart[TElement] = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerDataPart[TElement]]
  }
  @scala.inline
  implicit class PagerDataPartOps[Self <: PagerDataPart[_], TElement] (val x: Self with PagerDataPart[TElement]) extends AnyVal {
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
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilteredRows(value: Double): Self = this.set("filteredRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredRows: Self = this.set("filteredRows", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setOutputFunction2(value: (TElement, /* pager */ js.Any) => String): Self = this.set("output", js.Any.fromFunction2(value))
    @scala.inline
    def setOutput(value: String | PagerOutputProcessor[TElement]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[_]] | JQuery[HTMLElement]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

