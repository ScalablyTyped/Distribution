package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFail extends StObject {
  
  var enumValues: Fail = js.native
}
object EnumValuesFail {
  
  @scala.inline
  def apply(enumValues: Fail): EnumValuesFail = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFail]
  }
  
  @scala.inline
  implicit class EnumValuesFailMutableBuilder[Self <: EnumValuesFail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Fail): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
