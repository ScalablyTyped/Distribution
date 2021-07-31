package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesSucceeded extends StObject {
  
  var enumValues: Succeeded
}
object EnumValuesSucceeded {
  
  @scala.inline
  def apply(enumValues: Succeeded): EnumValuesSucceeded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesSucceeded]
  }
  
  @scala.inline
  implicit class EnumValuesSucceededMutableBuilder[Self <: EnumValuesSucceeded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Succeeded): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
