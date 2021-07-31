package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesEquals extends StObject {
  
  var enumValues: Equals
}
object EnumValuesEquals {
  
  @scala.inline
  def apply(enumValues: Equals): EnumValuesEquals = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEquals]
  }
  
  @scala.inline
  implicit class EnumValuesEqualsMutableBuilder[Self <: EnumValuesEquals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Equals): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
