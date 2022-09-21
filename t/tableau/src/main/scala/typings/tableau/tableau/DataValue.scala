package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValue extends StObject {
  
  /** The value formatted according to the locale and the formatting applied to the field or parameter. */
  var formattedValue: String
  
  /** Contains the raw native value as a JavaScript type, which is one of String, Number, Boolean, or Date */
  var value: Any
}
object DataValue {
  
  inline def apply(formattedValue: String, value: Any): DataValue = {
    val __obj = js.Dynamic.literal(formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  
  extension [Self <: DataValue](x: Self) {
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
