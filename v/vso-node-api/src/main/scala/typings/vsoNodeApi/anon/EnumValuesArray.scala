package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesArray extends StObject {
  
  var enumValues: Array
}
object EnumValuesArray {
  
  inline def apply(enumValues: Array): EnumValuesArray = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesArray] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Array): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
