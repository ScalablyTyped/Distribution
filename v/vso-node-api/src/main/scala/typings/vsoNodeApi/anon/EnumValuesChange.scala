package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesChange extends StObject {
  
  var enumValues: Change
}
object EnumValuesChange {
  
  inline def apply(enumValues: Change): EnumValuesChange = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesChange]
  }
  
  extension [Self <: EnumValuesChange](x: Self) {
    
    inline def setEnumValues(value: Change): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
