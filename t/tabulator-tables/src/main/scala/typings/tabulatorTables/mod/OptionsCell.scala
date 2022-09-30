package typings.tabulatorTables.mod

import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsCell extends StObject {
  
  /** The cellClick callback is triggered when a user left clicks on a cell, it can be set on a per column basis using the option in the columns definition object. */
  var cellClick: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellContext: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellDblClick: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellDblTap: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.undefined
  
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.undefined
  
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.undefined
  
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellTap: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellTapHold: js.UndefOr[CellEventCallback] = js.undefined
}
object OptionsCell {
  
  inline def apply(): OptionsCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsCell]
  }
  
  extension [Self <: OptionsCell](x: Self) {
    
    inline def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction2(value))
    
    inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
    
    inline def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellContext", js.Any.fromFunction2(value))
    
    inline def setCellContextUndefined: Self = StObject.set(x, "cellContext", js.undefined)
    
    inline def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2(value))
    
    inline def setCellDblClickUndefined: Self = StObject.set(x, "cellDblClick", js.undefined)
    
    inline def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2(value))
    
    inline def setCellDblTapUndefined: Self = StObject.set(x, "cellDblTap", js.undefined)
    
    inline def setCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1(value))
    
    inline def setCellEditCancelledUndefined: Self = StObject.set(x, "cellEditCancelled", js.undefined)
    
    inline def setCellEdited(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1(value))
    
    inline def setCellEditedUndefined: Self = StObject.set(x, "cellEdited", js.undefined)
    
    inline def setCellEditing(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1(value))
    
    inline def setCellEditingUndefined: Self = StObject.set(x, "cellEditing", js.undefined)
    
    inline def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2(value))
    
    inline def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
    
    inline def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2(value))
    
    inline def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
    
    inline def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2(value))
    
    inline def setCellMouseMoveUndefined: Self = StObject.set(x, "cellMouseMove", js.undefined)
    
    inline def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2(value))
    
    inline def setCellMouseOutUndefined: Self = StObject.set(x, "cellMouseOut", js.undefined)
    
    inline def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2(value))
    
    inline def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
    
    inline def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTap", js.Any.fromFunction2(value))
    
    inline def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2(value))
    
    inline def setCellTapHoldUndefined: Self = StObject.set(x, "cellTapHold", js.undefined)
    
    inline def setCellTapUndefined: Self = StObject.set(x, "cellTap", js.undefined)
  }
}
