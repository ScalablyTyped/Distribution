package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAsc extends StObject {
  
  var enumValues: Asc
}
object EnumValuesAsc {
  
  inline def apply(enumValues: Asc): EnumValuesAsc = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAsc]
  }
  
  extension [Self <: EnumValuesAsc](x: Self) {
    
    inline def setEnumValues(value: Asc): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
