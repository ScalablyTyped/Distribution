package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIncludeEventTypeInformation extends StObject {
  
  var enumValues: IncludeEventTypeInformation
}
object EnumValuesIncludeEventTypeInformation {
  
  inline def apply(enumValues: IncludeEventTypeInformation): EnumValuesIncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncludeEventTypeInformation]
  }
  
  extension [Self <: EnumValuesIncludeEventTypeInformation](x: Self) {
    
    inline def setEnumValues(value: IncludeEventTypeInformation): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
