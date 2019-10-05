package typings.uiDashGrid

import typings.angular.angularMod.IScope
import typings.uiDashGrid.uiDashGridMod.grouping.aggregationChangedHandler
import typings.uiDashGrid.uiDashGridMod.grouping.groupingChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggregationChanged[TEntity] extends js.Object {
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

object Anon_AggregationChanged {
  @scala.inline
  def apply[TEntity](
    aggregationChanged: (IScope, aggregationChangedHandler[TEntity]) => Unit,
    groupingChanged: (IScope, groupingChangedHandler[TEntity]) => Unit
  ): Anon_AggregationChanged[TEntity] = {
    val __obj = js.Dynamic.literal(aggregationChanged = js.Any.fromFunction2(aggregationChanged), groupingChanged = js.Any.fromFunction2(groupingChanged))
  
    __obj.asInstanceOf[Anon_AggregationChanged[TEntity]]
  }
}

