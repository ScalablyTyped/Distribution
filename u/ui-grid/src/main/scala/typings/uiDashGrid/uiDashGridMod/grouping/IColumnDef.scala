package typings.uiDashGrid.uiDashGridMod.grouping

import typings.uiDashGrid.Anon_GroupPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /** Enable grouping on this column.  Defaults to true. */
  var enableGrouping: js.UndefOr[Boolean] = js.undefined
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
  var grouping: js.UndefOr[Anon_GroupPriority] = js.undefined
  /**
    * Show the aggregation menu on this column.  Defaults to true
    * @default true
    */
  var groupingShowAggregationMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Show the grouping (group and ungroup items) menu on this column.  Defaults to true
    * @default true
    */
  var groupingShowGroupingMenu: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(
    enableGrouping: js.UndefOr[Boolean] = js.undefined,
    grouping: Anon_GroupPriority = null,
    groupingShowAggregationMenu: js.UndefOr[Boolean] = js.undefined,
    groupingShowGroupingMenu: js.UndefOr[Boolean] = js.undefined
  ): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableGrouping)) __obj.updateDynamic("enableGrouping")(enableGrouping)
    if (grouping != null) __obj.updateDynamic("grouping")(grouping)
    if (!js.isUndefined(groupingShowAggregationMenu)) __obj.updateDynamic("groupingShowAggregationMenu")(groupingShowAggregationMenu)
    if (!js.isUndefined(groupingShowGroupingMenu)) __obj.updateDynamic("groupingShowGroupingMenu")(groupingShowGroupingMenu)
    __obj.asInstanceOf[IColumnDef]
  }
}

