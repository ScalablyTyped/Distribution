package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAbortedBySystem extends StObject {
  
  var enumValues: AbortedBySystem = js.native
}
object EnumValuesAbortedBySystem {
  
  @scala.inline
  def apply(enumValues: AbortedBySystem): EnumValuesAbortedBySystem = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAbortedBySystem]
  }
  
  @scala.inline
  implicit class EnumValuesAbortedBySystemMutableBuilder[Self <: EnumValuesAbortedBySystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AbortedBySystem): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
