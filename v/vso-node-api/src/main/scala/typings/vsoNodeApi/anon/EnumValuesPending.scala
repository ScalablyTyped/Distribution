package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPending extends StObject {
  
  var enumValues: Pending
}
object EnumValuesPending {
  
  @scala.inline
  def apply(enumValues: Pending): EnumValuesPending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPending]
  }
  
  @scala.inline
  implicit class EnumValuesPendingMutableBuilder[Self <: EnumValuesPending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Pending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
