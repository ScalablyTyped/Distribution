package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggregationChanged[TEntity] extends js.Object {
  /**
    * raised whenever aggregation is changed, added or removed from a column
    * @param {ng.IScope} scope Grid Scope
    * @param {aggregationChangedHandler} handler Callback method
    */
  def aggregationChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.aggregationChangedHandler[TEntity]
  ): scala.Unit
  /**
    * raised whenever the grouped columns change
    * @param {ng.IScope} scope Grid Scope
    * @param {groupingChangedHandler} handler Callback method
    */
  def groupingChanged(
    scope: angularLib.angularMod.angularNs.IScope,
    handler: uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.groupingChangedHandler[TEntity]
  ): scala.Unit
}

object Anon_AggregationChanged {
  @scala.inline
  def apply[TEntity](
    aggregationChanged: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.aggregationChangedHandler[TEntity], 
      scala.Unit
    ],
    groupingChanged: js.Function2[
      angularLib.angularMod.angularNs.IScope, 
      uiDashGridLib.uiDashGridMod.uiGridNs.groupingNs.groupingChangedHandler[TEntity], 
      scala.Unit
    ]
  ): Anon_AggregationChanged[TEntity] = {
    val __obj = js.Dynamic.literal(aggregationChanged = aggregationChanged, groupingChanged = groupingChanged)
  
    __obj.asInstanceOf[Anon_AggregationChanged[TEntity]]
  }
}

