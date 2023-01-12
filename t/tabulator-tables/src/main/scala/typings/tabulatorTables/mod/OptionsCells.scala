package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsCells
  extends StObject
     with CellCallbacks {
  
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
object OptionsCells {
  
  inline def apply(): OptionsCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsCells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsCells] (val x: Self) extends AnyVal {
    
    inline def setValidationFailed(
      value: (/* cell */ CellComponent, /* value */ Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Unit
    ): Self = StObject.set(x, "validationFailed", js.Any.fromFunction3(value))
    
    inline def setValidationFailedUndefined: Self = StObject.set(x, "validationFailed", js.undefined)
  }
}
