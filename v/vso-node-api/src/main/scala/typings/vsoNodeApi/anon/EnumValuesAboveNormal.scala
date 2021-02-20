package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAboveNormal extends StObject {
  
  var enumValues: AboveNormal = js.native
}
object EnumValuesAboveNormal {
  
  @scala.inline
  def apply(enumValues: AboveNormal): EnumValuesAboveNormal = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAboveNormal]
  }
  
  @scala.inline
  implicit class EnumValuesAboveNormalMutableBuilder[Self <: EnumValuesAboveNormal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AboveNormal): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
