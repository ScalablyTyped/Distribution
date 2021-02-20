package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAdminReply extends StObject {
  
  var enumValues: AdminReply = js.native
}
object EnumValuesAdminReply {
  
  @scala.inline
  def apply(enumValues: AdminReply): EnumValuesAdminReply = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdminReply]
  }
  
  @scala.inline
  implicit class EnumValuesAdminReplyMutableBuilder[Self <: EnumValuesAdminReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AdminReply): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
