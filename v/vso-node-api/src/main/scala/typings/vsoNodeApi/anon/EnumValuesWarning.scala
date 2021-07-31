package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesWarning extends StObject {
  
  var enumValues: Warning
}
object EnumValuesWarning {
  
  @scala.inline
  def apply(enumValues: Warning): EnumValuesWarning = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesWarning]
  }
  
  @scala.inline
  implicit class EnumValuesWarningMutableBuilder[Self <: EnumValuesWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Warning): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
