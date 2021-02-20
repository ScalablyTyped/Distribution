package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesRejected extends StObject {
  
  var enumValues: Rejected = js.native
}
object EnumValuesRejected {
  
  @scala.inline
  def apply(enumValues: Rejected): EnumValuesRejected = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRejected]
  }
  
  @scala.inline
  implicit class EnumValuesRejectedMutableBuilder[Self <: EnumValuesRejected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Rejected): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
