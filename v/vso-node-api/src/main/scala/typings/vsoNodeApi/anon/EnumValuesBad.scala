package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBad extends StObject {
  
  var enumValues: Bad
}
object EnumValuesBad {
  
  inline def apply(enumValues: Bad): EnumValuesBad = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBad]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesBad] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Bad): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
