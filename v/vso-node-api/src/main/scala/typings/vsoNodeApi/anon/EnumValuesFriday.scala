package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFriday extends StObject {
  
  var enumValues: Friday = js.native
}
object EnumValuesFriday {
  
  @scala.inline
  def apply(enumValues: Friday): EnumValuesFriday = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFriday]
  }
  
  @scala.inline
  implicit class EnumValuesFridayMutableBuilder[Self <: EnumValuesFriday] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Friday): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
