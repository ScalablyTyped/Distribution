package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesGuid extends StObject {
  
  var enumValues: Guid = js.native
}
object EnumValuesGuid {
  
  @scala.inline
  def apply(enumValues: Guid): EnumValuesGuid = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesGuid]
  }
  
  @scala.inline
  implicit class EnumValuesGuidMutableBuilder[Self <: EnumValuesGuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Guid): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
