package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Column-level cells, each applicable as a header to other cells in the same column as itself, of the current table. */
@js.native
trait ColumnHeaders extends js.Object {
  
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.native
  
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.native
  
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.native
  
  /** The location of the column header cell in the current table as defined by its `begin` and `end` offsets, respectfully, in the input document. */
  var location: js.UndefOr[js.Object] = js.native
  
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.native
  
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.native
  
  /** The textual contents of this cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.native
  
  /** If you provide customization input, the normalized version of the cell text according to the customization; otherwise, the same value as `text`. */
  var text_normalized: js.UndefOr[String] = js.native
}
object ColumnHeaders {
  
  @scala.inline
  def apply(): ColumnHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaders]
  }
  
  @scala.inline
  implicit class ColumnHeadersOps[Self <: ColumnHeaders] (val x: Self) extends AnyVal {
    
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
    def setCell_id(value: String): Self = this.set("cell_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell_id: Self = this.set("cell_id", js.undefined)
    
    @scala.inline
    def setColumn_index_begin(value: Double): Self = this.set("column_index_begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn_index_begin: Self = this.set("column_index_begin", js.undefined)
    
    @scala.inline
    def setColumn_index_end(value: Double): Self = this.set("column_index_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn_index_end: Self = this.set("column_index_end", js.undefined)
    
    @scala.inline
    def setLocation(value: js.Object): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
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
    
    @scala.inline
    def setText_normalized(value: String): Self = this.set("text_normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText_normalized: Self = this.set("text_normalized", js.undefined)
  }
}
