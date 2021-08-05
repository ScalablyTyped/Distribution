package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesHS256 extends StObject {
  
  var enumValues: HS256
}
object EnumValuesHS256 {
  
  inline def apply(enumValues: HS256): EnumValuesHS256 = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesHS256]
  }
  
  extension [Self <: EnumValuesHS256](x: Self) {
    
    inline def setEnumValues(value: HS256): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
