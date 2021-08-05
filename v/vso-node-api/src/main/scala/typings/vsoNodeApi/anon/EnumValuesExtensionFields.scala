package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesExtensionFields extends StObject {
  
  var enumValues: ExtensionFields
}
object EnumValuesExtensionFields {
  
  inline def apply(enumValues: ExtensionFields): EnumValuesExtensionFields = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExtensionFields]
  }
  
  extension [Self <: EnumValuesExtensionFields](x: Self) {
    
    inline def setEnumValues(value: ExtensionFields): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
