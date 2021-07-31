package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIncludeInheritedDefinitionsOnly extends StObject {
  
  var enumValues: IncludeInheritedDefinitionsOnly
}
object EnumValuesIncludeInheritedDefinitionsOnly {
  
  @scala.inline
  def apply(enumValues: IncludeInheritedDefinitionsOnly): EnumValuesIncludeInheritedDefinitionsOnly = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncludeInheritedDefinitionsOnly]
  }
  
  @scala.inline
  implicit class EnumValuesIncludeInheritedDefinitionsOnlyMutableBuilder[Self <: EnumValuesIncludeInheritedDefinitionsOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: IncludeInheritedDefinitionsOnly): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
