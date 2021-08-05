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
  
  extension [Self <: EnumValuesAutoUpgradeError](x: Self) {
    
    inline def setEnumValues(value: AutoUpgradeError): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
