package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBadRequest extends StObject {
  
  var enumValues: BadRequest
}
object EnumValuesBadRequest {
  
  inline def apply(enumValues: BadRequest): EnumValuesBadRequest = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesBadRequest] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: BadRequest): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
