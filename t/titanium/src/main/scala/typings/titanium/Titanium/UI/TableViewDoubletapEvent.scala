package typings.titanium.Titanium.UI

import typings.titanium.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a double tap against this view.
  */
@js.native
trait TableViewDoubletapEvent extends TableViewBaseEvent {
  
  /**
    * Row index.
    */
  var index: Double = js.native
  
  /**
    * Table view row object.
    */
  var row: TableViewRow = js.native
  
  /**
    * Properties of the row.
    * When the row is created implicitly using a JavaScript dictionary object,
    * use this property rather than `row` to access any custom row properties.
    * Here's an example of creating a row implicitly, which is not the recommended way.
    * ``` js
    * var data = [{title:'Row 1', hasChild:true, color:'red', selectedColor:'#fff', special:'special 1'},];
    * var table = Ti.UI.createTableView({data: data});
    * ```
    */
  var rowData: Dictionary[TableViewRow] = js.native
  
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}
object TableViewDoubletapEvent {
  
  @scala.inline
  def apply(
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    source: TableView,
    x: Double,
    y: Double
  ): TableViewDoubletapEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewDoubletapEvent]
  }
  
  @scala.inline
  implicit class TableViewDoubletapEventMutableBuilder[Self <: TableViewDoubletapEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: TableViewRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: Dictionary[TableViewRow]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
