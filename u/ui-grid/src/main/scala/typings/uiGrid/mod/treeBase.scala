package typings.uiGrid.mod

import org.scalablytyped.runtime.StringDictionary
import typings.uiGrid.anon.AVG_
import typings.uiGrid.anon.RowCollapsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeBase {
  
  @js.native
  trait IColumnDef[TEntity] extends StObject {
    
    /**
      * A custom function that populates aggregation.rendered.
      * This is called when a particular aggregation has been fully calculated, and we want to render the value.
      *
      * With the native aggregation options we just concatenate aggregation.label and aggregation.value,
      * but if you wanted to apply a filter or otherwise manipulate the label or the value,
      * you can do so with this function.
      *
      * This function will be called after the the default finalizerFn.  Defaults to undefined
      * @default undefined
      * @param {IGridTreeBaseAggregationObject} aggregation Aggregation object
      */
    var customTreeAggregationFinalizerFn: js.UndefOr[js.Function1[/* aggregation */ IGridTreeBaseAggregationObject, Unit]] = js.native
    
    /**
      * A custom function that aggregates rows into some form of total.
      * Aggregations run row-by-row, the function needs to be capable of creating a running total.
      *
      * The function will be provided the aggregation item (in which you can store running totals),
      * the row value that is to be aggregated,
      * and that same row value converted to a number (most aggregations work on numbers)
      * @param {IGridTreeBaseAggregationObject} aggregation
      * @param {any} fieldValue Value of the field
      * @param {number} numValue Numeric value of the field
      * @param {IGridRow} row Row objet
      */
    var customTreeAggregationFn: js.UndefOr[
        js.Function4[
          /* aggregation */ IGridTreeBaseAggregationObject, 
          /* fieldValue */ js.Any, 
          /* numValue */ Double, 
          /* row */ IGridRowOf[TEntity], 
          Unit
        ]
      ] = js.native
    
    /**
      * A custom label to use for this aggregation.  If providedm, we don't use native i18n
      */
    var treeAggregationLabel: js.UndefOr[String] = js.native
    
    /**
      * Use one of the native or grid-level aggregation methods for calculating aggregations on this column.
      * Native method are in the constants file and include: SUM, COUNT, MIN, MAX, AVG.
      * This may also be the name of an aggregation function defined with treeCustomAggregations.
      *
      * If you are using aggregations you should either:
      * * also use grouping, in which case the aggregations are displayed in the group header, OR
      * * use treeView, in which case you can set `treeAggregationUpdateEntity: true` in the colDef, and
      * treeBase
      *   will store the aggregation information in the entity, or you can set `treeAggregationUpdateEntity:
      * false` in the colDef, and you need to manual retrieve the calculated aggregations from the
      * row.treeNode.aggregations
      *
      * Takes precedence over a treeAggregationFn, the two options should not be used together.
      * Defaults to undefined.
      * @default undefined
      */
    var treeAggregationType: js.UndefOr[String] = js.native
    
    /**
      * Store calculated aggregations into the entity,
      * allowing them to be displayed in the grid using a standard cellTemplate.
      * This defaults to true.
      * If you are using grouping then you shouldn't set it to false, as then the aggregations won't display.
      *
      * If you are using treeView in most cases you'll want to set this to true.
      * This will result in getCellValue returning the aggregation rather than whatever was stored in the cell
      * attribute on the entity.
      *
      * If you want to render the underlying entity value (and do something else with the aggregation),
      * then you could use a custom cellTemplate to display row.entity.myAttribute, rather than using
      * getCellValue.
      *
      * Defaults to true
      * @default true
      */
    var treeAggregationUpdateEntity: js.UndefOr[Boolean] = js.native
  }
  object IColumnDef {
    
    @scala.inline
    def apply[TEntity](): typings.uiGrid.mod.treeBase.IColumnDef[TEntity] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.treeBase.IColumnDef[TEntity]]
    }
    
    @scala.inline
    implicit class IColumnDefMutableBuilder[Self <: typings.uiGrid.mod.treeBase.IColumnDef[_], TEntity] (val x: Self with typings.uiGrid.mod.treeBase.IColumnDef[TEntity]) extends AnyVal {
      
      @scala.inline
      def setCustomTreeAggregationFinalizerFn(value: /* aggregation */ IGridTreeBaseAggregationObject => Unit): Self = StObject.set(x, "customTreeAggregationFinalizerFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomTreeAggregationFinalizerFnUndefined: Self = StObject.set(x, "customTreeAggregationFinalizerFn", js.undefined)
      
      @scala.inline
      def setCustomTreeAggregationFn(
        value: (/* aggregation */ IGridTreeBaseAggregationObject, /* fieldValue */ js.Any, /* numValue */ Double, /* row */ IGridRowOf[TEntity]) => Unit
      ): Self = StObject.set(x, "customTreeAggregationFn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCustomTreeAggregationFnUndefined: Self = StObject.set(x, "customTreeAggregationFn", js.undefined)
      
      @scala.inline
      def setTreeAggregationLabel(value: String): Self = StObject.set(x, "treeAggregationLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeAggregationLabelUndefined: Self = StObject.set(x, "treeAggregationLabel", js.undefined)
      
      @scala.inline
      def setTreeAggregationType(value: String): Self = StObject.set(x, "treeAggregationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeAggregationTypeUndefined: Self = StObject.set(x, "treeAggregationType", js.undefined)
      
      @scala.inline
      def setTreeAggregationUpdateEntity(value: Boolean): Self = StObject.set(x, "treeAggregationUpdateEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeAggregationUpdateEntityUndefined: Self = StObject.set(x, "treeAggregationUpdateEntity", js.undefined)
    }
  }
  
  @js.native
  trait IGridOptions[TEntity] extends StObject {
    
    /**
      * If set to true, show the expand/collapse button even if there are no children of a node.
      * You'd use this if you're planning to dynamically load the children
      * Defaults to true, grouping overrides to false
      * @default true
      */
    var showTreeExpandNoChildren: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to false, don't create the row header. Youll need to programatically control the expand states
      * Defaults to true
      * @default true
      */
    var showTreeRowHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * Define custom aggregation functions.
      * The properties of this object will be aggregation types available for use on columnDef
      * with treeAggregationType or through the column menu.
      *
      * If a function defined here uses the same name as one of the native aggregations,
      * this one will take precedence
      *
      * The finalizerFn may be used to manipulate the value before rendering, or to apply a custom rendered
      * value. If aggregation.rendered is left undefined, the value will be rendered. Note that the native
      * aggregation functions use an finalizerFn to concatenate the label and the value.
      *
      * Defaults to {}
      * @default {}
      */
    var treeCustomAggregations: js.UndefOr[StringDictionary[IGridTreeBaseCustomAggregation[TEntity]]] = js.native
    
    /**
      * Number of pixels of indent for the icon at each tree level, wider indents are visually more pleasing,
      * but will make the tree row header wider
      * Defaults to 10
      *
      * @default 10
      */
    var treeIndent: js.UndefOr[Double] = js.native
    
    /**
      * If set to true, row header even if there are no tree nodes
      */
    var treeRowHeaderAlwaysVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Base width of the tree header, provides for a single level of tree.
      * This is incremented by treeIndent for each extra level
      * Defaults to 30
      *
      * @default 30
      */
    var treeRowHeaderBaseWidth: js.UndefOr[Double] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply[TEntity](): typings.uiGrid.mod.treeBase.IGridOptions[TEntity] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.treeBase.IGridOptions[TEntity]]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typings.uiGrid.mod.treeBase.IGridOptions[_], TEntity] (val x: Self with typings.uiGrid.mod.treeBase.IGridOptions[TEntity]) extends AnyVal {
      
      @scala.inline
      def setShowTreeExpandNoChildren(value: Boolean): Self = StObject.set(x, "showTreeExpandNoChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTreeExpandNoChildrenUndefined: Self = StObject.set(x, "showTreeExpandNoChildren", js.undefined)
      
      @scala.inline
      def setShowTreeRowHeader(value: Boolean): Self = StObject.set(x, "showTreeRowHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTreeRowHeaderUndefined: Self = StObject.set(x, "showTreeRowHeader", js.undefined)
      
      @scala.inline
      def setTreeCustomAggregations(value: StringDictionary[IGridTreeBaseCustomAggregation[TEntity]]): Self = StObject.set(x, "treeCustomAggregations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeCustomAggregationsUndefined: Self = StObject.set(x, "treeCustomAggregations", js.undefined)
      
      @scala.inline
      def setTreeIndent(value: Double): Self = StObject.set(x, "treeIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIndentUndefined: Self = StObject.set(x, "treeIndent", js.undefined)
      
      @scala.inline
      def setTreeRowHeaderAlwaysVisible(value: Boolean): Self = StObject.set(x, "treeRowHeaderAlwaysVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeRowHeaderAlwaysVisibleUndefined: Self = StObject.set(x, "treeRowHeaderAlwaysVisible", js.undefined)
      
      @scala.inline
      def setTreeRowHeaderBaseWidth(value: Double): Self = StObject.set(x, "treeRowHeaderBaseWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeRowHeaderBaseWidthUndefined: Self = StObject.set(x, "treeRowHeaderBaseWidth", js.undefined)
    }
  }
  
  @js.native
  trait IGridTreeBaseAggregationObject extends StObject {
    
    var count: Double = js.native
    
    var rendered: js.UndefOr[String] = js.native
    
    var sum: Double = js.native
    
    var value: Double = js.native
  }
  object IGridTreeBaseAggregationObject {
    
    @scala.inline
    def apply(count: Double, sum: Double, value: Double): IGridTreeBaseAggregationObject = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridTreeBaseAggregationObject]
    }
    
    @scala.inline
    implicit class IGridTreeBaseAggregationObjectMutableBuilder[Self <: IGridTreeBaseAggregationObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendered(value: String): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
      
      @scala.inline
      def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGridTreeBaseApi[TEntity] extends StObject {
    
    // Methods
    /**
      * Collapse all tree rows
      */
    def collapseAllRows(): Unit = js.native
    
    /**
      * collapse the specified row. When you expand the row again, all grandchildren will retain their state
      * @param {IGridRow} row The row to collapse
      */
    def collapseRow(row: IGridRowOf[TEntity]): Unit = js.native
    
    /**
      * collapse all children of the specified row. When you expand the row again, all grandchildren will be
      * collapsed
      * @param {IGridRow} row The row to collapse children of
      */
    def collapseRowChildren(row: IGridRowOf[TEntity]): Unit = js.native
    
    /**
      * Expands all tree rows
      */
    def expandAllRows(): Unit = js.native
    
    /**
      * Expand the immediate children of the specified row
      * @param {IGridRow} row The row to expand
      */
    def expandRow(row: IGridRowOf[TEntity]): Unit = js.native
    
    /**
      * Get the children of the specified row
      * @param {IGridRow} row The row you want the children of
      * @returns Array<IGridRow> Array of children rows
      */
    def getRowChildren(row: IGridRowOf[TEntity]): js.Array[IGridRowOf[TEntity]] = js.native
    
    /**
      * Get the tree state for this grid, used by the saveState feature Returned treeState as an object
      * ```{ expandedState: { uid: 'expanded', uid: 'collapsed' } }```
      * where expandedState is a hash of row uid and the current expanded state
      * @returns {ITreeState} tree state
      * NOTE this is an incomplete feature in uiGrid
      */
    def getTreeState(): ITreeState = js.native
    
    // Events
    var on: RowCollapsed[TEntity] = js.native
    
    /**
      * Set the expanded states of the tree
      * @param {ITreeState} config The config you want to apply, in the format provided by getTreeState
      */
    def setTreeState(config: ITreeState): Unit = js.native
    
    /**
      * call expand if row is collapsed, and collapse if it is expanded
      * @param {IGridRow} row The row to toggle
      */
    def toggleRowTreeState(row: IGridRowOf[TEntity]): Unit = js.native
  }
  object IGridTreeBaseApi {
    
    @scala.inline
    def apply[TEntity](
      collapseAllRows: () => Unit,
      collapseRow: IGridRowOf[TEntity] => Unit,
      collapseRowChildren: IGridRowOf[TEntity] => Unit,
      expandAllRows: () => Unit,
      expandRow: IGridRowOf[TEntity] => Unit,
      getRowChildren: IGridRowOf[TEntity] => js.Array[IGridRowOf[TEntity]],
      getTreeState: () => ITreeState,
      on: RowCollapsed[TEntity],
      setTreeState: ITreeState => Unit,
      toggleRowTreeState: IGridRowOf[TEntity] => Unit
    ): IGridTreeBaseApi[TEntity] = {
      val __obj = js.Dynamic.literal(collapseAllRows = js.Any.fromFunction0(collapseAllRows), collapseRow = js.Any.fromFunction1(collapseRow), collapseRowChildren = js.Any.fromFunction1(collapseRowChildren), expandAllRows = js.Any.fromFunction0(expandAllRows), expandRow = js.Any.fromFunction1(expandRow), getRowChildren = js.Any.fromFunction1(getRowChildren), getTreeState = js.Any.fromFunction0(getTreeState), on = on.asInstanceOf[js.Any], setTreeState = js.Any.fromFunction1(setTreeState), toggleRowTreeState = js.Any.fromFunction1(toggleRowTreeState))
      __obj.asInstanceOf[IGridTreeBaseApi[TEntity]]
    }
    
    @scala.inline
    implicit class IGridTreeBaseApiMutableBuilder[Self <: IGridTreeBaseApi[_], TEntity] (val x: Self with IGridTreeBaseApi[TEntity]) extends AnyVal {
      
      @scala.inline
      def setCollapseAllRows(value: () => Unit): Self = StObject.set(x, "collapseAllRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCollapseRow(value: IGridRowOf[TEntity] => Unit): Self = StObject.set(x, "collapseRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapseRowChildren(value: IGridRowOf[TEntity] => Unit): Self = StObject.set(x, "collapseRowChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandAllRows(value: () => Unit): Self = StObject.set(x, "expandAllRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpandRow(value: IGridRowOf[TEntity] => Unit): Self = StObject.set(x, "expandRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRowChildren(value: IGridRowOf[TEntity] => js.Array[IGridRowOf[TEntity]]): Self = StObject.set(x, "getRowChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTreeState(value: () => ITreeState): Self = StObject.set(x, "getTreeState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: RowCollapsed[TEntity]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTreeState(value: ITreeState => Unit): Self = StObject.set(x, "setTreeState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleRowTreeState(value: IGridRowOf[TEntity] => Unit): Self = StObject.set(x, "toggleRowTreeState", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IGridTreeBaseCustomAggregation[TEntity] extends StObject {
    
    def aggregationFn(aggregation: IGridTreeBaseAggregationObject, fieldValue: js.Any, numValue: Double): Unit = js.native
    def aggregationFn(
      aggregation: IGridTreeBaseAggregationObject,
      fieldValue: js.Any,
      numValue: Double,
      row: IGridRowOf[TEntity]
    ): Unit = js.native
    
    var finalizerFn: js.UndefOr[js.Function1[/* aggregation */ IGridTreeBaseAggregationObject, Unit]] = js.native
    
    var label: String = js.native
  }
  
  @js.native
  trait ITreeState extends StObject {
    
    var expandedState: StringDictionary[String] = js.native
  }
  object ITreeState {
    
    @scala.inline
    def apply(expandedState: StringDictionary[String]): ITreeState = {
      val __obj = js.Dynamic.literal(expandedState = expandedState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeState]
    }
    
    @scala.inline
    implicit class ITreeStateMutableBuilder[Self <: ITreeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedState(value: StringDictionary[String]): Self = StObject.set(x, "expandedState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IUiGridTreeBaseConstants extends ISharedTreeConstants {
    
    var featureName: String = js.native
  }
  object IUiGridTreeBaseConstants {
    
    @scala.inline
    def apply(
      COLLAPSED: String,
      EXPANDED: String,
      aggregation: AVG_,
      featureName: String,
      rowHeaderColName: String
    ): IUiGridTreeBaseConstants = {
      val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridTreeBaseConstants]
    }
    
    @scala.inline
    implicit class IUiGridTreeBaseConstantsMutableBuilder[Self <: IUiGridTreeBaseConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    }
  }
  
  type rowCollapsedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
  
  type rowExpandedHandler[TEntity] = js.Function1[/* row */ IGridRowOf[TEntity], Unit]
}
