package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAlwaysInclude extends StObject {
  
  var enumValues: AlwaysInclude
}
object EnumValuesAlwaysInclude {
  
  inline def apply(enumValues: AlwaysInclude): EnumValuesAlwaysInclude = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAlwaysInclude]
  }
  
  extension [Self <: EnumValuesAlwaysInclude](x: Self) {
    
    inline def setEnumValues(value: AlwaysInclude): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
