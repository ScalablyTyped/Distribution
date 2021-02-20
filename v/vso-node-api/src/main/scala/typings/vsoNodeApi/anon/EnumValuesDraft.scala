package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDraft extends StObject {
  
  var enumValues: Draft = js.native
}
object EnumValuesDraft {
  
  @scala.inline
  def apply(enumValues: Draft): EnumValuesDraft = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDraft]
  }
  
  @scala.inline
  implicit class EnumValuesDraftMutableBuilder[Self <: EnumValuesDraft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Draft): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
