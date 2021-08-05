package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCurrent extends StObject {
  
  var enumValues: Current
}
object EnumValuesCurrent {
  
  inline def apply(enumValues: Current): EnumValuesCurrent = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCurrent]
  }
  
  extension [Self <: EnumValuesCurrent](x: Self) {
    
    inline def setEnumValues(value: Current): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
