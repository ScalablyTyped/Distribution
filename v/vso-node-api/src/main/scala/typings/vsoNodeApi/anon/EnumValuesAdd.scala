package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAdd extends StObject {
  
  var enumValues: Add
}
object EnumValuesAdd {
  
  inline def apply(enumValues: Add): EnumValuesAdd = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdd]
  }
  
  extension [Self <: EnumValuesAdd](x: Self) {
    
    inline def setEnumValues(value: Add): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
