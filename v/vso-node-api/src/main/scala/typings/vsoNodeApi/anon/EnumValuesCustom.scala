package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCustom extends StObject {
  
  var enumValues: Custom
}
object EnumValuesCustom {
  
  inline def apply(enumValues: Custom): EnumValuesCustom = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCustom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCustom] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Custom): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
