package typings.titanium.Titanium.UI

import typings.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a long press.
  */
trait TableViewLongpressEvent extends TableViewBaseEvent {
  /**
    * Row index.
    */
  var index: Double
  /**
    * Table view row object.
    */
  var row: TableViewRow
  /**
    * Properties of the row.
    * When the row is created implicitly using a JavaScript dictionary object,
    * use this property rather than `row` to access any custom row properties.
    * Here's an example of creating a row implicitly, which is not the recommended way.
    *     var data = [{title:'Row 1', hasChild:true, color:'red', selectedColor:'#fff', special:'special 1'},];
    *     var table = Ti.UI.createTableView({data: data});
    */
  var rowData: Dictionary[TableViewRow]
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object TableViewLongpressEvent {
  @scala.inline
  def apply(
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    source: TableView,
    x: Double,
    y: Double
  ): TableViewLongpressEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewLongpressEvent]
  }
}

