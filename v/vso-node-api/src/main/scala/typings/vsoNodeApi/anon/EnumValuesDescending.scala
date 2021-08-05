package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDescending extends StObject {
  
  var enumValues: Descending
}
object EnumValuesDescending {
  
  inline def apply(enumValues: Descending): EnumValuesDescending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDescending]
  }
  
  extension [Self <: EnumValuesDescending](x: Self) {
    
    inline def setEnumValues(value: Descending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
