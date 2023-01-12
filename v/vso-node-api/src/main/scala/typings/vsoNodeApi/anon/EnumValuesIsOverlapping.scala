package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIsOverlapping extends StObject {
  
  var enumValues: IsOverlapping
}
object EnumValuesIsOverlapping {
  
  inline def apply(enumValues: IsOverlapping): EnumValuesIsOverlapping = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIsOverlapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesIsOverlapping] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: IsOverlapping): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
