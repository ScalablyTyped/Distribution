package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesMonday extends StObject {
  
  var enumValues: Monday
}
object EnumValuesMonday {
  
  @scala.inline
  def apply(enumValues: Monday): EnumValuesMonday = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesMonday]
  }
  
  @scala.inline
  implicit class EnumValuesMondayMutableBuilder[Self <: EnumValuesMonday] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Monday): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
