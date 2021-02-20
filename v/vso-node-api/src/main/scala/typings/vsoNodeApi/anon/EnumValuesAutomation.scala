package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAutomation extends StObject {
  
  var enumValues: Automation = js.native
}
object EnumValuesAutomation {
  
  @scala.inline
  def apply(enumValues: Automation): EnumValuesAutomation = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutomation]
  }
  
  @scala.inline
  implicit class EnumValuesAutomationMutableBuilder[Self <: EnumValuesAutomation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Automation): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
