package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The contents of the current table's header. */
trait TableHeaders extends StObject {
  
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.undefined
  
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.undefined
  
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.undefined
  
  /** The location of the table header cell in the current table as defined by its `begin` and `end` offsets, respectfully, in the input document. */
  var location: js.UndefOr[js.Object] = js.undefined
  
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.undefined
  
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.undefined
  
  /** The textual contents of the cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.undefined
}
object TableHeaders {
  
  @scala.inline
  def apply(): TableHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaders]
  }
  
  @scala.inline
  implicit class TableHeadersMutableBuilder[Self <: TableHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell_id(value: String): Self = StObject.set(x, "cell_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCell_idUndefined: Self = StObject.set(x, "cell_id", js.undefined)
    
    @scala.inline
    def setColumn_index_begin(value: Double): Self = StObject.set(x, "column_index_begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_index_beginUndefined: Self = StObject.set(x, "column_index_begin", js.undefined)
    
    @scala.inline
    def setColumn_index_end(value: Double): Self = StObject.set(x, "column_index_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_index_endUndefined: Self = StObject.set(x, "column_index_end", js.undefined)
    
    @scala.inline
    def setLocation(value: js.Object): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
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
