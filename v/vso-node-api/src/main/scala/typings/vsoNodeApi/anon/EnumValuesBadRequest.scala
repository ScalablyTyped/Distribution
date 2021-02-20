package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBadRequest extends StObject {
  
  var enumValues: BadRequest = js.native
}
object EnumValuesBadRequest {
  
  @scala.inline
  def apply(enumValues: BadRequest): EnumValuesBadRequest = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBadRequest]
  }
  
  @scala.inline
  implicit class EnumValuesBadRequestMutableBuilder[Self <: EnumValuesBadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: BadRequest): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
