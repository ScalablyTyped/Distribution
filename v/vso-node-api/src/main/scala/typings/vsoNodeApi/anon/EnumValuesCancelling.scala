package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCancelling extends StObject {
  
  var enumValues: Cancelling = js.native
}
object EnumValuesCancelling {
  
  @scala.inline
  def apply(enumValues: Cancelling): EnumValuesCancelling = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancelling]
  }
  
  @scala.inline
  implicit class EnumValuesCancellingMutableBuilder[Self <: EnumValuesCancelling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Cancelling): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
