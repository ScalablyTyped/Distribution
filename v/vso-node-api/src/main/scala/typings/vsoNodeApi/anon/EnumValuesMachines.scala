package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesMachines extends StObject {
  
  var enumValues: Machines = js.native
}
object EnumValuesMachines {
  
  @scala.inline
  def apply(enumValues: Machines): EnumValuesMachines = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesMachines]
  }
  
  @scala.inline
  implicit class EnumValuesMachinesMutableBuilder[Self <: EnumValuesMachines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Machines): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
