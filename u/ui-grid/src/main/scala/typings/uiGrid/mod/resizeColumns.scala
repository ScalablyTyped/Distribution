package typings.uiGrid.mod

import typings.uiGrid.anon.ColumnSizeChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeColumns {
  
  @js.native
  trait IColumnDef extends StObject {
    
    /**
      * Enable column resizing on an individual column
      * Defaults to GridOptions.enableColumnResizing
      */
    var enableColumnResizing: js.UndefOr[Boolean] = js.native
  }
  object IColumnDef {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.resizeColumns.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.resizeColumns.IColumnDef]
    }
    
    @scala.inline
    implicit class IColumnDefMutableBuilder[Self <: typings.uiGrid.mod.resizeColumns.IColumnDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableColumnResizing(value: Boolean): Self = StObject.set(x, "enableColumnResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnResizingUndefined: Self = StObject.set(x, "enableColumnResizing", js.undefined)
    }
  }
  
  @js.native
  trait IGridOptions extends StObject {
    
    /**
      * Enable column resizing on the entire grid
      * Defaults to true
      * @default true
      */
    var enableColumnResizing: js.UndefOr[Boolean] = js.native
  }
  object IGridOptions {
    
    @scala.inline
    def apply(): typings.uiGrid.mod.resizeColumns.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.resizeColumns.IGridOptions]
    }
    
    @scala.inline
    implicit class IGridOptionsMutableBuilder[Self <: typings.uiGrid.mod.resizeColumns.IGridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableColumnResizing(value: Boolean): Self = StObject.set(x, "enableColumnResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnResizingUndefined: Self = StObject.set(x, "enableColumnResizing", js.undefined)
    }
  }
  
  @js.native
  trait IGridResizeColumnsApi extends StObject {
    
    // Events
    var on: ColumnSizeChanged = js.native
  }
  object IGridResizeColumnsApi {
    
    @scala.inline
    def apply(on: ColumnSizeChanged): IGridResizeColumnsApi = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridResizeColumnsApi]
    }
    
    @scala.inline
    implicit class IGridResizeColumnsApiMutableBuilder[Self <: IGridResizeColumnsApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(value: ColumnSizeChanged): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  type columnSizeChangedHandler = js.Function2[/* colDef */ typings.uiGrid.mod.resizeColumns.IColumnDef, /* delta */ Double, Unit]
}
