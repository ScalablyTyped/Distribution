package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCustomerContactNotification extends StObject {
  
  var enumValues: CustomerContactNotification
}
object EnumValuesCustomerContactNotification {
  
  inline def apply(enumValues: CustomerContactNotification): EnumValuesCustomerContactNotification = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCustomerContactNotification]
  }
  
  extension [Self <: EnumValuesCustomerContactNotification](x: Self) {
    
    inline def setEnumValues(value: CustomerContactNotification): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
