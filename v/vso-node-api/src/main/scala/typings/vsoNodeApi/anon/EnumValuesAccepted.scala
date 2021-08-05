package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAccepted extends StObject {
  
  var enumValues: Accepted
}
object EnumValuesAccepted {
  
  inline def apply(enumValues: Accepted): EnumValuesAccepted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAccepted]
  }
  
  extension [Self <: EnumValuesAccepted](x: Self) {
    
    inline def setEnumValues(value: Accepted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
