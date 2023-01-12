package typings.uiGrid.mod

import typings.uiGrid.anon.ColumnPositionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveColumns {
  
  trait IColumnDef extends StObject {
    
    /**
      * Enable column moving for the column
      */
    var enableColumnMoving: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnDef {
    
    inline def apply(): typings.uiGrid.mod.moveColumns.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.moveColumns.IColumnDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.uiGrid.mod.moveColumns.IColumnDef] (val x: Self) extends AnyVal {
      
      inline def setEnableColumnMoving(value: Boolean): Self = StObject.set(x, "enableColumnMoving", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnMovingUndefined: Self = StObject.set(x, "enableColumnMoving", js.undefined)
    }
  }
  
  trait IGridMoveColumnsApi extends StObject {
    
    // Methods
    /**
      * Method can be used to change column position
      * @param originalPosition Original column position as a 0 indexed integer
      * @param newPosition New column position as a 0 indexed integer
      */
    def moveColumn(originalPosition: Double, newPosition: Double): Unit
    
    // Events
    var on: ColumnPositionChanged
  }
  object IGridMoveColumnsApi {
    
    inline def apply(moveColumn: (Double, Double) => Unit, on: ColumnPositionChanged): IGridMoveColumnsApi = {
      val __obj = js.Dynamic.literal(moveColumn = js.Any.fromFunction2(moveColumn), on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridMoveColumnsApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGridMoveColumnsApi] (val x: Self) extends AnyVal {
      
      inline def setMoveColumn(value: (Double, Double) => Unit): Self = StObject.set(x, "moveColumn", js.Any.fromFunction2(value))
      
      inline def setOn(value: ColumnPositionChanged): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGridOptions extends StObject {
    
    /**
      * If defined, sets the default value for the colMovable flag on each individual colDefs
      * if their individual enableColumnMoving configuration is not defined.
      * Defaults to true.
      * @default true
      */
    var enableColumnMoving: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.moveColumns.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.moveColumns.IGridOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.uiGrid.mod.moveColumns.IGridOptions] (val x: Self) extends AnyVal {
      
      inline def setEnableColumnMoving(value: Boolean): Self = StObject.set(x, "enableColumnMoving", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnMovingUndefined: Self = StObject.set(x, "enableColumnMoving", js.undefined)
    }
  }
  
  type columnPositionChangedHandler = js.Function3[
    /* colDef */ typings.uiGrid.mod.moveColumns.IColumnDef, 
    /* originalPosition */ Double, 
    /* finalPosition */ Double, 
    Unit
  ]
}
