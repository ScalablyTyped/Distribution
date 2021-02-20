package typings.titanium

import typings.titanium.Titanium.UI.TableViewRow
import typings.titanium.Titanium.UI.TableViewSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments for the <Titanium.UI.TableView.rowsselected> event.
  */
@js.native
trait SelectedRowObject extends StObject {
  
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
  implicit class SelectedRowObjectMutableBuilder[Self <: SelectedRowObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setRow(value: TableViewRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: Dictionary[TableViewRow]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setSection(value: TableViewSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
