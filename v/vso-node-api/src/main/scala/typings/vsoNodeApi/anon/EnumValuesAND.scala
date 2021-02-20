package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAND extends StObject {
  
  var enumValues: AND = js.native
}
object EnumValuesAND {
  
  @scala.inline
  def apply(enumValues: AND): EnumValuesAND = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAND]
  }
  
  @scala.inline
  implicit class EnumValuesANDMutableBuilder[Self <: EnumValuesAND] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AND): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
