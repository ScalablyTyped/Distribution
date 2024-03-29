package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAssignedInherited extends StObject {
  
  var enumValues: AssignedInherited
}
object EnumValuesAssignedInherited {
  
  inline def apply(enumValues: AssignedInherited): EnumValuesAssignedInherited = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAssignedInherited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAssignedInherited] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AssignedInherited): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
