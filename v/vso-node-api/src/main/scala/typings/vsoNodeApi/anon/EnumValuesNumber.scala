package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesNumber extends StObject {
  
  var enumValues: Number = js.native
}
object EnumValuesNumber {
  
  @scala.inline
  def apply(enumValues: Number): EnumValuesNumber = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNumber]
  }
  
  @scala.inline
  implicit class EnumValuesNumberMutableBuilder[Self <: EnumValuesNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Number): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
