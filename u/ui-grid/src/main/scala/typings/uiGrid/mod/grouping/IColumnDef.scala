package typings.uiGrid.mod.grouping

import typings.uiGrid.anon.GroupPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef extends js.Object {
  /** Enable grouping on this column.  Defaults to true. */
  var enableGrouping: js.UndefOr[Boolean] = js.native
  /**
    * Set the grouping for a column.
    * Note that aggregation used to be included in grouping, but is now separately set on the column via
    * treeAggregation setting in treeBase
    *
    * We group in the priority order given, this will also put these columns to the high order of the sort
    * irrespective of the sort priority given them.
    * If there is no sort defined then we sort ascending, if there is a sort defined then we use that sort.
    *
    * If the groupPriority is undefined or less than 0, then we expect to be aggregating,
    * and we look at the aggregation types to determine what sort of aggregation we can do.
    * Values are in the constants file, but include SUM, COUNT, MAX, MIN
    *
    * groupPriorities should generally be sequential, if they're not then the next time getGrouping is called
    * we'll renumber them to be sequential.
    * Defaults to undefined.
    */
  var grouping: js.UndefOr[GroupPriority] = js.native
  /**
    * Show the aggregation menu on this column.  Defaults to true
    * @default true
    */
  var groupingShowAggregationMenu: js.UndefOr[Boolean] = js.native
  /**
    * Show the grouping (group and ungroup items) menu on this column.  Defaults to true
    * @default true
    */
  var groupingShowGroupingMenu: js.UndefOr[Boolean] = js.native
}

object IColumnDef {
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
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
    def setEnableGrouping(value: Boolean): Self = this.set("enableGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGrouping: Self = this.set("enableGrouping", js.undefined)
    @scala.inline
    def setGrouping(value: GroupPriority): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setGroupingShowAggregationMenu(value: Boolean): Self = this.set("groupingShowAggregationMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingShowAggregationMenu: Self = this.set("groupingShowAggregationMenu", js.undefined)
    @scala.inline
    def setGroupingShowGroupingMenu(value: Boolean): Self = this.set("groupingShowGroupingMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingShowGroupingMenu: Self = this.set("groupingShowGroupingMenu", js.undefined)
  }
  
}

