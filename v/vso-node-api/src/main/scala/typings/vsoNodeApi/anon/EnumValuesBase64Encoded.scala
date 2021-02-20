package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBase64Encoded extends StObject {
  
  var enumValues: Base64Encoded = js.native
}
object EnumValuesBase64Encoded {
  
  @scala.inline
  def apply(enumValues: Base64Encoded): EnumValuesBase64Encoded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBase64Encoded]
  }
  
  @scala.inline
  implicit class EnumValuesBase64EncodedMutableBuilder[Self <: EnumValuesBase64Encoded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Base64Encoded): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
