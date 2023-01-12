package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRegex extends StObject {
  
  var enumValues: Regex
}
object EnumValuesRegex {
  
  inline def apply(enumValues: Regex): EnumValuesRegex = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRegex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesRegex] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Regex): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
