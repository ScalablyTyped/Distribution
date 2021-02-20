package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBuy extends StObject {
  
  var enumValues: Buy = js.native
}
object EnumValuesBuy {
  
  @scala.inline
  def apply(enumValues: Buy): EnumValuesBuy = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBuy]
  }
  
  @scala.inline
  implicit class EnumValuesBuyMutableBuilder[Self <: EnumValuesBuy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Buy): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
