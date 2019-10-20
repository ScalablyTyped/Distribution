package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Cells that are not table header, column header, or row header cells. */
trait BodyCells extends js.Object {
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.undefined
  var column_header_ids: js.UndefOr[js.Array[ColumnHeaderIds]] = js.undefined
  var column_header_texts: js.UndefOr[js.Array[ColumnHeaderTexts]] = js.undefined
  var column_header_texts_normalized: js.UndefOr[js.Array[ColumnHeaderTextsNormalized]] = js.undefined
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.undefined
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  var row_header_ids: js.UndefOr[js.Array[RowHeaderIds]] = js.undefined
  var row_header_texts: js.UndefOr[js.Array[RowHeaderTexts]] = js.undefined
  var row_header_texts_normalized: js.UndefOr[js.Array[RowHeaderTextsNormalized]] = js.undefined
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.undefined
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.undefined
  /** The textual contents of this cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.undefined
}

object BodyCells {
  @scala.inline
  def apply(
    attributes: js.Array[Attribute] = null,
    cell_id: String = null,
    column_header_ids: js.Array[ColumnHeaderIds] = null,
    column_header_texts: js.Array[ColumnHeaderTexts] = null,
    column_header_texts_normalized: js.Array[ColumnHeaderTextsNormalized] = null,
    column_index_begin: Int | Double = null,
    column_index_end: Int | Double = null,
    location: Location = null,
    row_header_ids: js.Array[RowHeaderIds] = null,
    row_header_texts: js.Array[RowHeaderTexts] = null,
    row_header_texts_normalized: js.Array[RowHeaderTextsNormalized] = null,
    row_index_begin: Int | Double = null,
    row_index_end: Int | Double = null,
    text: String = null
  ): BodyCells = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (cell_id != null) __obj.updateDynamic("cell_id")(cell_id)
    if (column_header_ids != null) __obj.updateDynamic("column_header_ids")(column_header_ids)
    if (column_header_texts != null) __obj.updateDynamic("column_header_texts")(column_header_texts)
    if (column_header_texts_normalized != null) __obj.updateDynamic("column_header_texts_normalized")(column_header_texts_normalized)
    if (column_index_begin != null) __obj.updateDynamic("column_index_begin")(column_index_begin.asInstanceOf[js.Any])
    if (column_index_end != null) __obj.updateDynamic("column_index_end")(column_index_end.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (row_header_ids != null) __obj.updateDynamic("row_header_ids")(row_header_ids)
    if (row_header_texts != null) __obj.updateDynamic("row_header_texts")(row_header_texts)
    if (row_header_texts_normalized != null) __obj.updateDynamic("row_header_texts_normalized")(row_header_texts_normalized)
    if (row_index_begin != null) __obj.updateDynamic("row_index_begin")(row_index_begin.asInstanceOf[js.Any])
    if (row_index_end != null) __obj.updateDynamic("row_index_end")(row_index_end.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BodyCells]
  }
}

