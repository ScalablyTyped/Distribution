package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFlat extends StObject {
  
  var enumValues: Flat = js.native
}
object EnumValuesFlat {
  
  @scala.inline
  def apply(enumValues: Flat): EnumValuesFlat = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFlat]
  }
  
  @scala.inline
  implicit class EnumValuesFlatMutableBuilder[Self <: EnumValuesFlat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Flat): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
