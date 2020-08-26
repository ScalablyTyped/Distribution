package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.grouping.aggregationChangedHandler
import typings.uiGrid.mod.grouping.groupingChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregationChanged[TEntity] extends js.Object {
  /**
    * raised whenever aggregation is changed, added or removed from a column
    * @param {ng.IScope} scope Grid Scope
    * @param {aggregationChangedHandler} handler Callback method
    */
  def aggregationChanged(scope: IScope, handler: aggregationChangedHandler[TEntity]): Unit = js.native
  /**
    * raised whenever the grouped columns change
    * @param {ng.IScope} scope Grid Scope
    * @param {groupingChangedHandler} handler Callback method
    */
  def groupingChanged(scope: IScope, handler: groupingChangedHandler[TEntity]): Unit = js.native
}

object AggregationChanged {
  @scala.inline
  def apply[TEntity](
    aggregationChanged: (IScope, aggregationChangedHandler[TEntity]) => Unit,
    groupingChanged: (IScope, groupingChangedHandler[TEntity]) => Unit
  ): AggregationChanged[TEntity] = {
    val __obj = js.Dynamic.literal(aggregationChanged = js.Any.fromFunction2(aggregationChanged), groupingChanged = js.Any.fromFunction2(groupingChanged))
    __obj.asInstanceOf[AggregationChanged[TEntity]]
  }
  @scala.inline
  implicit class AggregationChangedOps[Self <: AggregationChanged[_], TEntity] (val x: Self with AggregationChanged[TEntity]) extends AnyVal {
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
    def setAggregationChanged(value: (IScope, aggregationChangedHandler[TEntity]) => Unit): Self = this.set("aggregationChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setGroupingChanged(value: (IScope, groupingChangedHandler[TEntity]) => Unit): Self = this.set("groupingChanged", js.Any.fromFunction2(value))
  }
  
}

