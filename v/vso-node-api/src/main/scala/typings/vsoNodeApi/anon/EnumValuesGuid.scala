package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesGuid extends StObject {
  
  var enumValues: Guid
}
object EnumValuesGuid {
  
  inline def apply(enumValues: Guid): EnumValuesGuid = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesGuid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesGuid] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Guid): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
