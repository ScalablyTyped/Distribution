package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesBuiltIn extends StObject {
  
  var enumValues: BuiltIn = js.native
}
object EnumValuesBuiltIn {
  
  @scala.inline
  def apply(enumValues: BuiltIn): EnumValuesBuiltIn = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBuiltIn]
  }
  
  @scala.inline
  implicit class EnumValuesBuiltInMutableBuilder[Self <: EnumValuesBuiltIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: BuiltIn): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
