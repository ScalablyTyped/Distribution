package typings.titanium.Titanium.UI

import typings.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a table row is moved by the user.
  */
trait TableViewMoveEvent extends TableViewBaseEvent {
  /**
    * Boolean to indicate if the right area was clicked. Always `false` for this event.
    */
  var detail: Boolean
  /**
    * Row index.
    */
  var index: Double
  /**
    * Table view row object.
    */
  var row: TableViewRow
  /**
    * Properties of the row. Use this property rather than `row` to access any custom row
    * properties.
    */
  var rowData: Dictionary[TableViewRow]
  /**
    * Boolean to indicate if the table is in search mode. Always `false` for this event.
    */
  var searchMode: Boolean
  /**
    * Table view section object, if the deleted row is contained in a section.
    */
  var section: TableViewSection
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object TableViewMoveEvent {
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
  ): TableViewMoveEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], searchMode = searchMode.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewMoveEvent]
  }
}

