package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesIsOverlapping extends StObject {
  
  var enumValues: IsOverlapping = js.native
}
object EnumValuesIsOverlapping {
  
  @scala.inline
  def apply(enumValues: IsOverlapping): EnumValuesIsOverlapping = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIsOverlapping]
  }
  
  @scala.inline
  implicit class EnumValuesIsOverlappingMutableBuilder[Self <: EnumValuesIsOverlapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: IsOverlapping): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
