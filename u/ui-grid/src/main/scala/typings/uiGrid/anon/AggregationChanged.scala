package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.grouping.aggregationChangedHandler
import typings.uiGrid.mod.grouping.groupingChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregationChanged[TEntity] extends js.Object {
  /**
    * raised whenever aggregation is changed, added or removed from a column
    * @param {ng.IScope} scope Grid Scope
    * @param {aggregationChangedHandler} handler Callback method
    */
  def aggregationChanged(scope: IScope, handler: aggregationChangedHandler[TEntity]): Unit
  /**
    * raised whenever the grouped columns change
    * @param {ng.IScope} scope Grid Scope
    * @param {groupingChangedHandler} handler Callback method
    */
  def groupingChanged(scope: IScope, handler: groupingChangedHandler[TEntity]): Unit
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
}

