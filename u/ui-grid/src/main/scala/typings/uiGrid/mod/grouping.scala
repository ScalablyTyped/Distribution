package typings.uiGrid.mod

import org.scalablytyped.runtime.StringDictionary
import typings.uiGrid.anon.AVG_
import typings.uiGrid.anon.AggregationChanged
import typings.uiGrid.anon.GroupPriority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grouping {
  
  @js.native
  trait IColumnDef extends StObject {
    
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
    def apply(): typings.uiGrid.mod.grouping.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.grouping.IColumnDef]
    }
    
    @scala.inline
    implicit class IColumnDefMutableBuilder[Self <: typings.uiGrid.mod.grouping.IColumnDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableGrouping(value: Boolean): Self = StObject.set(x, "enableGrouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupingUndefined: Self = StObject.set(x, "enableGrouping", js.undefined)
      
      @scala.inline
      def setGrouping(value: GroupPriority): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingShowAggregationMenu(value: Boolean): Self = StObject.set(x, "groupingShowAggregationMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingShowAggregationMenuUndefined: Self = StObject.set(x, "groupingShowAggregationMenu", js.undefined)
      
      @scala.inline
      def setGroupingShowGroupingMenu(value: Boolean): Self = StObject.set(x, "groupingShowGroupingMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingShowGroupingMenuUndefined: Self = StObject.set(x, "groupingShowGroupingMenu", js.undefined)
      
      @scala.inline
      def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    }
  }
  
  @js.native
  trait IGridExpandedHash extends /* key */ StringDictionary[IGridExpandedHash | String]
  object IGridExpandedHash {
    
    @scala.inline
    def apply(): IGridExpandedHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGridExpandedHash]
    }
  }
  
  @js.native
  trait IGridGroupingApi[TEntity] extends StObject {
    
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
  
  @js.native
  trait IGridGroupingConfiguration extends StObject {
    
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
    implicit class IGridGroupingConfigurationMutableBuilder[Self <: IGridGroupingConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedState(value: IGridExpandedHash): Self = StObject.set(x, "expandedState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedStateUndefined: Self = StObject.set(x, "expandedState", js.undefined)
      
      @scala.inline
      def setGrouping(value: js.Array[IGripGroup]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingVarargs(value: IGripGroup*): Self = StObject.set(x, "grouping", js.Array(value :_*))
      
      @scala.inline
      def setTreeAggregations(value: js.Array[IGridTreeAggregations]): Self = StObject.set(x, "treeAggregations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeAggregationsVarargs(value: IGridTreeAggregations*): Self = StObject.set(x, "treeAggregations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * Enable row grouping for entire grid.
      * Defaults to true
      * @default true
      */
    var enableGroupHeaderSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows group header rows to be selected.
      * Defaults to false
      * @default false
      */
    var enableGrouping: js.UndefOr[Boolean] = js.native
    
    /**
      * The string to use for the grouping header row label on rows which contain
      * a null or undefined value in the grouped column.
      * Defaults to "Null"
      * @default 'Null'
      */
    var groupingNullLabel: js.UndefOr[String] = js.native
    
    /**
      * Shows counts on the groupHeader rows.
      * Note that if you are using a cellFilter or a sortingAlgorithm which relies on a specific format or data
      * type, showing counts may cause that to break, since the group header rows will always be a string with
      * groupingShowCounts enabled. Defaults to true except on columns of type 'date'
      * @default true
      */
    var groupingShowCounts: js.UndefOr[Boolean] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.grouping.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.grouping.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typings.uiGrid.mod.grouping.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableGroupHeaderSelection(value: Boolean): Self = StObject.set(x, "enableGroupHeaderSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupHeaderSelectionUndefined: Self = StObject.set(x, "enableGroupHeaderSelection", js.undefined)
      
      @scala.inline
      def setEnableGrouping(value: Boolean): Self = StObject.set(x, "enableGrouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupingUndefined: Self = StObject.set(x, "enableGrouping", js.undefined)
      
      @scala.inline
      def setGroupingNullLabel(value: String): Self = StObject.set(x, "groupingNullLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingNullLabelUndefined: Self = StObject.set(x, "groupingNullLabel", js.undefined)
      
      @scala.inline
      def setGroupingShowCounts(value: Boolean): Self = StObject.set(x, "groupingShowCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingShowCountsUndefined: Self = StObject.set(x, "groupingShowCounts", js.undefined)
    }
  }
  
  @js.native
  trait IGridTreeAggregations extends StObject {
    
    var aggregation: String = js.native
    
    var colName: String = js.native
    
    var field: String = js.native
  }
  object IGridTreeAggregations {
    
    @scala.inline
    def apply(aggregation: String, colName: String, field: String): IGridTreeAggregations = {
      val __obj = js.Dynamic.literal(aggregation = aggregation.asInstanceOf[js.Any], colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridTreeAggregations]
    }
    
    @scala.inline
    implicit class IGridTreeAggregationsMutableBuilder[Self <: IGridTreeAggregations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColName(value: String): Self = StObject.set(x, "colName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGripGroup extends StObject {
    
    var colName: String = js.native
    
    var field: String = js.native
    
    var groupPriority: Double = js.native
  }
  object IGripGroup {
    
    @scala.inline
    def apply(colName: String, field: String, groupPriority: Double): IGripGroup = {
      val __obj = js.Dynamic.literal(colName = colName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], groupPriority = groupPriority.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGripGroup]
    }
    
    @scala.inline
    implicit class IGripGroupMutableBuilder[Self <: IGripGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColName(value: String): Self = StObject.set(x, "colName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupPriority(value: Double): Self = StObject.set(x, "groupPriority", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Constants available in grouping module including all constants declared in the treeBase module.
    * These are manually copied as there isn't an easy way to include constants in another constants file, and we
    * don't want to make users include treeBase.
    */
  @js.native
  trait IUiGridGroupingConstants extends ISharedTreeConstants {
    
    var featureName: String = js.native
  }
  object IUiGridGroupingConstants {
    
    @scala.inline
    def apply(
      COLLAPSED: String,
      EXPANDED: String,
      aggregation: AVG_,
      featureName: String,
      rowHeaderColName: String
    ): IUiGridGroupingConstants = {
      val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridGroupingConstants]
    }
    
    @scala.inline
    implicit class IUiGridGroupingConstantsMutableBuilder[Self <: IUiGridGroupingConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    }
  }
  
  type aggregationChangedHandler[TEntity] = js.Function1[/* col */ IGridColumnOf[TEntity], Unit]
  
  type groupingChangedHandler[TEntity] = js.Function1[/* col */ IGridColumnOf[TEntity], Unit]
}
