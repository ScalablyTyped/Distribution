package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesForcePush extends StObject {
  
  var enumValues: ForcePush = js.native
}
object EnumValuesForcePush {
  
  @scala.inline
  def apply(enumValues: ForcePush): EnumValuesForcePush = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesForcePush]
  }
  
  @scala.inline
  implicit class EnumValuesForcePushMutableBuilder[Self <: EnumValuesForcePush] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ForcePush): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
