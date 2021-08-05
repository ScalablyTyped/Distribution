package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesClauses extends StObject {
  
  var enumValues: Clauses
}
object EnumValuesClauses {
  
  inline def apply(enumValues: Clauses): EnumValuesClauses = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesClauses]
  }
  
  extension [Self <: EnumValuesClauses](x: Self) {
    
    inline def setEnumValues(value: Clauses): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
