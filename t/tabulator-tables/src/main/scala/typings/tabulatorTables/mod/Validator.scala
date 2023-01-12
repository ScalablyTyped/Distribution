package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator extends StObject {
  
  var parameters: js.UndefOr[Any] = js.undefined
  
  var `type`: StandardValidatorType | (js.Function3[/* cell */ CellComponent, /* value */ Any, /* parameters */ js.UndefOr[Any], Boolean])
}
object Validator {
  
  inline def apply(
    `type`: StandardValidatorType | (js.Function3[/* cell */ CellComponent, /* value */ Any, /* parameters */ js.UndefOr[Any], Boolean])
  ): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(
      value: StandardValidatorType | (js.Function3[/* cell */ CellComponent, /* value */ Any, /* parameters */ js.UndefOr[Any], Boolean])
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction3(value: (/* cell */ CellComponent, /* value */ Any, /* parameters */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
  }
}
