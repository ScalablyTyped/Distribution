package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFriday extends StObject {
  
  var enumValues: Friday
}
object EnumValuesFriday {
  
  inline def apply(enumValues: Friday): EnumValuesFriday = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFriday]
  }
  
  extension [Self <: EnumValuesFriday](x: Self) {
    
    inline def setEnumValues(value: Friday): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
