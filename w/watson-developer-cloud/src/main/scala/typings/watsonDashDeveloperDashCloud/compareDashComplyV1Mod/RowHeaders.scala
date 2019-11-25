package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Row-level cells, each applicable as a header to other cells in the same row as itself, of the current table. */
trait RowHeaders extends js.Object {
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.undefined
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.undefined
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.undefined
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.undefined
  /** The textual contents of this cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.undefined
  /** If you provide customization input, the normalized version of the cell text according to the customization; otherwise, the same value as `text`. */
  var text_normalized: js.UndefOr[String] = js.undefined
}

object RowHeaders {
  @scala.inline
  def apply(
    cell_id: String = null,
    column_index_begin: Int | Double = null,
    column_index_end: Int | Double = null,
    location: Location = null,
    row_index_begin: Int | Double = null,
    row_index_end: Int | Double = null,
    text: String = null,
    text_normalized: String = null
  ): RowHeaders = {
    val __obj = js.Dynamic.literal()
    if (cell_id != null) __obj.updateDynamic("cell_id")(cell_id.asInstanceOf[js.Any])
    if (column_index_begin != null) __obj.updateDynamic("column_index_begin")(column_index_begin.asInstanceOf[js.Any])
    if (column_index_end != null) __obj.updateDynamic("column_index_end")(column_index_end.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (row_index_begin != null) __obj.updateDynamic("row_index_begin")(row_index_begin.asInstanceOf[js.Any])
    if (row_index_end != null) __obj.updateDynamic("row_index_end")(row_index_end.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (text_normalized != null) __obj.updateDynamic("text_normalized")(text_normalized.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeaders]
  }
}

