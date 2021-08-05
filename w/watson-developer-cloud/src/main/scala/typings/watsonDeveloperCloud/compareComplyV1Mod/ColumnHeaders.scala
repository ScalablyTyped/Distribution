package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Column-level cells, each applicable as a header to other cells in the same column as itself, of the current table. */
trait ColumnHeaders extends StObject {
  
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
  
  inline def apply(): ColumnHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaders]
  }
  
  extension [Self <: ColumnHeaders](x: Self) {
    
    inline def setCell_id(value: String): Self = StObject.set(x, "cell_id", value.asInstanceOf[js.Any])
    
    inline def setCell_idUndefined: Self = StObject.set(x, "cell_id", js.undefined)
    
    inline def setColumn_index_begin(value: Double): Self = StObject.set(x, "column_index_begin", value.asInstanceOf[js.Any])
    
    inline def setColumn_index_beginUndefined: Self = StObject.set(x, "column_index_begin", js.undefined)
    
    inline def setColumn_index_end(value: Double): Self = StObject.set(x, "column_index_end", value.asInstanceOf[js.Any])
    
    inline def setColumn_index_endUndefined: Self = StObject.set(x, "column_index_end", js.undefined)
    
    inline def setLocation(value: js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRow_index_begin(value: Double): Self = StObject.set(x, "row_index_begin", value.asInstanceOf[js.Any])
    
    inline def setRow_index_beginUndefined: Self = StObject.set(x, "row_index_begin", js.undefined)
    
    inline def setRow_index_end(value: Double): Self = StObject.set(x, "row_index_end", value.asInstanceOf[js.Any])
    
    inline def setRow_index_endUndefined: Self = StObject.set(x, "row_index_end", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setText_normalized(value: String): Self = StObject.set(x, "text_normalized", value.asInstanceOf[js.Any])
    
    inline def setText_normalizedUndefined: Self = StObject.set(x, "text_normalized", js.undefined)
  }
}
