package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancel extends StObject {
  
  var enumValues: Cancel
}
object EnumValuesCancel {
  
  inline def apply(enumValues: Cancel): EnumValuesCancel = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancel]
  }
  
  extension [Self <: EnumValuesCancel](x: Self) {
    
    inline def setEnumValues(value: Cancel): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
