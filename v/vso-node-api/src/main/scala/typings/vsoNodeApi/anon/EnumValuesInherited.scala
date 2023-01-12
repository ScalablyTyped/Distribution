package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesInherited extends StObject {
  
  var enumValues: Inherited
}
object EnumValuesInherited {
  
  inline def apply(enumValues: Inherited): EnumValuesInherited = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInherited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesInherited] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Inherited): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
