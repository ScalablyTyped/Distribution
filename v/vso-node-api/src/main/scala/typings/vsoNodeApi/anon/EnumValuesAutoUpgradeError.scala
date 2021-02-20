package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAutoUpgradeError extends StObject {
  
  var enumValues: AutoUpgradeError = js.native
}
object EnumValuesAutoUpgradeError {
  
  @scala.inline
  def apply(enumValues: AutoUpgradeError): EnumValuesAutoUpgradeError = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutoUpgradeError]
  }
  
  @scala.inline
  implicit class EnumValuesAutoUpgradeErrorMutableBuilder[Self <: EnumValuesAutoUpgradeError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AutoUpgradeError): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
