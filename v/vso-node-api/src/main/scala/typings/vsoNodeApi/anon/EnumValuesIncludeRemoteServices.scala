package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIncludeRemoteServices extends StObject {
  
  var enumValues: IncludeRemoteServices
}
object EnumValuesIncludeRemoteServices {
  
  inline def apply(enumValues: IncludeRemoteServices): EnumValuesIncludeRemoteServices = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncludeRemoteServices]
  }
  
  extension [Self <: EnumValuesIncludeRemoteServices](x: Self) {
    
    inline def setEnumValues(value: IncludeRemoteServices): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
