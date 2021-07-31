package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPartiallySucceeded extends StObject {
  
  var enumValues: PartiallySucceeded
}
object EnumValuesPartiallySucceeded {
  
  @scala.inline
  def apply(enumValues: PartiallySucceeded): EnumValuesPartiallySucceeded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPartiallySucceeded]
  }
  
  @scala.inline
  implicit class EnumValuesPartiallySucceededMutableBuilder[Self <: EnumValuesPartiallySucceeded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: PartiallySucceeded): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
