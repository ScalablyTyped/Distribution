package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDoing extends StObject {
  
  var enumValues: Doing
}
object EnumValuesDoing {
  
  inline def apply(enumValues: Doing): EnumValuesDoing = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDoing]
  }
  
  extension [Self <: EnumValuesDoing](x: Self) {
    
    inline def setEnumValues(value: Doing): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
