package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesInactive extends StObject {
  
  var enumValues: Inactive
}
object EnumValuesInactive {
  
  inline def apply(enumValues: Inactive): EnumValuesInactive = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesInactive] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Inactive): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
