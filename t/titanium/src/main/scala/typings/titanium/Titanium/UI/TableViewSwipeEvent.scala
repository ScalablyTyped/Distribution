package typings.titanium.Titanium.UI

import typings.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a swipe gesture (left or right) against the view.
  */
@js.native
trait TableViewSwipeEvent extends TableViewBaseEvent {
  /**
    * Direction of the swipe, either `left` or `right`.
    */
  var direction: String = js.native
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
    *     var data = [{title:'Row 1', hasChild:true, color:'red', selectedColor:'#fff', special:'special 1'},];
    *     var table = Ti.UI.createTableView({data: data});
    */
  var rowData: Dictionary[TableViewRow] = js.native
  /**
    * X coordinate of the event's endpoint from the `source` view's coordinate system.
    */
  var x: Double = js.native
  /**
    * Y coordinate of the event's endpoint from the `source` view's coordinate system.
    */
  var y: Double = js.native
}

object TableViewSwipeEvent {
  @scala.inline
  def apply(
    direction: String,
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    source: TableView,
    x: Double,
    y: Double
  ): TableViewSwipeEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewSwipeEvent]
  }
  @scala.inline
  implicit class TableViewSwipeEventOps[Self <: TableViewSwipeEvent] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: TableViewRow): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowData(value: Dictionary[TableViewRow]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

