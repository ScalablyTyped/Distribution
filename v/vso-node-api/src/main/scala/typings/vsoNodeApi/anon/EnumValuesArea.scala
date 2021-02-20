package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesArea extends StObject {
  
  var enumValues: Area = js.native
}
object EnumValuesArea {
  
  @scala.inline
  def apply(enumValues: Area): EnumValuesArea = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArea]
  }
  
  @scala.inline
  implicit class EnumValuesAreaMutableBuilder[Self <: EnumValuesArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Area): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
