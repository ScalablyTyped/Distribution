package typings.uiGrid.mod

import org.scalablytyped.runtime.Instantiable2
import typings.angular.JQueryKeyEventObject
import typings.angular.mod.IPromise
import typings.std.Number
import typings.uiGrid.anon.CLEAR
import typings.uiGrid.anon.LEFT
import typings.uiGrid.anon.Navigate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellNav {
  
  trait ICellNavApi[TEntity] extends StObject {
    
    // Methods
    /**
      * Gets the currently selected rows and columns.  array is empty if no selection has occurred
      * @returns an array containing the current selection
      */
    def getCurrentSelection(): js.Array[IRowCol[TEntity]]
    
    /**
      * Gets the current focused cell.  value is null if no selection has occurred
      * @returns the current (or last if Grid does not have focus) focused row and column
      */
    def getFocusedCell(): IRowCol[TEntity]
    
    // Events
    var on: Navigate[TEntity]
    
    /**
      * Gets the index of the passed rowCol.  Returns -1 if the RowCol isn't selected
      * @param rowCol
      * @returns the index in the order in which the RowCol was selected
      */
    def rowColSelectIndex(rowCol: IRowCol[TEntity]): Double
    
    /**
      * Brings the specified row and column into view, and sets focus to that cell
      * @param rowEntity gridOptions.data[] array instance to make visible and set focus
      * @param colDef Column definition to make visible and set focus
      */
    def scrollToFocus(rowEntity: TEntity, colDef: typings.uiGrid.mod.cellNav.IColumnDef): IPromise[Any]
  }
  object ICellNavApi {
    
    inline def apply[TEntity](
      getCurrentSelection: () => js.Array[IRowCol[TEntity]],
      getFocusedCell: () => IRowCol[TEntity],
      on: Navigate[TEntity],
      rowColSelectIndex: IRowCol[TEntity] => Double,
      scrollToFocus: (TEntity, typings.uiGrid.mod.cellNav.IColumnDef) => IPromise[Any]
    ): ICellNavApi[TEntity] = {
      val __obj = js.Dynamic.literal(getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getFocusedCell = js.Any.fromFunction0(getFocusedCell), on = on.asInstanceOf[js.Any], rowColSelectIndex = js.Any.fromFunction1(rowColSelectIndex), scrollToFocus = js.Any.fromFunction2(scrollToFocus))
      __obj.asInstanceOf[ICellNavApi[TEntity]]
    }
    
    extension [Self <: ICellNavApi[?], TEntity](x: Self & ICellNavApi[TEntity]) {
      
      inline def setGetCurrentSelection(value: () => js.Array[IRowCol[TEntity]]): Self = StObject.set(x, "getCurrentSelection", js.Any.fromFunction0(value))
      
      inline def setGetFocusedCell(value: () => IRowCol[TEntity]): Self = StObject.set(x, "getFocusedCell", js.Any.fromFunction0(value))
      
      inline def setOn(value: Navigate[TEntity]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setRowColSelectIndex(value: IRowCol[TEntity] => Double): Self = StObject.set(x, "rowColSelectIndex", js.Any.fromFunction1(value))
      
      inline def setScrollToFocus(value: (TEntity, typings.uiGrid.mod.cellNav.IColumnDef) => IPromise[Any]): Self = StObject.set(x, "scrollToFocus", js.Any.fromFunction2(value))
    }
  }
  
  trait IColumnDef extends StObject {
    
    /**
      * Enable focus on a cell within this column.
      * Defaults to true
      * @default true
      */
    var allowCellFocus: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnDef {
    
    inline def apply(): typings.uiGrid.mod.cellNav.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.cellNav.IColumnDef]
    }
    
    extension [Self <: typings.uiGrid.mod.cellNav.IColumnDef](x: Self) {
      
      inline def setAllowCellFocus(value: Boolean): Self = StObject.set(x, "allowCellFocus", value.asInstanceOf[js.Any])
      
      inline def setAllowCellFocusUndefined: Self = StObject.set(x, "allowCellFocus", js.undefined)
    }
  }
  
  trait IGridOptions extends StObject {
    
    /**
      * Enable multiple cell selection only when using the ctrlKey or shiftKey.
      * Defaults to false
      * @default false
      */
    var modifierKeysToMultiSelectCells: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.cellNav.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.cellNav.IGridOptions]
    }
    
    extension [Self <: typings.uiGrid.mod.cellNav.IGridOptions](x: Self) {
      
      inline def setModifierKeysToMultiSelectCells(value: Boolean): Self = StObject.set(x, "modifierKeysToMultiSelectCells", value.asInstanceOf[js.Any])
      
      inline def setModifierKeysToMultiSelectCellsUndefined: Self = StObject.set(x, "modifierKeysToMultiSelectCells", js.undefined)
    }
  }
  
  trait IGridRow extends StObject {
    
    /**
      * Enable focus on a cell within this row. If set to false then no cells in this row can be focused
      * Group header rows, for example, would set this to false.
      * Defaults to true
      */
    var allowCellFocus: js.UndefOr[Boolean] = js.undefined
  }
  object IGridRow {
    
    inline def apply(): typings.uiGrid.mod.cellNav.IGridRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.cellNav.IGridRow]
    }
    
    extension [Self <: typings.uiGrid.mod.cellNav.IGridRow](x: Self) {
      
      inline def setAllowCellFocus(value: Boolean): Self = StObject.set(x, "allowCellFocus", value.asInstanceOf[js.Any])
      
      inline def setAllowCellFocusUndefined: Self = StObject.set(x, "allowCellFocus", js.undefined)
    }
  }
  
  trait IRowCol[TEntity] extends StObject {
    
    var col: IGridColumnOf[TEntity]
    
    /**
      * Gets the intersection of where the row and column meet.
      * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
      *          will also apply the filter to it and return the value that the filter displays
      */
    def getIntersectionValueFiltered(): String | Number | js.Object
    
    /**
      * Gets the intersection of where the row and column meet
      * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
      *          will NOT return the filtered value.
      */
    def getIntersectionValueRaw(): String | Number | js.Object
    
    var row: IGridRowOf[TEntity]
  }
  object IRowCol {
    
    inline def apply[TEntity](
      col: IGridColumnOf[TEntity],
      getIntersectionValueFiltered: () => String | Number | js.Object,
      getIntersectionValueRaw: () => String | Number | js.Object,
      row: IGridRowOf[TEntity]
    ): IRowCol[TEntity] = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], getIntersectionValueFiltered = js.Any.fromFunction0(getIntersectionValueFiltered), getIntersectionValueRaw = js.Any.fromFunction0(getIntersectionValueRaw), row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRowCol[TEntity]]
    }
    
    extension [Self <: IRowCol[?], TEntity](x: Self & IRowCol[TEntity]) {
      
      inline def setCol(value: IGridColumnOf[TEntity]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setGetIntersectionValueFiltered(value: () => String | Number | js.Object): Self = StObject.set(x, "getIntersectionValueFiltered", js.Any.fromFunction0(value))
      
      inline def setGetIntersectionValueRaw(value: () => String | Number | js.Object): Self = StObject.set(x, "getIntersectionValueRaw", js.Any.fromFunction0(value))
      
      inline def setRow(value: IGridRowOf[TEntity]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRowColConstructor[TEntity]
    extends StObject
       with Instantiable2[/* row */ IGridRowOf[TEntity], /* col */ IGridColumnOf[TEntity], IRowCol[TEntity]]
  
  trait IUiGridCellNavConstants extends StObject {
    
    var CELL_NAV_EVENT: String
    
    var EVENT_TYPE: CLEAR
    
    var FEATURE_NAME: String
    
    var direction: LEFT
  }
  object IUiGridCellNavConstants {
    
    inline def apply(CELL_NAV_EVENT: String, EVENT_TYPE: CLEAR, FEATURE_NAME: String, direction: LEFT): IUiGridCellNavConstants = {
      val __obj = js.Dynamic.literal(CELL_NAV_EVENT = CELL_NAV_EVENT.asInstanceOf[js.Any], EVENT_TYPE = EVENT_TYPE.asInstanceOf[js.Any], FEATURE_NAME = FEATURE_NAME.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridCellNavConstants]
    }
    
    extension [Self <: IUiGridCellNavConstants](x: Self) {
      
      inline def setCELL_NAV_EVENT(value: String): Self = StObject.set(x, "CELL_NAV_EVENT", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: LEFT): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEVENT_TYPE(value: CLEAR): Self = StObject.set(x, "EVENT_TYPE", value.asInstanceOf[js.Any])
      
      inline def setFEATURE_NAME(value: String): Self = StObject.set(x, "FEATURE_NAME", value.asInstanceOf[js.Any])
    }
  }
  
  type navigateHandler[TEntity] = js.Function2[/* newRowCol */ IRowCol[TEntity], /* oldRowCol */ IRowCol[TEntity], Unit]
  
  type viewportKeyDownHandler[TEntity] = js.Function2[/* event */ JQueryKeyEventObject, /* rowCol */ IRowCol[TEntity], Unit]
  
  type viewportKeyPressHandler[TEntity] = js.Function2[/* event */ JQueryKeyEventObject, /* rowCol */ IRowCol[TEntity], Unit]
}
