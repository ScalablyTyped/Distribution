package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDoing extends StObject {
  
  var enumValues: Doing = js.native
}
object EnumValuesDoing {
  
  @scala.inline
  def apply(enumValues: Doing): EnumValuesDoing = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDoing]
  }
  
  @scala.inline
  implicit class EnumValuesDoingMutableBuilder[Self <: EnumValuesDoing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Doing): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
