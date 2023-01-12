package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAutomation extends StObject {
  
  var enumValues: Automation
}
object EnumValuesAutomation {
  
  inline def apply(enumValues: Automation): EnumValuesAutomation = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAutomation] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Automation): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
