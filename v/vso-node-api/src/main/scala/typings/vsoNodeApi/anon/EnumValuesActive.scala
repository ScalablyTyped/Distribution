package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesActive extends StObject {
  
  var enumValues: Active = js.native
}
object EnumValuesActive {
  
  @scala.inline
  def apply(enumValues: Active): EnumValuesActive = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesActive]
  }
  
  @scala.inline
  implicit class EnumValuesActiveMutableBuilder[Self <: EnumValuesActive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Active): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
