package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesLocked extends StObject {
  
  var enumValues: Locked = js.native
}
object EnumValuesLocked {
  
  @scala.inline
  def apply(enumValues: Locked): EnumValuesLocked = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesLocked]
  }
  
  @scala.inline
  implicit class EnumValuesLockedMutableBuilder[Self <: EnumValuesLocked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Locked): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
