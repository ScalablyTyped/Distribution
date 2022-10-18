package typings.tabulatorTables.mod

import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tabulatorTables.mod.CellCallbacks because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined cellMouseDown, cellMouseUp
- typings.tabulatorTables.mod.OptionsCells because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined validationFailed */ trait Options
  extends StObject
     with OptionsGeneral
     with OptionsMenu
     with OptionsHistory
     with OptionsLocale
     with OptionsDownload
     with OptionsColumns
     with OptionsRows
     with OptionsData
     with OptionsSorting
     with OptionsFiltering
     with OptionsRowGrouping
     with OptionsPagination
     with OptionsPersistentConfiguration
     with OptionsClipboard
     with OptionsDataTree
     with OptionsCell
     with OptionsDebug
     with OptionsHTML {
  
  var cellMouseDown: js.UndefOr[CellEventCallback] = js.undefined
  
  var cellMouseUp: js.UndefOr[CellEventCallback] = js.undefined
  
  /** The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation. */
  var validationFailed: js.UndefOr[
    js.Function3[
      /* cell */ CellComponent, 
      /* value */ Any, 
      /* validators */ js.Array[StandardValidatorType | Validator], 
      Unit
    ]
  ] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setCellMouseDown(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseDown", js.Any.fromFunction2(value))
    
    inline def setCellMouseDownUndefined: Self = StObject.set(x, "cellMouseDown", js.undefined)
    
    inline def setCellMouseUp(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseUp", js.Any.fromFunction2(value))
    
    inline def setCellMouseUpUndefined: Self = StObject.set(x, "cellMouseUp", js.undefined)
    
    inline def setValidationFailed(
      value: (/* cell */ CellComponent, /* value */ Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Unit
    ): Self = StObject.set(x, "validationFailed", js.Any.fromFunction3(value))
    
    inline def setValidationFailedUndefined: Self = StObject.set(x, "validationFailed", js.undefined)
  }
}
