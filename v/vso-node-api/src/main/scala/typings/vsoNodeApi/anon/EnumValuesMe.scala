package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesMe extends StObject {
  
  var enumValues: Me
}
object EnumValuesMe {
  
  inline def apply(enumValues: Me): EnumValuesMe = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesMe]
  }
  
  extension [Self <: EnumValuesMe](x: Self) {
    
    inline def setEnumValues(value: Me): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
