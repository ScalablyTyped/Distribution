package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIncludeInheritedDefinitionsOnly extends StObject {
  
  var enumValues: IncludeInheritedDefinitionsOnly
}
object EnumValuesIncludeInheritedDefinitionsOnly {
  
  inline def apply(enumValues: IncludeInheritedDefinitionsOnly): EnumValuesIncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncludeInheritedDefinitionsOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesIncludeInheritedDefinitionsOnly] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: IncludeInheritedDefinitionsOnly): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
