package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesServiceFlags extends StObject {
  
  var enumValues: ServiceFlags
}
object EnumValuesServiceFlags {
  
  inline def apply(enumValues: ServiceFlags): EnumValuesServiceFlags = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesServiceFlags]
  }
  
  extension [Self <: EnumValuesServiceFlags](x: Self) {
    
    inline def setEnumValues(value: ServiceFlags): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
