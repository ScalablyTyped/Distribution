package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesGeneric extends StObject {
  
  var enumValues: Generic
}
object EnumValuesGeneric {
  
  @scala.inline
  def apply(enumValues: Generic): EnumValuesGeneric = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesGeneric]
  }
  
  @scala.inline
  implicit class EnumValuesGenericMutableBuilder[Self <: EnumValuesGeneric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Generic): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
