package typings.tablesorter.pagerDataPartMod

import typings.tablesorter.mod._Global_.HTMLElement
import typings.tablesorter.mod._Global_.JQuery
import typings.tablesorter.pagerOutputProcessorMod.PagerOutputProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerDataPart[TElement] extends js.Object {
  /**
    * The number of filtered rows.
    */
  var filteredRows: js.UndefOr[Double] = js.undefined
  /**
    * The column-names of the table.
    */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
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
  var output: js.UndefOr[String | PagerOutputProcessor[TElement]] = js.undefined
  /**
    * The data to show.
    */
  var rows: js.UndefOr[js.Array[js.Array[_]] | JQuery[HTMLElement]] = js.undefined
  /**
    * The number of total rows.
    */
  var total: Double
}

object PagerDataPart {
  @scala.inline
  def apply[TElement](
    total: Double,
    filteredRows: Int | Double = null,
    headers: js.Array[String] = null,
    output: String | PagerOutputProcessor[TElement] = null,
    rows: js.Array[js.Array[_]] | JQuery[HTMLElement] = null
  ): PagerDataPart[TElement] = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    if (filteredRows != null) __obj.updateDynamic("filteredRows")(filteredRows.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerDataPart[TElement]]
  }
}

