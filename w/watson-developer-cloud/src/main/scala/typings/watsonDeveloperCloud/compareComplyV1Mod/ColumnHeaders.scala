package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Column-level cells, each applicable as a header to other cells in the same column as itself, of the current table. */
trait ColumnHeaders extends js.Object {
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.undefined
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.undefined
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.undefined
  /** The location of the column header cell in the current table as defined by its `begin` and `end` offsets, respectfully, in the input document. */
  var location: js.UndefOr[js.Object] = js.undefined
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.undefined
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.undefined
  /** The textual contents of this cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.undefined
  /** If you provide customization input, the normalized version of the cell text according to the customization; otherwise, the same value as `text`. */
  var text_normalized: js.UndefOr[String] = js.undefined
}

object ColumnHeaders {
  @scala.inline
  def apply(
    cell_id: String = null,
    column_index_begin: js.UndefOr[Double] = js.undefined,
    column_index_end: js.UndefOr[Double] = js.undefined,
    location: js.Object = null,
    row_index_begin: js.UndefOr[Double] = js.undefined,
    row_index_end: js.UndefOr[Double] = js.undefined,
    text: String = null,
    text_normalized: String = null
  ): ColumnHeaders = {
    val __obj = js.Dynamic.literal()
    if (cell_id != null) __obj.updateDynamic("cell_id")(cell_id.asInstanceOf[js.Any])
    if (!js.isUndefined(column_index_begin)) __obj.updateDynamic("column_index_begin")(column_index_begin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(column_index_end)) __obj.updateDynamic("column_index_end")(column_index_end.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(row_index_begin)) __obj.updateDynamic("row_index_begin")(row_index_begin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(row_index_end)) __obj.updateDynamic("row_index_end")(row_index_end.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (text_normalized != null) __obj.updateDynamic("text_normalized")(text_normalized.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnHeaders]
  }
}

