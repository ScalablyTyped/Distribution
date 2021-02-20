package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesRequired extends StObject {
  
  var enumValues: Required = js.native
}
object EnumValuesRequired {
  
  @scala.inline
  def apply(enumValues: Required): EnumValuesRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRequired]
  }
  
  @scala.inline
  implicit class EnumValuesRequiredMutableBuilder[Self <: EnumValuesRequired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Required): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
