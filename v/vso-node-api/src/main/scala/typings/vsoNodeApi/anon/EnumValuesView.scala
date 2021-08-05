package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesView extends StObject {
  
  var enumValues: View
}
object EnumValuesView {
  
  inline def apply(enumValues: View): EnumValuesView = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesView]
  }
  
  extension [Self <: EnumValuesView](x: Self) {
    
    inline def setEnumValues(value: View): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
