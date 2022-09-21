package typings.uiGrid.mod

import typings.angular.mod.IAngularEvent
import typings.uiGrid.anon.RowSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selection {
  
  trait IGridOptions extends StObject {
    
    /**
      * Shows the total number of selected items in footer if true.
      * Defaults to true.
      * GridOptions.showGridFooter must also be set to true.
      * @default true
      */
    var enableFooterTotalSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable selection by clicking anywhere on the row.
      * Defaults to false if enableRowHeaderSelection is true, otherwise defaults to false.
      */
    var enableFullRowSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable a row header to be used for selection
      * Defaults to true
      * @default true
      */
    var enableRowHeaderSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable row selection for entire grid.
      * Defaults to true
      */
    var enableRowSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable the select all checkbox at the top of the selectionRowHeader
      * Defaults to true
      * @default true
      */
    var enableSelectAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If selected rows are changed in bulk, either via the API or via the selectAll checkbox,
      * then a separate event is fired.
      * Setting this option to false will cause the rowSelectionChanged event to be called multiple times instead
      * Defaults to true
      * @default true
      */
    var enableSelectionBatchEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes it possible to specify a method that evaluates for each row and sets its "enableSelection"
      * property.
      */
    var isRowSelectable: js.UndefOr[js.Function1[/* row */ typings.uiGrid.mod.selection.IGridRow, Boolean]] = js.undefined
    
    /**
      * Enable multiple row selection only when using the ctrlKey or shiftKey. Requires multiSelect to be true.
      * Defaults to false
      * @default false
      */
    var modifierKeysToMultiSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable multiple row selection for entire grid
      * Defaults to true
      * @default true
      */
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent a row from being unselected.
      * Works in conjunction with multiselect = false and gridApi.selection.selectRow() to allow you to
      * create a single selection only grid -
      * a row is always selected, you can only select different rows, you can't unselect the row.
      * Defaults to false
      * @default false
      */
    var noUnselect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * can be used to set a custom width for the row header selection column
      * Defaults to 30px
      * @default 30
      */
    var selectionRowHeaderWidth: js.UndefOr[Double] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.selection.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.selection.IGridOptions]
    }
    
    extension [Self <: typings.uiGrid.mod.selection.IGridOptions](x: Self) {
      
      inline def setEnableFooterTotalSelected(value: Boolean): Self = StObject.set(x, "enableFooterTotalSelected", value.asInstanceOf[js.Any])
      
      inline def setEnableFooterTotalSelectedUndefined: Self = StObject.set(x, "enableFooterTotalSelected", js.undefined)
      
      inline def setEnableFullRowSelection(value: Boolean): Self = StObject.set(x, "enableFullRowSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableFullRowSelectionUndefined: Self = StObject.set(x, "enableFullRowSelection", js.undefined)
      
      inline def setEnableRowHeaderSelection(value: Boolean): Self = StObject.set(x, "enableRowHeaderSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableRowHeaderSelectionUndefined: Self = StObject.set(x, "enableRowHeaderSelection", js.undefined)
      
      inline def setEnableRowSelection(value: Boolean): Self = StObject.set(x, "enableRowSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableRowSelectionUndefined: Self = StObject.set(x, "enableRowSelection", js.undefined)
      
      inline def setEnableSelectAll(value: Boolean): Self = StObject.set(x, "enableSelectAll", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectAllUndefined: Self = StObject.set(x, "enableSelectAll", js.undefined)
      
      inline def setEnableSelectionBatchEvent(value: Boolean): Self = StObject.set(x, "enableSelectionBatchEvent", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectionBatchEventUndefined: Self = StObject.set(x, "enableSelectionBatchEvent", js.undefined)
      
      inline def setIsRowSelectable(value: /* row */ typings.uiGrid.mod.selection.IGridRow => Boolean): Self = StObject.set(x, "isRowSelectable", js.Any.fromFunction1(value))
      
      inline def setIsRowSelectableUndefined: Self = StObject.set(x, "isRowSelectable", js.undefined)
      
      inline def setModifierKeysToMultiSelect(value: Boolean): Self = StObject.set(x, "modifierKeysToMultiSelect", value.asInstanceOf[js.Any])
      
      inline def setModifierKeysToMultiSelectUndefined: Self = StObject.set(x, "modifierKeysToMultiSelect", js.undefined)
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setNoUnselect(value: Boolean): Self = StObject.set(x, "noUnselect", value.asInstanceOf[js.Any])
      
      inline def setNoUnselectUndefined: Self = StObject.set(x, "noUnselect", js.undefined)
      
      inline def setSelectionRowHeaderWidth(value: Double): Self = StObject.set(x, "selectionRowHeaderWidth", value.asInstanceOf[js.Any])
      
      inline def setSelectionRowHeaderWidthUndefined: Self = StObject.set(x, "selectionRowHeaderWidth", js.undefined)
    }
  }
  
  trait IGridRow extends StObject {
    
    /**
      * Enable row selection for this row, only settable by internal code.
      *
      * The grouping feature, for example, might set group header rows to not be selectable.
      * Defaults to true
      * @default true
      */
    var enableSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Selected state of row.
      * Should be readonly.
      * Make any changes to selected state using setSelected().
      * Defaults to false
      *
      * @default false
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the isSelected property and updates the selectedCount
      * Changes to isSelected state should only be made via this function
      * @param selected Value to set
      */
    def setSelected(selected: Boolean): Unit
  }
  object IGridRow {
    
    inline def apply(setSelected: Boolean => Unit): typings.uiGrid.mod.selection.IGridRow = {
      val __obj = js.Dynamic.literal(setSelected = js.Any.fromFunction1(setSelected))
      __obj.asInstanceOf[typings.uiGrid.mod.selection.IGridRow]
    }
    
    extension [Self <: typings.uiGrid.mod.selection.IGridRow](x: Self) {
      
      inline def setEnableSelection(value: Boolean): Self = StObject.set(x, "enableSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableSelectionUndefined: Self = StObject.set(x, "enableSelection", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setSetSelected(value: Boolean => Unit): Self = StObject.set(x, "setSelected", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IGridSelectionApi[TEntity] extends StObject {
    
    // Methods
    /**
      * Unselects All Rows
      * @param event object if raised from event
      */
    def clearSelectedRows(): Unit = js.native
    def clearSelectedRows(event: IAngularEvent): Unit = js.native
    
    /**
      * Returns whether or not the selectAll checkbox is currently ticked.
      * The grid doesn't automatically select rows when you add extra data -
      * so when you add data you need to explicitly check whether the selectAll is set,
      * and then call setVisible rows if it is
      * @returns Whether or not selectAll checkbox is ticked
      */
    def getSelectAllState(): Boolean = js.native
    
    /**
      * returns all selected rows as gridRows
      * @returns The selected rows
      */
    def getSelectedGridRows(): js.Array[IGridRowOf[TEntity]] = js.native
    
    /**
      * Gets selected rows as entities
      * @returns Selected row entities
      */
    def getSelectedRows(): js.Array[TEntity] = js.native
    
    // Events
    var on: RowSelectionChanged[TEntity] = js.native
    
    /**
      * Selects all rows.  Does nothing if multiselect = false
      * @param event object if raised from event
      */
    def selectAllRows(): Unit = js.native
    def selectAllRows(event: IAngularEvent): Unit = js.native
    
    /**
      * Selects all visible rows.  Does nothing if multiselect = false
      * @param event object if raised from event
      */
    def selectAllVisibleRows(): Unit = js.native
    def selectAllVisibleRows(event: IAngularEvent): Unit = js.native
    
    /**
      * Select row by data
      * @param rowEntity gridOptions.data[] array value
      * @param event object if raised from event
      */
    def selectRow(rowEntity: TEntity): Unit = js.native
    def selectRow(rowEntity: TEntity, event: IAngularEvent): Unit = js.native
    
    /**
      * selects all GridRows who have an key that is equal to comparator
      * so for Example if isInEntity == false then it does this check: row[key] === comparator
      * if isInEntity == true then it does this check: row.entity[key] === comparator
      * @param isInEntity if true then key is in entity else it's directly in row
      * @param key the key to look for
      * @param comparator the value that key should have
      * @param evt object if raised from an event
      * @param lookInRows the rows to look in - if not provided then looks in grid.rows
      */
    def selectRowByKey(isInEntity: Boolean, key: String, comparator: Any): Unit = js.native
    def selectRowByKey(
      isInEntity: Boolean,
      key: String,
      comparator: Any,
      evt: Unit,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    def selectRowByKey(isInEntity: Boolean, key: String, comparator: Any, evt: IAngularEvent): Unit = js.native
    def selectRowByKey(
      isInEntity: Boolean,
      key: String,
      comparator: Any,
      evt: IAngularEvent,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    def selectRowByKey(isInEntity: Boolean, key: Double, comparator: Any): Unit = js.native
    def selectRowByKey(
      isInEntity: Boolean,
      key: Double,
      comparator: Any,
      evt: Unit,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    def selectRowByKey(isInEntity: Boolean, key: Double, comparator: Any, evt: IAngularEvent): Unit = js.native
    def selectRowByKey(
      isInEntity: Boolean,
      key: Double,
      comparator: Any,
      evt: IAngularEvent,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    
    /**
      * Select the specified row by visible index
      * (i.e. if you specify row 0 you'll get the first visible row selected).
      *
      * In this context visible means of those rows that are theoretically visible (i.e. not filtered),
      * rather than rows currently rendered on the screen.
      *
      * @param index Index within rowsVisible array
      * @param event object if raised from event
      */
    def selectRowByVisibleIndex(index: Double): Unit = js.native
    def selectRowByVisibleIndex(index: Double, event: IAngularEvent): Unit = js.native
    
    /**
      * Sets the current gridOption.modifierKeysToMultiSelect to true or false
      * @param multiSelect true to only allow multiple rows when using ctrlKey or shiftKey is used
      */
    def setModifierKeysToMultiSelect(multiSelect: Boolean): Unit = js.native
    
    /**
      * Sets the current gridOption.multiSelect to true or false
      * @param multiSelect true to allow multiple rows
      */
    def setMultiSelect(multiSelect: Boolean): Unit = js.native
    
    /**
      * Toggles data row as selected or unselected
      * @param rowEntity gridOptions.data[] array value
      * @param event object if raised from event
      */
    def toggleRowSelection(rowEntity: TEntity): Unit = js.native
    def toggleRowSelection(rowEntity: TEntity, event: IAngularEvent): Unit = js.native
    
    /**
      * UnSelect the data row
      * @param rowEntity gridOptions.data[] array value
      * @param event object if raised from event
      */
    def unSelectRow(rowEntity: TEntity): Unit = js.native
    def unSelectRow(rowEntity: TEntity, event: IAngularEvent): Unit = js.native
    
    /**
      * unselects the GridRows who have an key that is equal to comparator
      * so for Example if isInEntity == false then it does this check: row[key] === comparator
      * if isInEntity == true then it does this check: row.entity[key] === comparator
      * @param isInEntity if true then key is in entity else it's directly in row
      * @param key the key to look for
      * @param comparator the value that key should have
      * @param evt object if raised from an event
      * @param lookInRows the rows to look in - if not provided then looks in grid.rows
      */
    def unSelectRowByKey(isInEntity: Boolean, key: String, comparator: Any): Unit = js.native
    def unSelectRowByKey(
      isInEntity: Boolean,
      key: String,
      comparator: Any,
      evt: Unit,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    def unSelectRowByKey(isInEntity: Boolean, key: String, comparator: Any, evt: IAngularEvent): Unit = js.native
    def unSelectRowByKey(
      isInEntity: Boolean,
      key: String,
      comparator: Any,
      evt: IAngularEvent,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    def unSelectRowByKey(isInEntity: Boolean, key: Double, comparator: Any): Unit = js.native
    def unSelectRowByKey(
      isInEntity: Boolean,
      key: Double,
      comparator: Any,
      evt: Unit,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    def unSelectRowByKey(isInEntity: Boolean, key: Double, comparator: Any, evt: IAngularEvent): Unit = js.native
    def unSelectRowByKey(
      isInEntity: Boolean,
      key: Double,
      comparator: Any,
      evt: IAngularEvent,
      lookInRows: js.Array[IGridRowOf[TEntity]]
    ): Unit = js.native
    
    /**
      * Unselect the specified row by visible index (i.e. if you specify row 0 you'll get the first visible row unselected).
    			 * In this context visible means of those rows that are theoretically visible (i.e. not filtered), rather than rows currently rendered on the screen.
      * @param rowEntity index within the rowsVisible array
      * @param event object if raised from event
      */
    def unSelectRowByVisibleIndex(rowNum: Double): Unit = js.native
    def unSelectRowByVisibleIndex(rowNum: Double, event: IAngularEvent): Unit = js.native
  }
  
  type rowSelectionChangedBatchHandler[TEntity] = js.Function2[/* row */ js.Array[IGridRowOf[TEntity]], /* event */ js.UndefOr[IAngularEvent], Unit]
  
  type rowSelectionChangedHandler[TEntity] = js.Function2[/* row */ IGridRowOf[TEntity], /* event */ js.UndefOr[IAngularEvent], Unit]
}
