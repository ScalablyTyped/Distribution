package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesValidated extends StObject {
  
  var enumValues: Validated = js.native
}
object EnumValuesValidated {
  
  @scala.inline
  def apply(enumValues: Validated): EnumValuesValidated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesValidated]
  }
  
  @scala.inline
  implicit class EnumValuesValidatedMutableBuilder[Self <: EnumValuesValidated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Validated): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
