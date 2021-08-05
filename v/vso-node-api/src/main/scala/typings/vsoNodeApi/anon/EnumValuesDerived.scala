package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDerived extends StObject {
  
  var enumValues: Derived
}
object EnumValuesDerived {
  
  inline def apply(enumValues: Derived): EnumValuesDerived = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDerived]
  }
  
  extension [Self <: EnumValuesDerived](x: Self) {
    
    inline def setEnumValues(value: Derived): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
