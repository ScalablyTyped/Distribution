package typings.uiGrid.mod

import typings.angular.mod.IScope
import typings.uiGrid.mod.grouping.IGridGroupingConfiguration
import typings.uiGrid.mod.treeBase.ITreeState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveState {
  
  trait IGridOptions extends StObject {
    
    /**
      * Save the current filter state for each column
      * Defaults to true
      * @default true
      */
    var saveFilter: js.UndefOr[Boolean] = js.undefined
    
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
    var saveFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Save the grouping configuration. If set to true and the grouping feature is not enabled then does
      * nothing. Defaults to true
      * @default true
      */
    var saveGrouping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Save the grouping row expanded states.
      * If set to true and the grouping feature is not enabled then does nothing.
      *
      * This can be quite a bit of data, in many cases you wouldn't want to save this information.
      *
      * Defaults to false
      * @default false
      */
    var saveGroupingExpandedStates: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Restore the current column order.
      * Note that unless you've provided the user with some way to reorder their columns
      * (for example the move columns feature), this makes little sense.
      * Defaults to true
      * @default true
      */
    var saveOrder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Save pinning state for columns.
      * Defaults to true
      * @default true
      */
    var savePinning: js.UndefOr[Boolean] = js.undefined
    
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
    var saveRowIdentity: js.UndefOr[Boolean] = js.undefined
    
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
    var saveScroll: js.UndefOr[Boolean] = js.undefined
    
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
    var saveSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Save the current sort state for each column
      * Defaults to true
      *
      * @default true
      */
    var saveSort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Save the treeView configuration. If set to true and the treeView feature is not enabled then does
      * nothing.
      *
      * @default true;
      */
    var saveTreeView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Save whether or not columns are visible
      * Defaults to true
      * @default true
      */
    var saveVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Save the current column widths.
      * Note that unless you've provided the user with some way to resize their columns
      * (say the resize columns feature), then this makes little sense.
      * Defaults to true
      * @default true
      */
    var saveWidths: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.saveState.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.saveState.IGridOptions]
    }
    
    extension [Self <: typings.uiGrid.mod.saveState.IGridOptions](x: Self) {
      
      inline def setSaveFilter(value: Boolean): Self = StObject.set(x, "saveFilter", value.asInstanceOf[js.Any])
      
      inline def setSaveFilterUndefined: Self = StObject.set(x, "saveFilter", js.undefined)
      
      inline def setSaveFocus(value: Boolean): Self = StObject.set(x, "saveFocus", value.asInstanceOf[js.Any])
      
      inline def setSaveFocusUndefined: Self = StObject.set(x, "saveFocus", js.undefined)
      
      inline def setSaveGrouping(value: Boolean): Self = StObject.set(x, "saveGrouping", value.asInstanceOf[js.Any])
      
      inline def setSaveGroupingExpandedStates(value: Boolean): Self = StObject.set(x, "saveGroupingExpandedStates", value.asInstanceOf[js.Any])
      
      inline def setSaveGroupingExpandedStatesUndefined: Self = StObject.set(x, "saveGroupingExpandedStates", js.undefined)
      
      inline def setSaveGroupingUndefined: Self = StObject.set(x, "saveGrouping", js.undefined)
      
      inline def setSaveOrder(value: Boolean): Self = StObject.set(x, "saveOrder", value.asInstanceOf[js.Any])
      
      inline def setSaveOrderUndefined: Self = StObject.set(x, "saveOrder", js.undefined)
      
      inline def setSavePinning(value: Boolean): Self = StObject.set(x, "savePinning", value.asInstanceOf[js.Any])
      
      inline def setSavePinningUndefined: Self = StObject.set(x, "savePinning", js.undefined)
      
      inline def setSaveRowIdentity(value: Boolean): Self = StObject.set(x, "saveRowIdentity", value.asInstanceOf[js.Any])
      
      inline def setSaveRowIdentityUndefined: Self = StObject.set(x, "saveRowIdentity", js.undefined)
      
      inline def setSaveScroll(value: Boolean): Self = StObject.set(x, "saveScroll", value.asInstanceOf[js.Any])
      
      inline def setSaveScrollUndefined: Self = StObject.set(x, "saveScroll", js.undefined)
      
      inline def setSaveSelection(value: Boolean): Self = StObject.set(x, "saveSelection", value.asInstanceOf[js.Any])
      
      inline def setSaveSelectionUndefined: Self = StObject.set(x, "saveSelection", js.undefined)
      
      inline def setSaveSort(value: Boolean): Self = StObject.set(x, "saveSort", value.asInstanceOf[js.Any])
      
      inline def setSaveSortUndefined: Self = StObject.set(x, "saveSort", js.undefined)
      
      inline def setSaveTreeView(value: Boolean): Self = StObject.set(x, "saveTreeView", value.asInstanceOf[js.Any])
      
      inline def setSaveTreeViewUndefined: Self = StObject.set(x, "saveTreeView", js.undefined)
      
      inline def setSaveVisible(value: Boolean): Self = StObject.set(x, "saveVisible", value.asInstanceOf[js.Any])
      
      inline def setSaveVisibleUndefined: Self = StObject.set(x, "saveVisible", js.undefined)
      
      inline def setSaveWidths(value: Boolean): Self = StObject.set(x, "saveWidths", value.asInstanceOf[js.Any])
      
      inline def setSaveWidthsUndefined: Self = StObject.set(x, "saveWidths", js.undefined)
    }
  }
  
  trait IGridSaveStateApi extends StObject {
    
    // Methods
    /**
      * Restores the provided state into the grid
      * @param $scope A scope we can broadcast on
      * @param state The state that should ve restored into the grid
      */
    def restore($scope: IScope, state: IGridSavedState): Unit
    
    /**
      * Packages the current state of the grid into an object, and provides it to the user for saving
      * @returns Current grid state as a POJO
      */
    def save(): IGridSavedState
  }
  object IGridSaveStateApi {
    
    inline def apply(restore: (IScope, IGridSavedState) => Unit, save: () => IGridSavedState): IGridSaveStateApi = {
      val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), save = js.Any.fromFunction0(save))
      __obj.asInstanceOf[IGridSaveStateApi]
    }
    
    extension [Self <: IGridSaveStateApi](x: Self) {
      
      inline def setRestore(value: (IScope, IGridSavedState) => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
      
      inline def setSave(value: () => IGridSavedState): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    }
  }
  
  trait IGridSavedState extends StObject {
    
    var columns: js.UndefOr[js.Array[ISavedColumn]] = js.undefined
    
    var grouping: IGridGroupingConfiguration
    
    var scrollFocus: js.UndefOr[ISavedScrollFocus] = js.undefined
    
    var selection: js.Array[IRowVal]
    
    var treeView: ITreeState
  }
  object IGridSavedState {
    
    inline def apply(grouping: IGridGroupingConfiguration, selection: js.Array[IRowVal], treeView: ITreeState): IGridSavedState = {
      val __obj = js.Dynamic.literal(grouping = grouping.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridSavedState]
    }
    
    extension [Self <: IGridSavedState](x: Self) {
      
      inline def setColumns(value: js.Array[ISavedColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ISavedColumn*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setGrouping(value: IGridGroupingConfiguration): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      inline def setScrollFocus(value: ISavedScrollFocus): Self = StObject.set(x, "scrollFocus", value.asInstanceOf[js.Any])
      
      inline def setScrollFocusUndefined: Self = StObject.set(x, "scrollFocus", js.undefined)
      
      inline def setSelection(value: js.Array[IRowVal]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionVarargs(value: IRowVal*): Self = StObject.set(x, "selection", js.Array(value*))
      
      inline def setTreeView(value: ITreeState): Self = StObject.set(x, "treeView", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRowVal extends StObject {
    
    var identity: Boolean
    
    var row: Double | Any
  }
  object IRowVal {
    
    inline def apply(identity: Boolean, row: Double | Any): IRowVal = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRowVal]
    }
    
    extension [Self <: IRowVal](x: Self) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double | Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISavedColumn extends StObject {
    
    var filters: js.UndefOr[js.Array[IFilterOptions]] = js.undefined
    
    var name: String
    
    var pinned: js.UndefOr[String] = js.undefined
    
    var sort: js.UndefOr[ISortInfo] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ISavedColumn {
    
    inline def apply(name: String): ISavedColumn = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISavedColumn]
    }
    
    extension [Self <: ISavedColumn](x: Self) {
      
      inline def setFilters(value: js.Array[IFilterOptions]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: IFilterOptions*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setSort(value: ISortInfo): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ISavedScrollFocus extends StObject {
    
    var colName: js.UndefOr[String] = js.undefined
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var rowVal: js.UndefOr[IRowVal] = js.undefined
  }
  object ISavedScrollFocus {
    
    inline def apply(): ISavedScrollFocus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISavedScrollFocus]
    }
    
    extension [Self <: ISavedScrollFocus](x: Self) {
      
      inline def setColName(value: String): Self = StObject.set(x, "colName", value.asInstanceOf[js.Any])
      
      inline def setColNameUndefined: Self = StObject.set(x, "colName", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setRowVal(value: IRowVal): Self = StObject.set(x, "rowVal", value.asInstanceOf[js.Any])
      
      inline def setRowValUndefined: Self = StObject.set(x, "rowVal", js.undefined)
    }
  }
}
