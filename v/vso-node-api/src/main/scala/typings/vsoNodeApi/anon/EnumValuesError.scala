package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesError extends StObject {
  
  var enumValues: Error = js.native
}
object EnumValuesError {
  
  @scala.inline
  def apply(enumValues: Error): EnumValuesError = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesError]
  }
  
  @scala.inline
  implicit class EnumValuesErrorMutableBuilder[Self <: EnumValuesError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Error): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
