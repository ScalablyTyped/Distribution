package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesActionRequired extends StObject {
  
  var enumValues: ActionRequired = js.native
}
object EnumValuesActionRequired {
  
  @scala.inline
  def apply(enumValues: ActionRequired): EnumValuesActionRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesActionRequired]
  }
  
  @scala.inline
  implicit class EnumValuesActionRequiredMutableBuilder[Self <: EnumValuesActionRequired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ActionRequired): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
