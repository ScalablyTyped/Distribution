package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCategory extends StObject {
  
  var enumValues: Category
}
object EnumValuesCategory {
  
  inline def apply(enumValues: Category): EnumValuesCategory = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCategory]
  }
  
  extension [Self <: EnumValuesCategory](x: Self) {
    
    inline def setEnumValues(value: Category): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
