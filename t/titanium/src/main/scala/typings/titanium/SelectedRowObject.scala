package typings.titanium

import typings.titanium.Titanium.UI.TableViewRow
import typings.titanium.Titanium.UI.TableViewSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.TableView.rowsselected> event.
  */
trait SelectedRowObject extends js.Object {
  /**
  	 * Row index.
  	 */
  var index: js.UndefOr[Double] = js.undefined
  /**
  	 * Table view row object.
  	 */
  var row: js.UndefOr[TableViewRow] = js.undefined
  /**
  	 * Properties of the row. Use this property rather than `row` to access any custom row properties.
  	 */
  var rowData: js.UndefOr[Dictionary[TableViewRow]] = js.undefined
  /**
  	 * Table view section object, if the clicked row is contained in a section.
  	 */
  var section: js.UndefOr[TableViewSection] = js.undefined
}

object SelectedRowObject {
  @scala.inline
  def apply(
    index: Int | Double = null,
    row: TableViewRow = null,
    rowData: Dictionary[TableViewRow] = null,
    section: TableViewSection = null
  ): SelectedRowObject = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedRowObject]
  }
}

