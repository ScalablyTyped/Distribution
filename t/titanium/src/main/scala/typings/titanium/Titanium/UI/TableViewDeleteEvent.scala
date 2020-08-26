package typings.titanium.Titanium.UI

import typings.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a table row is deleted by the user.
  */
@js.native
trait TableViewDeleteEvent extends TableViewBaseEvent {
  /**
    * Indicates whether the delete button was clicked. Always `false` for this event.
    */
  var detail: Boolean = js.native
  /**
    * Row index.
    */
  var index: Double = js.native
  /**
    * Table view row object.
    */
  var row: TableViewRow = js.native
  /**
    * Properties of the row. Use this property rather than `row` to access any custom row
    * properties.
    */
  var rowData: Dictionary[TableViewRow] = js.native
  /**
    * Indicates whether the table is in search mode. Always `false` for this event.
    */
  var searchMode: Boolean = js.native
  /**
    * Table view section object, if the deleted row is contained in a section.
    */
  var section: TableViewSection = js.native
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}

object TableViewDeleteEvent {
  @scala.inline
  def apply(
    detail: Boolean,
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    searchMode: Boolean,
    section: TableViewSection,
    source: TableView,
    x: Double,
    y: Double
  ): TableViewDeleteEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], searchMode = searchMode.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewDeleteEvent]
  }
  @scala.inline
  implicit class TableViewDeleteEventOps[Self <: TableViewDeleteEvent] (val x: Self) extends AnyVal {
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
    def setDetail(value: Boolean): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: TableViewRow): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowData(value: Dictionary[TableViewRow]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchMode(value: Boolean): Self = this.set("searchMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSection(value: TableViewSection): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

