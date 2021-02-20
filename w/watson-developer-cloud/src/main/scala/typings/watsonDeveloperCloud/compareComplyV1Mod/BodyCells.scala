package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Cells that are not table header, column header, or row header cells. */
@js.native
trait BodyCells extends StObject {
  
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
  implicit class BodyCellsMutableBuilder[Self <: BodyCells] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setCell_id(value: String): Self = StObject.set(x, "cell_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCell_idUndefined: Self = StObject.set(x, "cell_id", js.undefined)
    
    @scala.inline
    def setColumn_header_ids(value: js.Array[ColumnHeaderIds]): Self = StObject.set(x, "column_header_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_header_idsUndefined: Self = StObject.set(x, "column_header_ids", js.undefined)
    
    @scala.inline
    def setColumn_header_idsVarargs(value: ColumnHeaderIds*): Self = StObject.set(x, "column_header_ids", js.Array(value :_*))
    
    @scala.inline
    def setColumn_header_texts(value: js.Array[ColumnHeaderTexts]): Self = StObject.set(x, "column_header_texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_header_textsUndefined: Self = StObject.set(x, "column_header_texts", js.undefined)
    
    @scala.inline
    def setColumn_header_textsVarargs(value: ColumnHeaderTexts*): Self = StObject.set(x, "column_header_texts", js.Array(value :_*))
    
    @scala.inline
    def setColumn_header_texts_normalized(value: js.Array[ColumnHeaderTextsNormalized]): Self = StObject.set(x, "column_header_texts_normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_header_texts_normalizedUndefined: Self = StObject.set(x, "column_header_texts_normalized", js.undefined)
    
    @scala.inline
    def setColumn_header_texts_normalizedVarargs(value: ColumnHeaderTextsNormalized*): Self = StObject.set(x, "column_header_texts_normalized", js.Array(value :_*))
    
    @scala.inline
    def setColumn_index_begin(value: Double): Self = StObject.set(x, "column_index_begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_index_beginUndefined: Self = StObject.set(x, "column_index_begin", js.undefined)
    
    @scala.inline
    def setColumn_index_end(value: Double): Self = StObject.set(x, "column_index_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_index_endUndefined: Self = StObject.set(x, "column_index_end", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRow_header_ids(value: js.Array[RowHeaderIds]): Self = StObject.set(x, "row_header_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow_header_idsUndefined: Self = StObject.set(x, "row_header_ids", js.undefined)
    
    @scala.inline
    def setRow_header_idsVarargs(value: RowHeaderIds*): Self = StObject.set(x, "row_header_ids", js.Array(value :_*))
    
    @scala.inline
    def setRow_header_texts(value: js.Array[RowHeaderTexts]): Self = StObject.set(x, "row_header_texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow_header_textsUndefined: Self = StObject.set(x, "row_header_texts", js.undefined)
    
    @scala.inline
    def setRow_header_textsVarargs(value: RowHeaderTexts*): Self = StObject.set(x, "row_header_texts", js.Array(value :_*))
    
    @scala.inline
    def setRow_header_texts_normalized(value: js.Array[RowHeaderTextsNormalized]): Self = StObject.set(x, "row_header_texts_normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow_header_texts_normalizedUndefined: Self = StObject.set(x, "row_header_texts_normalized", js.undefined)
    
    @scala.inline
    def setRow_header_texts_normalizedVarargs(value: RowHeaderTextsNormalized*): Self = StObject.set(x, "row_header_texts_normalized", js.Array(value :_*))
    
    @scala.inline
    def setRow_index_begin(value: Double): Self = StObject.set(x, "row_index_begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow_index_beginUndefined: Self = StObject.set(x, "row_index_begin", js.undefined)
    
    @scala.inline
    def setRow_index_end(value: Double): Self = StObject.set(x, "row_index_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow_index_endUndefined: Self = StObject.set(x, "row_index_end", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
