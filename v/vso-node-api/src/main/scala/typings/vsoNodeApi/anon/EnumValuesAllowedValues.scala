package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAllowedValues extends StObject {
  
  var enumValues: AllowedValues = js.native
}
object EnumValuesAllowedValues {
  
  @scala.inline
  def apply(enumValues: AllowedValues): EnumValuesAllowedValues = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllowedValues]
  }
  
  @scala.inline
  implicit class EnumValuesAllowedValuesMutableBuilder[Self <: EnumValuesAllowedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AllowedValues): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
