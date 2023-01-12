package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAutoUpgradeError extends StObject {
  
  var enumValues: AutoUpgradeError
}
object EnumValuesAutoUpgradeError {
  
  inline def apply(enumValues: AutoUpgradeError): EnumValuesAutoUpgradeError = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutoUpgradeError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAutoUpgradeError] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AutoUpgradeError): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
