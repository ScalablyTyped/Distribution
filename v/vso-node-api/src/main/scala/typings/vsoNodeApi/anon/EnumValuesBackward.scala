package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBackward extends StObject {
  
  var enumValues: Backward
}
object EnumValuesBackward {
  
  @scala.inline
  def apply(enumValues: Backward): EnumValuesBackward = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBackward]
  }
  
  @scala.inline
  implicit class EnumValuesBackwardMutableBuilder[Self <: EnumValuesBackward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Backward): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
