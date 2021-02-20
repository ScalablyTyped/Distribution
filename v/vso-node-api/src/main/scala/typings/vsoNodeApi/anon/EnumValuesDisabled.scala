package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDisabled extends StObject {
  
  var enumValues: Disabled = js.native
}
object EnumValuesDisabled {
  
  @scala.inline
  def apply(enumValues: Disabled): EnumValuesDisabled = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDisabled]
  }
  
  @scala.inline
  implicit class EnumValuesDisabledMutableBuilder[Self <: EnumValuesDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Disabled): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
