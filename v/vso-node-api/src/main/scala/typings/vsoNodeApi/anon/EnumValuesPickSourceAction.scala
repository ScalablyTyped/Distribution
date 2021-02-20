package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesPickSourceAction extends StObject {
  
  var enumValues: PickSourceAction = js.native
}
object EnumValuesPickSourceAction {
  
  @scala.inline
  def apply(enumValues: PickSourceAction): EnumValuesPickSourceAction = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPickSourceAction]
  }
  
  @scala.inline
  implicit class EnumValuesPickSourceActionMutableBuilder[Self <: EnumValuesPickSourceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: PickSourceAction): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
