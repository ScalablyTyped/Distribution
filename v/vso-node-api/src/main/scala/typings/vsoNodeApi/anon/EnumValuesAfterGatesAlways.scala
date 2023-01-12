package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAfterGatesAlways extends StObject {
  
  var enumValues: AfterGatesAlways
}
object EnumValuesAfterGatesAlways {
  
  inline def apply(enumValues: AfterGatesAlways): EnumValuesAfterGatesAlways = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAfterGatesAlways]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAfterGatesAlways] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AfterGatesAlways): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
