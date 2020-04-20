package typings.titanium.Titanium.UI

import typings.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a table row is clicked by the user.
		 */
trait TableViewClickEvent extends TableViewBaseEvent {
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
  			 * Properties of the row.
  			 * When the row is created implicitly using a JavaScript dictionary object,
  			 * use this property rather than `row` to access any custom row properties.
  			 * Here's an example of creating a row implicitly, which is not the recommended way.
  			 *     var data = [{title:'Row 1', hasChild:true, color:'red', selectedColor:'#fff', special:'special 1'},];
  			 *     var table = Ti.UI.createTableView({data: data});
  			 */
  var rowData: Dictionary[TableViewRow]
  /**
  			 * Indicates whether the table is in search mode.
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

object TableViewClickEvent {
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
  ): TableViewClickEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], searchMode = searchMode.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewClickEvent]
  }
}

