package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAssigned extends StObject {
  
  var enumValues: Assigned = js.native
}
object EnumValuesAssigned {
  
  @scala.inline
  def apply(enumValues: Assigned): EnumValuesAssigned = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAssigned]
  }
  
  @scala.inline
  implicit class EnumValuesAssignedMutableBuilder[Self <: EnumValuesAssigned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Assigned): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
