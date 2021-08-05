package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFlat extends StObject {
  
  var enumValues: Flat
}
object EnumValuesFlat {
  
  inline def apply(enumValues: Flat): EnumValuesFlat = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFlat]
  }
  
  extension [Self <: EnumValuesFlat](x: Self) {
    
    inline def setEnumValues(value: Flat): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
