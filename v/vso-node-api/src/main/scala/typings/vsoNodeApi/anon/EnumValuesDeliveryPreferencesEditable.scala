package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDeliveryPreferencesEditable extends StObject {
  
  var enumValues: DeliveryPreferencesEditable
}
object EnumValuesDeliveryPreferencesEditable {
  
  inline def apply(enumValues: DeliveryPreferencesEditable): EnumValuesDeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDeliveryPreferencesEditable]
  }
  
  extension [Self <: EnumValuesDeliveryPreferencesEditable](x: Self) {
    
    inline def setEnumValues(value: DeliveryPreferencesEditable): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
