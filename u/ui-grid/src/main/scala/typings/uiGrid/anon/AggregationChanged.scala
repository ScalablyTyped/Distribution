package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.grouping.aggregationChangedHandler
import typings.uiGrid.mod.grouping.groupingChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationChanged[TEntity] extends StObject {
  
  /**
    * raised whenever aggregation is changed, added or removed from a column
    * @param scope Grid Scope
    * @param handler Callback method
    */
  def aggregationChanged(scope: IScope, handler: aggregationChangedHandler[TEntity]): Unit
  
  /**
    * raised whenever the grouped columns change
    * @param scope Grid Scope
    * @param handler Callback method
    */
  def groupingChanged(scope: IScope, handler: groupingChangedHandler[TEntity]): Unit
}
object AggregationChanged {
  
  inline def apply[TEntity](
    aggregationChanged: (IScope, aggregationChangedHandler[TEntity]) => Unit,
    groupingChanged: (IScope, groupingChangedHandler[TEntity]) => Unit
  ): AggregationChanged[TEntity] = {
    val __obj = js.Dynamic.literal(aggregationChanged = js.Any.fromFunction2(aggregationChanged), groupingChanged = js.Any.fromFunction2(groupingChanged))
    __obj.asInstanceOf[AggregationChanged[TEntity]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationChanged[?], TEntity] (val x: Self & AggregationChanged[TEntity]) extends AnyVal {
    
    inline def setAggregationChanged(value: (IScope, aggregationChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "aggregationChanged", js.Any.fromFunction2(value))
    
    inline def setGroupingChanged(value: (IScope, groupingChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "groupingChanged", js.Any.fromFunction2(value))
  }
}
