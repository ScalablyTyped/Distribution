package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesArea extends StObject {
  
  var enumValues: Area
}
object EnumValuesArea {
  
  inline def apply(enumValues: Area): EnumValuesArea = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesArea] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Area): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
