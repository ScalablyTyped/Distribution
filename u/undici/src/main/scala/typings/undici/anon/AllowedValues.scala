package typings.undici.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedValues extends StObject {
  
  var allowedValues: js.UndefOr[js.Array[Any]] = js.undefined
  
  def converter(args: Any*): Any
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var key: String
  
  var required: js.UndefOr[Boolean] = js.undefined
}
object AllowedValues {
  
  inline def apply(converter: /* repeated */ Any => Any, key: String): AllowedValues = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction1(converter), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedValues] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: js.Array[Any]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: Any*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setConverter(value: /* repeated */ Any => Any): Self = StObject.set(x, "converter", js.Any.fromFunction1(value))
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
