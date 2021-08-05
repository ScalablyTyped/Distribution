package typings.uiGrid.mod

import typings.angular.mod.IScope
import typings.uiGrid.anon.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinning {
  
  trait IColumnDef extends StObject {
    
    /**
      * Enable pinning for the individual column.  Defaults to true
      * @default true
      */
    var enablePinning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column is pinned left when grid is rendered.  Defaults to false
      * @default false
      */
    var pinnedLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Column is pinned right when grid is rendered.  Defaults to false
      * @default false
      */
    var pinnedRight: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnDef {
    
    inline def apply(): typings.uiGrid.mod.pinning.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.pinning.IColumnDef]
    }
    
    extension [Self <: typings.uiGrid.mod.pinning.IColumnDef](x: Self) {
      
      inline def setEnablePinning(value: Boolean): Self = StObject.set(x, "enablePinning", value.asInstanceOf[js.Any])
      
      inline def setEnablePinningUndefined: Self = StObject.set(x, "enablePinning", js.undefined)
      
      inline def setPinnedLeft(value: Boolean): Self = StObject.set(x, "pinnedLeft", value.asInstanceOf[js.Any])
      
      inline def setPinnedLeftUndefined: Self = StObject.set(x, "pinnedLeft", js.undefined)
      
      inline def setPinnedRight(value: Boolean): Self = StObject.set(x, "pinnedRight", value.asInstanceOf[js.Any])
      
      inline def setPinnedRightUndefined: Self = StObject.set(x, "pinnedRight", js.undefined)
    }
  }
  
  trait IGridOptions extends StObject {
    
    /**
      * Enable pinning for the entire grid.
      * Defaults to true
      * @default true
      */
    var enablePinning: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.pinning.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.pinning.IGridOptions]
    }
    
    extension [Self <: typings.uiGrid.mod.pinning.IGridOptions](x: Self) {
      
      inline def setEnablePinning(value: Boolean): Self = StObject.set(x, "enablePinning", value.asInstanceOf[js.Any])
      
      inline def setEnablePinningUndefined: Self = StObject.set(x, "enablePinning", js.undefined)
    }
  }
  
  trait IGridPinningApi[TEntity] extends StObject {
    
    // Events
    /**
      * raised when column pin state has changed
      * @param {ng.IScope} scope The grid scope
      * @param {columnPinHandler} handler Callback
      */
    def columnPin(scope: IScope, handler: columnPinHandler): Unit
    
    // Methods
    /**
      * Pin column left, right, or none
      * @param {IGridColumn} col The column being pinned
      * @param {string} container One of the recognized container types from uiGridPinningConstants
      */
    def pinColumn(col: IGridColumnOf[TEntity], container: String): Unit
  }
  object IGridPinningApi {
    
    inline def apply[TEntity](columnPin: (IScope, columnPinHandler) => Unit, pinColumn: (IGridColumnOf[TEntity], String) => Unit): IGridPinningApi[TEntity] = {
      val __obj = js.Dynamic.literal(columnPin = js.Any.fromFunction2(columnPin), pinColumn = js.Any.fromFunction2(pinColumn))
      __obj.asInstanceOf[IGridPinningApi[TEntity]]
    }
    
    extension [Self <: IGridPinningApi[?], TEntity](x: Self & IGridPinningApi[TEntity]) {
      
      inline def setColumnPin(value: (IScope, columnPinHandler) => Unit): Self = StObject.set(x, "columnPin", js.Any.fromFunction2(value))
      
      inline def setPinColumn(value: (IGridColumnOf[TEntity], String) => Unit): Self = StObject.set(x, "pinColumn", js.Any.fromFunction2(value))
    }
  }
  
  trait IUiGridPinningConstants extends StObject {
    
    var container: NONE
  }
  object IUiGridPinningConstants {
    
    inline def apply(container: NONE): IUiGridPinningConstants = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridPinningConstants]
    }
    
    extension [Self <: IUiGridPinningConstants](x: Self) {
      
      inline def setContainer(value: NONE): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
  
  type columnPinHandler = js.Function2[/* colDef */ typings.uiGrid.mod.pinning.IColumnDef, /* container */ String, Unit]
}
