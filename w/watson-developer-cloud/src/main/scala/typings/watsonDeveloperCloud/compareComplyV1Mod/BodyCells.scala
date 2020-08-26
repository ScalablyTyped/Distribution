package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Cells that are not table header, column header, or row header cells. */
@js.native
trait BodyCells extends js.Object {
  var attributes: js.UndefOr[js.Array[Attribute]] = js.native
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.native
  var column_header_ids: js.UndefOr[js.Array[ColumnHeaderIds]] = js.native
  var column_header_texts: js.UndefOr[js.Array[ColumnHeaderTexts]] = js.native
  var column_header_texts_normalized: js.UndefOr[js.Array[ColumnHeaderTextsNormalized]] = js.native
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.native
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  var row_header_ids: js.UndefOr[js.Array[RowHeaderIds]] = js.native
  var row_header_texts: js.UndefOr[js.Array[RowHeaderTexts]] = js.native
  var row_header_texts_normalized: js.UndefOr[js.Array[RowHeaderTextsNormalized]] = js.native
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.native
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.native
  /** The textual contents of this cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.native
}

object BodyCells {
  @scala.inline
  def apply(): BodyCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyCells]
  }
  @scala.inline
  implicit class BodyCellsOps[Self <: BodyCells] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[Attribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCell_id(value: String): Self = this.set("cell_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell_id: Self = this.set("cell_id", js.undefined)
    @scala.inline
    def setColumn_header_idsVarargs(value: ColumnHeaderIds*): Self = this.set("column_header_ids", js.Array(value :_*))
    @scala.inline
    def setColumn_header_ids(value: js.Array[ColumnHeaderIds]): Self = this.set("column_header_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn_header_ids: Self = this.set("column_header_ids", js.undefined)
    @scala.inline
    def setColumn_header_textsVarargs(value: ColumnHeaderTexts*): Self = this.set("column_header_texts", js.Array(value :_*))
    @scala.inline
    def setColumn_header_texts(value: js.Array[ColumnHeaderTexts]): Self = this.set("column_header_texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn_header_texts: Self = this.set("column_header_texts", js.undefined)
    @scala.inline
    def setColumn_header_texts_normalizedVarargs(value: ColumnHeaderTextsNormalized*): Self = this.set("column_header_texts_normalized", js.Array(value :_*))
    @scala.inline
    def setColumn_header_texts_normalized(value: js.Array[ColumnHeaderTextsNormalized]): Self = this.set("column_header_texts_normalized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn_header_texts_normalized: Self = this.set("column_header_texts_normalized", js.undefined)
    @scala.inline
    def setColumn_index_begin(value: Double): Self = this.set("column_index_begin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn_index_begin: Self = this.set("column_index_begin", js.undefined)
    @scala.inline
    def setColumn_index_end(value: Double): Self = this.set("column_index_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn_index_end: Self = this.set("column_index_end", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRow_header_idsVarargs(value: RowHeaderIds*): Self = this.set("row_header_ids", js.Array(value :_*))
    @scala.inline
    def setRow_header_ids(value: js.Array[RowHeaderIds]): Self = this.set("row_header_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow_header_ids: Self = this.set("row_header_ids", js.undefined)
    @scala.inline
    def setRow_header_textsVarargs(value: RowHeaderTexts*): Self = this.set("row_header_texts", js.Array(value :_*))
    @scala.inline
    def setRow_header_texts(value: js.Array[RowHeaderTexts]): Self = this.set("row_header_texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow_header_texts: Self = this.set("row_header_texts", js.undefined)
    @scala.inline
    def setRow_header_texts_normalizedVarargs(value: RowHeaderTextsNormalized*): Self = this.set("row_header_texts_normalized", js.Array(value :_*))
    @scala.inline
    def setRow_header_texts_normalized(value: js.Array[RowHeaderTextsNormalized]): Self = this.set("row_header_texts_normalized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow_header_texts_normalized: Self = this.set("row_header_texts_normalized", js.undefined)
    @scala.inline
    def setRow_index_begin(value: Double): Self = this.set("row_index_begin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow_index_begin: Self = this.set("row_index_begin", js.undefined)
    @scala.inline
    def setRow_index_end(value: Double): Self = this.set("row_index_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow_index_end: Self = this.set("row_index_end", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

