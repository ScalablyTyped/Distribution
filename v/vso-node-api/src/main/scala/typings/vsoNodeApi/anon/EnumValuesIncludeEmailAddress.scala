package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIncludeEmailAddress extends StObject {
  
  var enumValues: IncludeEmailAddress
}
object EnumValuesIncludeEmailAddress {
  
  inline def apply(enumValues: IncludeEmailAddress): EnumValuesIncludeEmailAddress = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncludeEmailAddress]
  }
  
  extension [Self <: EnumValuesIncludeEmailAddress](x: Self) {
    
    inline def setEnumValues(value: IncludeEmailAddress): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
