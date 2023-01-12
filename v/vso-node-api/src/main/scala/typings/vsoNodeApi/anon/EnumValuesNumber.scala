package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNumber extends StObject {
  
  var enumValues: Number
}
object EnumValuesNumber {
  
  inline def apply(enumValues: Number): EnumValuesNumber = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesNumber] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Number): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
