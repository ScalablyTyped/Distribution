package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDisabledAsDuplicateOfDefault extends StObject {
  
  var enumValues: DisabledAsDuplicateOfDefault = js.native
}
object EnumValuesDisabledAsDuplicateOfDefault {
  
  @scala.inline
  def apply(enumValues: DisabledAsDuplicateOfDefault): EnumValuesDisabledAsDuplicateOfDefault = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDisabledAsDuplicateOfDefault]
  }
  
  @scala.inline
  implicit class EnumValuesDisabledAsDuplicateOfDefaultMutableBuilder[Self <: EnumValuesDisabledAsDuplicateOfDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: DisabledAsDuplicateOfDefault): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
