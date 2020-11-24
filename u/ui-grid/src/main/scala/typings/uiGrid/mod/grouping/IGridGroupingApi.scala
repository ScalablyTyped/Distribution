package typings.uiGrid.mod.grouping

import typings.uiGrid.anon.AggregationChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridGroupingApi[TEntity] extends js.Object {
  
  // Methods
  /**
    * Sets the aggregation type on a column.
    * If the column is currently grouped then it removes the grouping first.
    * If the aggregationDef is null then will result in the aggregation being removed.
    * @param {string} columnName The name of the column we want to aggregate
    * @param {string | function} or aggregationDef one of the recognised types from uiGridGroupingConstants or
    * a custom aggregation function.
    * @param {string} [aggregationLabel] The label to use for aggregation
    */
  def aggregateColumn(columnName: String, or: String): Unit = js.native
  def aggregateColumn(columnName: String, or: String, aggregationLabel: String): Unit = js.native
  def aggregateColumn(columnName: String, or: js.Function): Unit = js.native
  def aggregateColumn(columnName: String, or: js.Function, aggregationLabel: String): Unit = js.native
  
  /**
    * Clear any grouped columns and any aggregations.
    * Doesn't remove sorting, as we don't know whether that sorting was added by grouping or was there
    * beforehand
    */
  def clearGrouping(): Unit = js.native
  
  /**
    * Get the grouping configuration for this grid, used by the saveState feature.
    * Adds expandedState to the information provided by the internal getGrouping,
    * and removes any aggregations that have a source of grouping
    * (i.e. will be automatically reapplied when we regroup the column)
    * @param {boolean} getExpanded whether or not to return the expanded state
    */
  def getGrouping(getExpanded: Boolean): IGridGroupingConfiguration = js.native
  
  /**
    * Adds this column to the existing grouping, at the end of the priority order.
    * If the column doesn't have a sort, adds one, by default ASC.
    * This column will move to the left of any non-group columns.
    * The move is handled in a columnProcessor, so it gets called as part of refresh.
    * @param {string} columnName the name of the column we want to group
    */
  def groupColumn(columnName: String): Unit = js.native
  
  // Events
  var on: AggregationChanged[TEntity] = js.native
  
  /**
    * Set the grouping configuration for this grid, used by the saveState feature,
    * but can also be used by any user to specify a combined grouping and aggregation configuration
    * @param {IGridGroupingConfiguration} config The config to apply, in the format provided out by getGrouping
    */
  def setGrouping(config: IGridGroupingConfiguration): Unit = js.native
  
  /**
    * Removes the groupPriority from this column.
    * If the column was previously aggregated the aggregation will come back. The sort will remain.
    *
    * This column will move to the right of any other group columns, the move is handled in a columnProcessor,
    * so it gets called as part of refresh
    * @param {string} columnName the name of the column to ungroup
    */
  def ungroupColumn(columnName: String): Unit = js.native
}
