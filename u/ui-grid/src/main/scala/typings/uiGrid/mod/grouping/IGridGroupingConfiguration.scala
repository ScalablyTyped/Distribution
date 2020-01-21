package typings.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridGroupingConfiguration extends js.Object {
  /**
    * Hash of currently expanded nodes
    */
  var expandedState: js.UndefOr[IGridExpandedHash] = js.undefined
  /**
    * GroupArray.  Sorted by groupPriority
    */
  var grouping: js.Array[IGripGroup]
  /**
    * Array of aggregation objects
    */
  var treeAggregations: js.Array[IGridTreeAggregations]
}

object IGridGroupingConfiguration {
  @scala.inline
  def apply(
    grouping: js.Array[IGripGroup],
    treeAggregations: js.Array[IGridTreeAggregations],
    expandedState: IGridExpandedHash = null
  ): IGridGroupingConfiguration = {
    val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], treeAggregations = treeAggregations.asInstanceOf[js.Any])
    if (expandedState != null) __obj.updateDynamic("expandedState")(expandedState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridGroupingConfiguration]
  }
}

