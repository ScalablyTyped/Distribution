package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesOnline extends StObject {
  
  var enumValues: Online
}
object EnumValuesOnline {
  
  inline def apply(enumValues: Online): EnumValuesOnline = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesOnline]
  }
  
  extension [Self <: EnumValuesOnline](x: Self) {
    
    inline def setEnumValues(value: Online): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
