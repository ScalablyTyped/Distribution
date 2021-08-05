package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRelease extends StObject {
  
  var enumValues: Release
}
object EnumValuesRelease {
  
  inline def apply(enumValues: Release): EnumValuesRelease = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRelease]
  }
  
  extension [Self <: EnumValuesRelease](x: Self) {
    
    inline def setEnumValues(value: Release): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
