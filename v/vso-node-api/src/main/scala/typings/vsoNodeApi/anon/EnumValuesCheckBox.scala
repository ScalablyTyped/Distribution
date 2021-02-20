package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCheckBox extends StObject {
  
  var enumValues: CheckBox = js.native
}
object EnumValuesCheckBox {
  
  @scala.inline
  def apply(enumValues: CheckBox): EnumValuesCheckBox = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCheckBox]
  }
  
  @scala.inline
  implicit class EnumValuesCheckBoxMutableBuilder[Self <: EnumValuesCheckBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CheckBox): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
