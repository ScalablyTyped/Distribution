package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAdd extends StObject {
  
  var enumValues: Add = js.native
}
object EnumValuesAdd {
  
  @scala.inline
  def apply(enumValues: Add): EnumValuesAdd = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdd]
  }
  
  @scala.inline
  implicit class EnumValuesAddMutableBuilder[Self <: EnumValuesAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Add): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
