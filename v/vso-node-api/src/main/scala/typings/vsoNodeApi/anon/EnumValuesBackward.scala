package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBackward extends StObject {
  
  var enumValues: Backward
}
object EnumValuesBackward {
  
  inline def apply(enumValues: Backward): EnumValuesBackward = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBackward]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesBackward] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Backward): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
