package typings.tablesorter.tableSortingMod

import typings.tablesorter.sortDefinitionOrderMod.SortDefinitionOrder
import typings.tablesorter.sortInitiatorMod.SortInitiator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableSorting extends js.Object {
  /**
    * The number of times the sorting has been applied.
    */
  var count: Double
  /**
    * A value indicating whether the order is locked.
    */
  var lockedOrder: Boolean
  /**
    * The order to apply the sorting.
    */
  var order: js.Array[SortDefinitionOrder]
  /**
    * The initiator of the sorting.
    */
  var sortedBy: SortInitiator
}

object TableSorting {
  @scala.inline
  def apply(count: Double, lockedOrder: Boolean, order: js.Array[SortDefinitionOrder], sortedBy: SortInitiator): TableSorting = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lockedOrder = lockedOrder.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], sortedBy = sortedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSorting]
  }
}

