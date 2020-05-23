package typings.titanium.Titanium.UI

import typings.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a table row is clicked by the user.
  */
trait TableViewRowClickEvent extends TableViewRowBaseEvent {
  /**
    * Indicates whether the detail button was clicked. Only `true` if `row.hasDetail` is
    * `true` and the detail button was clicked.
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
    * Dictionary containing the properties set on the row.
    */
  var rowData: Dictionary[TableViewRow]
  /**
    * Boolean to indicate if the table is in search mode.
    */
  var searchMode: Boolean
  /**
    * Table view section object, if the clicked row is contained in a section.
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

object TableViewRowClickEvent {
  @scala.inline
  def apply(
    detail: Boolean,
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    searchMode: Boolean,
    section: TableViewSection,
    source: TableViewRow,
    x: Double,
    y: Double
  ): TableViewRowClickEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], searchMode = searchMode.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowClickEvent]
  }
}

