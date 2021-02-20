package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDecrement extends StObject {
  
  var enumValues: Decrement = js.native
}
object EnumValuesDecrement {
  
  @scala.inline
  def apply(enumValues: Decrement): EnumValuesDecrement = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDecrement]
  }
  
  @scala.inline
  implicit class EnumValuesDecrementMutableBuilder[Self <: EnumValuesDecrement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Decrement): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
