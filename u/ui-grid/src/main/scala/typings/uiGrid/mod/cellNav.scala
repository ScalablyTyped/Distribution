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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellNav {
  
  @js.native
  trait ICellNavApi[TEntity] extends StObject {
    
    // Methods
    /**
      * Gets the currently selected rows and columns.  array is empty if no selection has occurred
      * @returns {Array<IRowCol>} an array containing the current selection
      */
    def getCurrentSelection(): js.Array[IRowCol[TEntity]] = js.native
    
    /**
      * Gets the current focused cell.  value is null if no selection has occurred
      * @returns {IRowCol} the current (or last if Grid does not have focus) focused row and column
      */
    def getFocusedCell(): IRowCol[TEntity] = js.native
    
    // Events
    var on: Navigate[TEntity] = js.native
    
    /**
      * Gets the index of the passed rowCol.  Returns -1 if the RowCol isn't selected
      * @param rowCol
      * @returns the index in the order in which the RowCol was selected
      */
    def rowColSelectIndex(rowCol: IRowCol[TEntity]): Double = js.native
    
    /**
      * Brings the specified row and column into view, and sets focus to that cell
      * @param {TEntity} rowEntity gridOptions.data[] array instance to make visible and set focus
      * @param {IColumnDef} colDef Column definition to make visible and set focus
      */
    def scrollToFocus(rowEntity: TEntity, colDef: typings.uiGrid.mod.cellNav.IColumnDef): IPromise[_] = js.native
  }
  object ICellNavApi {
    
    @scala.inline
    def apply[TEntity](
      getCurrentSelection: () => js.Array[IRowCol[TEntity]],
      getFocusedCell: () => IRowCol[TEntity],
      on: Navigate[TEntity],
      rowColSelectIndex: IRowCol[TEntity] => Double,
      scrollToFocus: (TEntity, typings.uiGrid.mod.cellNav.IColumnDef) => IPromise[_]
    ): ICellNavApi[TEntity] = {
      val __obj = js.Dynamic.literal(getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getFocusedCell = js.Any.fromFunction0(getFocusedCell), on = on.asInstanceOf[js.Any], rowColSelectIndex = js.Any.fromFunction1(rowColSelectIndex), scrollToFocus = js.Any.fromFunction2(scrollToFocus))
      __obj.asInstanceOf[ICellNavApi[TEntity]]
    }
    
    @scala.inline
    implicit class ICellNavApiMutableBuilder[Self <: ICellNavApi[_], TEntity] (val x: Self with ICellNavApi[TEntity]) extends AnyVal {
      
      @scala.inline
      def setGetCurrentSelection(value: () => js.Array[IRowCol[TEntity]]): Self = StObject.set(x, "getCurrentSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedCell(value: () => IRowCol[TEntity]): Self = StObject.set(x, "getFocusedCell", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: Navigate[TEntity]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowColSelectIndex(value: IRowCol[TEntity] => Double): Self = StObject.set(x, "rowColSelectIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToFocus(value: (TEntity, typings.uiGrid.mod.cellNav.IColumnDef) => IPromise[_]): Self = StObject.set(x, "scrollToFocus", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IColumnDef extends StObject {
    
    /**
      * Enable focus on a cell within this column.
      * Defaults to true
      * @default true
      */
    var allowCellFocus: js.UndefOr[Boolean] = js.native
  }
  object IColumnDef {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.cellNav.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.cellNav.IColumnDef]
    }
    
    @scala.inline
    implicit class IColumnDefMutableBuilder[Self <: typings.uiGrid.mod.cellNav.IColumnDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCellFocus(value: Boolean): Self = StObject.set(x, "allowCellFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCellFocusUndefined: Self = StObject.set(x, "allowCellFocus", js.undefined)
    }
  }
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * Enable multiple cell selection only when using the ctrlKey or shiftKey.
      * Defaults to false
      * @default false
      */
    var modifierKeysToMultiSelectCells: js.UndefOr[Boolean] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.cellNav.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.cellNav.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typings.uiGrid.mod.cellNav.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModifierKeysToMultiSelectCells(value: Boolean): Self = StObject.set(x, "modifierKeysToMultiSelectCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierKeysToMultiSelectCellsUndefined: Self = StObject.set(x, "modifierKeysToMultiSelectCells", js.undefined)
    }
  }
  
  @js.native
  trait IGridRow extends StObject {
    
    /**
      * Enable focus on a cell within this row. If set to false then no cells in this row can be focused
      * Group header rows, for example, would set this to false.
      * Defaults to true
      */
    var allowCellFocus: js.UndefOr[Boolean] = js.native
  }
  object IGridRow {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.cellNav.IGridRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.cellNav.IGridRow]
    }
    
    @scala.inline
    implicit class IGridRowMutableBuilder[Self <: typings.uiGrid.mod.cellNav.IGridRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCellFocus(value: Boolean): Self = StObject.set(x, "allowCellFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCellFocusUndefined: Self = StObject.set(x, "allowCellFocus", js.undefined)
    }
  }
  
  @js.native
  trait IRowCol[TEntity] extends StObject {
    
    var col: IGridColumnOf[TEntity] = js.native
    
    /**
      * Gets the intersection of where the row and column meet.
      * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
      *          will also apply the filter to it and return the value that the filter displays
      */
    def getIntersectionValueFiltered(): String | Number | js.Object = js.native
    
    /**
      * Gets the intersection of where the row and column meet
      * @returns The value from the grid data that this RowCol points to.  If the column has a cellFilter this
      *          will NOT return the filtered value.
      */
    def getIntersectionValueRaw(): String | Number | js.Object = js.native
    
    var row: IGridRowOf[TEntity] = js.native
  }
  object IRowCol {
    
    @scala.inline
    def apply[TEntity](
      col: IGridColumnOf[TEntity],
      getIntersectionValueFiltered: () => String | Number | js.Object,
      getIntersectionValueRaw: () => String | Number | js.Object,
      row: IGridRowOf[TEntity]
    ): IRowCol[TEntity] = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], getIntersectionValueFiltered = js.Any.fromFunction0(getIntersectionValueFiltered), getIntersectionValueRaw = js.Any.fromFunction0(getIntersectionValueRaw), row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRowCol[TEntity]]
    }
    
    @scala.inline
    implicit class IRowColMutableBuilder[Self <: IRowCol[_], TEntity] (val x: Self with IRowCol[TEntity]) extends AnyVal {
      
      @scala.inline
      def setCol(value: IGridColumnOf[TEntity]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetIntersectionValueFiltered(value: () => String | Number | js.Object): Self = StObject.set(x, "getIntersectionValueFiltered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIntersectionValueRaw(value: () => String | Number | js.Object): Self = StObject.set(x, "getIntersectionValueRaw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRow(value: IGridRowOf[TEntity]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRowColConstructor[TEntity] extends Instantiable2[/* row */ IGridRowOf[TEntity], /* col */ IGridColumnOf[TEntity], IRowCol[TEntity]]
  
  @js.native
  trait IUiGridCellNavConstants extends StObject {
    
    var CELL_NAV_EVENT: String = js.native
    
    var EVENT_TYPE: CLEAR = js.native
    
    var FEATURE_NAME: String = js.native
    
    var direction: LEFT = js.native
  }
  object IUiGridCellNavConstants {
    
    @scala.inline
    def apply(CELL_NAV_EVENT: String, EVENT_TYPE: CLEAR, FEATURE_NAME: String, direction: LEFT): IUiGridCellNavConstants = {
      val __obj = js.Dynamic.literal(CELL_NAV_EVENT = CELL_NAV_EVENT.asInstanceOf[js.Any], EVENT_TYPE = EVENT_TYPE.asInstanceOf[js.Any], FEATURE_NAME = FEATURE_NAME.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridCellNavConstants]
    }
    
    @scala.inline
    implicit class IUiGridCellNavConstantsMutableBuilder[Self <: IUiGridCellNavConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCELL_NAV_EVENT(value: String): Self = StObject.set(x, "CELL_NAV_EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: LEFT): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEVENT_TYPE(value: CLEAR): Self = StObject.set(x, "EVENT_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFEATURE_NAME(value: String): Self = StObject.set(x, "FEATURE_NAME", value.asInstanceOf[js.Any])
    }
  }
  
  type navigateHandler[TEntity] = js.Function2[/* newRowCol */ IRowCol[TEntity], /* oldRowCol */ IRowCol[TEntity], Unit]
  
  type viewportKeyDownHandler[TEntity] = js.Function2[/* event */ JQueryKeyEventObject, /* rowCol */ IRowCol[TEntity], Unit]
  
  type viewportKeyPressHandler[TEntity] = js.Function2[/* event */ JQueryKeyEventObject, /* rowCol */ IRowCol[TEntity], Unit]
}
