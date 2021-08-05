package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesInvalidFilterClause extends StObject {
  
  var enumValues: InvalidFilterClause
}
object EnumValuesInvalidFilterClause {
  
  inline def apply(enumValues: InvalidFilterClause): EnumValuesInvalidFilterClause = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInvalidFilterClause]
  }
  
  extension [Self <: EnumValuesInvalidFilterClause](x: Self) {
    
    inline def setEnumValues(value: InvalidFilterClause): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
