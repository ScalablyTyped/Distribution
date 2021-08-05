package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesMultiConfiguration extends StObject {
  
  var enumValues: MultiConfiguration
}
object EnumValuesMultiConfiguration {
  
  inline def apply(enumValues: MultiConfiguration): EnumValuesMultiConfiguration = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesMultiConfiguration]
  }
  
  extension [Self <: EnumValuesMultiConfiguration](x: Self) {
    
    inline def setEnumValues(value: MultiConfiguration): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
