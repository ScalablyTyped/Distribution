package typings.uiGrid.mod

import typings.angular.mod.IScope
import typings.uiGrid.mod.grouping.IGridGroupingConfiguration
import typings.uiGrid.mod.treeBase.ITreeState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveState {
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * Save the current filter state for each column
      * Defaults to true
      * @default true
      */
    var saveFilter: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the current focused cell. On returning to this focused cell we'll also scroll.
      * This option is preferred to the saveScroll option, so is set to true by default.
      * If saveScroll is set to true then this option will be disabled.
      *
      * By default this option saves the current row number and column number, and returns to that row and
      * column. However, if you define a saveRowIdentity function, then it will return you to the currently
      * selected column within that row (in a business sense - so if some rows have been deleted, it will still
      * find the same data, presuming it still exists in the list. If it isn't in the list then it will instead
      * return to the same row number - i.e. scroll percentage)
      *
      * Note that this option will do nothing if the cellNav feature is not enabled.
      *
      * Defaults to true (unless saveScroll is true)
      * @default true
      */
    var saveFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the grouping configuration. If set to true and the grouping feature is not enabled then does
      * nothing. Defaults to true
      * @default true
      */
    var saveGrouping: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the grouping row expanded states.
      * If set to true and the grouping feature is not enabled then does nothing.
      *
      * This can be quite a bit of data, in many cases you wouldn't want to save this information.
      *
      * Defaults to false
      * @default false
      */
    var saveGroupingExpandedStates: js.UndefOr[Boolean] = js.native
    
    /**
      * Restore the current column order.
      * Note that unless you've provided the user with some way to reorder their columns
      * (for example the move columns feature), this makes little sense.
      * Defaults to true
      * @default true
      */
    var saveOrder: js.UndefOr[Boolean] = js.native
    
    /**
      * Save pinning state for columns.
      * Defaults to true
      * @default true
      */
    var savePinning: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that can be called, passing in a rowEntity, and that will return a unique id for that row.
      * This might simply return the id field from that row (if you have one),
      * or it might concatenate some fields within the row to make a unique value.
      *
      * This value will be used to find the same row again and set the focus to it, if it exists when we return.
      *
      * Defaults to undefined
      * @default undefined
      */
    var saveRowIdentity: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the current scroll position.
      * Note that this is saved as the percentage of the grid scrolled -
      * so if your user returns to a grid with a significantly different number of rows
      * (perhaps some data has been deleted) then the scroll won't actually show the same rows as before.
      * If you want to scroll to a specific row then you should instead use the saveFocus option,
      * which is the default.
      *
      * Note that this element will only be saved if the cellNav feature is enabled
      *
      * Defaults to false
      * @default false
      */
    var saveScroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the currently selected rows.
      * If the saveRowIdentity callback is defined, then it will save the id of the row and select that.
      * If not, then it will attempt to select the rows by row number,
      * which will give the wrong results if the data set has changed in the mean-time.
      *
      * Note that this option only does anything if the selection feature is enabled.
      *
      * Defaults to true
      * @default true
      */
    var saveSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the current sort state for each column
      * Defaults to true
      *
      * @default true
      */
    var saveSort: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the treeView configuration. If set to true and the treeView feature is not enabled then does
      * nothing.
      *
      * @default true;
      */
    var saveTreeView: js.UndefOr[Boolean] = js.native
    
    /**
      * Save whether or not columns are visible
      * Defaults to true
      * @default true
      */
    var saveVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Save the current column widths.
      * Note that unless you've provided the user with some way to resize their columns
      * (say the resize columns feature), then this makes little sense.
      * Defaults to true
      * @default true
      */
    var saveWidths: js.UndefOr[Boolean] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.saveState.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.saveState.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typings.uiGrid.mod.saveState.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSaveFilter(value: Boolean): Self = StObject.set(x, "saveFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveFilterUndefined: Self = StObject.set(x, "saveFilter", js.undefined)
      
      @scala.inline
      def setSaveFocus(value: Boolean): Self = StObject.set(x, "saveFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveFocusUndefined: Self = StObject.set(x, "saveFocus", js.undefined)
      
      @scala.inline
      def setSaveGrouping(value: Boolean): Self = StObject.set(x, "saveGrouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveGroupingExpandedStates(value: Boolean): Self = StObject.set(x, "saveGroupingExpandedStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveGroupingExpandedStatesUndefined: Self = StObject.set(x, "saveGroupingExpandedStates", js.undefined)
      
      @scala.inline
      def setSaveGroupingUndefined: Self = StObject.set(x, "saveGrouping", js.undefined)
      
      @scala.inline
      def setSaveOrder(value: Boolean): Self = StObject.set(x, "saveOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveOrderUndefined: Self = StObject.set(x, "saveOrder", js.undefined)
      
      @scala.inline
      def setSavePinning(value: Boolean): Self = StObject.set(x, "savePinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavePinningUndefined: Self = StObject.set(x, "savePinning", js.undefined)
      
      @scala.inline
      def setSaveRowIdentity(value: Boolean): Self = StObject.set(x, "saveRowIdentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveRowIdentityUndefined: Self = StObject.set(x, "saveRowIdentity", js.undefined)
      
      @scala.inline
      def setSaveScroll(value: Boolean): Self = StObject.set(x, "saveScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveScrollUndefined: Self = StObject.set(x, "saveScroll", js.undefined)
      
      @scala.inline
      def setSaveSelection(value: Boolean): Self = StObject.set(x, "saveSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveSelectionUndefined: Self = StObject.set(x, "saveSelection", js.undefined)
      
      @scala.inline
      def setSaveSort(value: Boolean): Self = StObject.set(x, "saveSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveSortUndefined: Self = StObject.set(x, "saveSort", js.undefined)
      
      @scala.inline
      def setSaveTreeView(value: Boolean): Self = StObject.set(x, "saveTreeView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveTreeViewUndefined: Self = StObject.set(x, "saveTreeView", js.undefined)
      
      @scala.inline
      def setSaveVisible(value: Boolean): Self = StObject.set(x, "saveVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveVisibleUndefined: Self = StObject.set(x, "saveVisible", js.undefined)
      
      @scala.inline
      def setSaveWidths(value: Boolean): Self = StObject.set(x, "saveWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveWidthsUndefined: Self = StObject.set(x, "saveWidths", js.undefined)
    }
  }
  
  @js.native
  trait IGridSaveStateApi extends StObject {
    
    // Methods
    /**
      * Restores the provided state into the grid
      * @param {ng.IScope} $scope A scope we can broadcast on
      * @param {IGridSavedState} state The state that should ve restored into the grid
      */
    def restore($scope: IScope, state: IGridSavedState): Unit = js.native
    
    /**
      * Packages the current state of the grid into an object, and provides it to the user for saving
      * @returns {IGridSavedState} Current grid state as a POJO
      */
    def save(): IGridSavedState = js.native
  }
  object IGridSaveStateApi {
    
    @scala.inline
    def apply(restore: (IScope, IGridSavedState) => Unit, save: () => IGridSavedState): IGridSaveStateApi = {
      val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), save = js.Any.fromFunction0(save))
      __obj.asInstanceOf[IGridSaveStateApi]
    }
    
    @scala.inline
    implicit class IGridSaveStateApiMutableBuilder[Self <: IGridSaveStateApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestore(value: (IScope, IGridSavedState) => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSave(value: () => IGridSavedState): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IGridSavedState extends StObject {
    
    var columns: js.UndefOr[js.Array[ISavedColumn]] = js.native
    
    var grouping: IGridGroupingConfiguration = js.native
    
    var scrollFocus: js.UndefOr[ISavedScrollFocus] = js.native
    
    var selection: js.Array[IRowVal] = js.native
    
    var treeView: ITreeState = js.native
  }
  object IGridSavedState {
    
    @scala.inline
    def apply(grouping: IGridGroupingConfiguration, selection: js.Array[IRowVal], treeView: ITreeState): IGridSavedState = {
      val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridSavedState]
    }
    
    @scala.inline
    implicit class IGridSavedStateMutableBuilder[Self <: IGridSavedState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[ISavedColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ISavedColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setGrouping(value: IGridGroupingConfiguration): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollFocus(value: ISavedScrollFocus): Self = StObject.set(x, "scrollFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollFocusUndefined: Self = StObject.set(x, "scrollFocus", js.undefined)
      
      @scala.inline
      def setSelection(value: js.Array[IRowVal]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionVarargs(value: IRowVal*): Self = StObject.set(x, "selection", js.Array(value :_*))
      
      @scala.inline
      def setTreeView(value: ITreeState): Self = StObject.set(x, "treeView", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRowVal extends StObject {
    
    var identity: Boolean = js.native
    
    var row: Double | js.Any = js.native
  }
  object IRowVal {
    
    @scala.inline
    def apply(identity: Boolean, row: Double | js.Any): IRowVal = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRowVal]
    }
    
    @scala.inline
    implicit class IRowValMutableBuilder[Self <: IRowVal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double | js.Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISavedColumn extends StObject {
    
    var filters: js.UndefOr[js.Array[IFilterOptions]] = js.native
    
    var name: String = js.native
    
    var pinned: js.UndefOr[String] = js.native
    
    var sort: js.UndefOr[ISortInfo] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ISavedColumn {
    
    @scala.inline
    def apply(name: String): ISavedColumn = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISavedColumn]
    }
    
    @scala.inline
    implicit class ISavedColumnMutableBuilder[Self <: ISavedColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[IFilterOptions]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: IFilterOptions*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      @scala.inline
      def setSort(value: ISortInfo): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ISavedScrollFocus extends StObject {
    
    var colName: js.UndefOr[String] = js.native
    
    var focus: js.UndefOr[Boolean] = js.native
    
    var rowVal: js.UndefOr[IRowVal] = js.native
  }
  object ISavedScrollFocus {
    
    @scala.inline
    def apply(): ISavedScrollFocus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISavedScrollFocus]
    }
    
    @scala.inline
    implicit class ISavedScrollFocusMutableBuilder[Self <: ISavedScrollFocus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColName(value: String): Self = StObject.set(x, "colName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColNameUndefined: Self = StObject.set(x, "colName", js.undefined)
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setRowVal(value: IRowVal): Self = StObject.set(x, "rowVal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowValUndefined: Self = StObject.set(x, "rowVal", js.undefined)
    }
  }
}
