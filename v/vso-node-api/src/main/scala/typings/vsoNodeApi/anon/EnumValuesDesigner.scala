package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDesigner extends StObject {
  
  var enumValues: Designer
}
object EnumValuesDesigner {
  
  inline def apply(enumValues: Designer): EnumValuesDesigner = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDesigner]
  }
  
  extension [Self <: EnumValuesDesigner](x: Self) {
    
    inline def setEnumValues(value: Designer): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
