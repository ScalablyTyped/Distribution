package typings.titanium

import typings.titanium.Titanium.UI.TableViewRow
import typings.titanium.Titanium.UI.TableViewSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments for the <Titanium.UI.TableView.rowsselected> event.
  */
@js.native
trait SelectedRowObject extends js.Object {
  
  /**
    * Row index.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Table view row object.
    */
  var row: js.UndefOr[TableViewRow] = js.native
  
  /**
    * Properties of the row. Use this property rather than `row` to access any custom row properties.
    */
  var rowData: js.UndefOr[Dictionary[TableViewRow]] = js.native
  
  /**
    * Table view section object, if the clicked row is contained in a section.
    */
  var section: js.UndefOr[TableViewSection] = js.native
}
object SelectedRowObject {
  
  @scala.inline
  def apply(): SelectedRowObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedRowObject]
  }
  
  @scala.inline
  implicit class SelectedRowObjectOps[Self <: SelectedRowObject] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setRow(value: TableViewRow): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowData(value: Dictionary[TableViewRow]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    
    @scala.inline
    def setSection(value: TableViewSection): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
}
