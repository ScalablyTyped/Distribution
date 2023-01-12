package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCheckBox extends StObject {
  
  var enumValues: CheckBox
}
object EnumValuesCheckBox {
  
  inline def apply(enumValues: CheckBox): EnumValuesCheckBox = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCheckBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCheckBox] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: CheckBox): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
