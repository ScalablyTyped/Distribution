package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesApproved extends StObject {
  
  var enumValues: Approved
}
object EnumValuesApproved {
  
  inline def apply(enumValues: Approved): EnumValuesApproved = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesApproved]
  }
  
  extension [Self <: EnumValuesApproved](x: Self) {
    
    inline def setEnumValues(value: Approved): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
