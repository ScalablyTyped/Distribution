package typings.uiGrid.mod

import typings.angular.mod.IScope
import typings.uiGrid.anon.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinning {
  
  @js.native
  trait IColumnDef extends StObject {
    
    /**
      * Enable pinning for the individual column.  Defaults to true
      * @default true
      */
    var enablePinning: js.UndefOr[Boolean] = js.native
    
    /**
      * Column is pinned left when grid is rendered.  Defaults to false
      * @default false
      */
    var pinnedLeft: js.UndefOr[Boolean] = js.native
    
    /**
      * Column is pinned right when grid is rendered.  Defaults to false
      * @default false
      */
    var pinnedRight: js.UndefOr[Boolean] = js.native
  }
  object IColumnDef {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.pinning.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.pinning.IColumnDef]
    }
    
    @scala.inline
    implicit class IColumnDefMutableBuilder[Self <: typings.uiGrid.mod.pinning.IColumnDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnablePinning(value: Boolean): Self = StObject.set(x, "enablePinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePinningUndefined: Self = StObject.set(x, "enablePinning", js.undefined)
      
      @scala.inline
      def setPinnedLeft(value: Boolean): Self = StObject.set(x, "pinnedLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedLeftUndefined: Self = StObject.set(x, "pinnedLeft", js.undefined)
      
      @scala.inline
      def setPinnedRight(value: Boolean): Self = StObject.set(x, "pinnedRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedRightUndefined: Self = StObject.set(x, "pinnedRight", js.undefined)
    }
  }
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * Enable pinning for the entire grid.
      * Defaults to true
      * @default true
      */
    var enablePinning: js.UndefOr[Boolean] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.pinning.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.pinning.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typings.uiGrid.mod.pinning.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnablePinning(value: Boolean): Self = StObject.set(x, "enablePinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePinningUndefined: Self = StObject.set(x, "enablePinning", js.undefined)
    }
  }
  
  @js.native
  trait IGridPinningApi[TEntity] extends StObject {
    
    // Events
    /**
      * raised when column pin state has changed
      * @param {ng.IScope} scope The grid scope
      * @param {columnPinHandler} handler Callback
      */
    def columnPin(scope: IScope, handler: columnPinHandler): Unit = js.native
    
    // Methods
    /**
      * Pin column left, right, or none
      * @param {IGridColumn} col The column being pinned
      * @param {string} container One of the recognized container types from uiGridPinningConstants
      */
    def pinColumn(col: IGridColumnOf[TEntity], container: String): Unit = js.native
  }
  object IGridPinningApi {
    
    @scala.inline
    def apply[TEntity](columnPin: (IScope, columnPinHandler) => Unit, pinColumn: (IGridColumnOf[TEntity], String) => Unit): IGridPinningApi[TEntity] = {
      val __obj = js.Dynamic.literal(columnPin = js.Any.fromFunction2(columnPin), pinColumn = js.Any.fromFunction2(pinColumn))
      __obj.asInstanceOf[IGridPinningApi[TEntity]]
    }
    
    @scala.inline
    implicit class IGridPinningApiMutableBuilder[Self <: IGridPinningApi[_], TEntity] (val x: Self with IGridPinningApi[TEntity]) extends AnyVal {
      
      @scala.inline
      def setColumnPin(value: (IScope, columnPinHandler) => Unit): Self = StObject.set(x, "columnPin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPinColumn(value: (IGridColumnOf[TEntity], String) => Unit): Self = StObject.set(x, "pinColumn", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IUiGridPinningConstants extends StObject {
    
    var container: NONE = js.native
  }
  object IUiGridPinningConstants {
    
    @scala.inline
    def apply(container: NONE): IUiGridPinningConstants = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUiGridPinningConstants]
    }
    
    @scala.inline
    implicit class IUiGridPinningConstantsMutableBuilder[Self <: IUiGridPinningConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: NONE): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
  
  type columnPinHandler = js.Function2[/* colDef */ typings.uiGrid.mod.pinning.IColumnDef, /* container */ String, Unit]
}
