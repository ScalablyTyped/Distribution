package typings.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridGroupingConfiguration extends js.Object {
  /**
    * Hash of currently expanded nodes
    */
  var expandedState: js.UndefOr[IGridExpandedHash] = js.native
  /**
    * GroupArray.  Sorted by groupPriority
    */
  var grouping: js.Array[IGripGroup] = js.native
  /**
    * Array of aggregation objects
    */
  var treeAggregations: js.Array[IGridTreeAggregations] = js.native
}

object IGridGroupingConfiguration {
  @scala.inline
  def apply(grouping: js.Array[IGripGroup], treeAggregations: js.Array[IGridTreeAggregations]): IGridGroupingConfiguration = {
    val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], treeAggregations = treeAggregations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridGroupingConfiguration]
  }
  @scala.inline
  implicit class IGridGroupingConfigurationOps[Self <: IGridGroupingConfiguration] (val x: Self) extends AnyVal {
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
    def setGroupingVarargs(value: IGripGroup*): Self = this.set("grouping", js.Array(value :_*))
    @scala.inline
    def setGrouping(value: js.Array[IGripGroup]): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeAggregationsVarargs(value: IGridTreeAggregations*): Self = this.set("treeAggregations", js.Array(value :_*))
    @scala.inline
    def setTreeAggregations(value: js.Array[IGridTreeAggregations]): Self = this.set("treeAggregations", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedState(value: IGridExpandedHash): Self = this.set("expandedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedState: Self = this.set("expandedState", js.undefined)
  }
  
}

