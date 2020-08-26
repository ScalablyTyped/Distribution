package typings.tablesorter.tableSortingMod

import typings.tablesorter.sortDefinitionOrderMod.SortDefinitionOrder
import typings.tablesorter.sortInitiatorMod.SortInitiator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableSorting extends js.Object {
  /**
    * The number of times the sorting has been applied.
    */
  var count: Double = js.native
  /**
    * A value indicating whether the order is locked.
    */
  var lockedOrder: Boolean = js.native
  /**
    * The order to apply the sorting.
    */
  var order: js.Array[SortDefinitionOrder] = js.native
  /**
    * The initiator of the sorting.
    */
  var sortedBy: SortInitiator = js.native
}

object TableSorting {
  @scala.inline
  def apply(count: Double, lockedOrder: Boolean, order: js.Array[SortDefinitionOrder], sortedBy: SortInitiator): TableSorting = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lockedOrder = lockedOrder.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], sortedBy = sortedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSorting]
  }
  @scala.inline
  implicit class TableSortingOps[Self <: TableSorting] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockedOrder(value: Boolean): Self = this.set("lockedOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderVarargs(value: SortDefinitionOrder*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: js.Array[SortDefinitionOrder]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortedBy(value: SortInitiator): Self = this.set("sortedBy", value.asInstanceOf[js.Any])
  }
  
}

