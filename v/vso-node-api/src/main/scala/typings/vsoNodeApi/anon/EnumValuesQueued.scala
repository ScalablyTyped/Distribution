package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesQueued extends StObject {
  
  var enumValues: Queued = js.native
}
object EnumValuesQueued {
  
  @scala.inline
  def apply(enumValues: Queued): EnumValuesQueued = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesQueued]
  }
  
  @scala.inline
  implicit class EnumValuesQueuedMutableBuilder[Self <: EnumValuesQueued] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Queued): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
