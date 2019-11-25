package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The contents of the tables extracted from a document. */
trait Tables extends js.Object {
  /** An array of cells that are neither table header nor column header nor row header cells, of the current table with corresponding row and column header associations. */
  var body_cells: js.UndefOr[js.Array[BodyCells]] = js.undefined
  /** An array of column-level cells, each applicable as a header to other cells in the same column as itself, of the current table. */
  var column_headers: js.UndefOr[js.Array[ColumnHeaders]] = js.undefined
  /** An array of key-value pairs identified in the current table. */
  var key_value_pairs: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  /** An array of row-level cells, each applicable as a header to other cells in the same row as itself, of the current table. */
  var row_headers: js.UndefOr[js.Array[RowHeaders]] = js.undefined
  /** The table's section title, if identified. */
  var section_title: js.UndefOr[SectionTitle] = js.undefined
  /** An array of table-level cells that apply as headers to all the other cells in the current table. */
  var table_headers: js.UndefOr[js.Array[TableHeaders]] = js.undefined
  /** The textual contents of the current table from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.undefined
}

object Tables {
  @scala.inline
  def apply(
    body_cells: js.Array[BodyCells] = null,
    column_headers: js.Array[ColumnHeaders] = null,
    key_value_pairs: js.Array[KeyValuePair] = null,
    location: Location = null,
    row_headers: js.Array[RowHeaders] = null,
    section_title: SectionTitle = null,
    table_headers: js.Array[TableHeaders] = null,
    text: String = null
  ): Tables = {
    val __obj = js.Dynamic.literal()
    if (body_cells != null) __obj.updateDynamic("body_cells")(body_cells.asInstanceOf[js.Any])
    if (column_headers != null) __obj.updateDynamic("column_headers")(column_headers.asInstanceOf[js.Any])
    if (key_value_pairs != null) __obj.updateDynamic("key_value_pairs")(key_value_pairs.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (row_headers != null) __obj.updateDynamic("row_headers")(row_headers.asInstanceOf[js.Any])
    if (section_title != null) __obj.updateDynamic("section_title")(section_title.asInstanceOf[js.Any])
    if (table_headers != null) __obj.updateDynamic("table_headers")(table_headers.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tables]
  }
}

