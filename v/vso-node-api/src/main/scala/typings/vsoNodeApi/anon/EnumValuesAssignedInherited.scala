package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAssignedInherited extends StObject {
  
  var enumValues: AssignedInherited = js.native
}
object EnumValuesAssignedInherited {
  
  @scala.inline
  def apply(enumValues: AssignedInherited): EnumValuesAssignedInherited = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAssignedInherited]
  }
  
  @scala.inline
  implicit class EnumValuesAssignedInheritedMutableBuilder[Self <: EnumValuesAssignedInherited] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AssignedInherited): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
