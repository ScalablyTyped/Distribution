package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.Grid.GridRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid.  Use Grid methods to access information about data in the grid. Grid is returned by the
  * GridControl.getGrid method.
  */
trait Grid_ extends js.Object {
  /**
    * Returns a collection of every GridRow in the Grid.
    * @returns The rows.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getRows(): ItemCollection[GridRow]
  /**
    * Returns a collection of every selected GridRow in the Grid.
    * @returns The selected rows.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getSelectedRows(): ItemCollection[GridRow]
  /**
    * Returns the total number of records in the Grid.
    * @returns The total record count.
    */
  def getTotalRecordCount(): Double
}

object Grid_ {
  @scala.inline
  def apply(
    getRows: () => ItemCollection[GridRow],
    getSelectedRows: () => ItemCollection[GridRow],
    getTotalRecordCount: () => Double
  ): Grid_ = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction0(getRows), getSelectedRows = js.Any.fromFunction0(getSelectedRows), getTotalRecordCount = js.Any.fromFunction0(getTotalRecordCount))
  
    __obj.asInstanceOf[Grid_]
  }
}

