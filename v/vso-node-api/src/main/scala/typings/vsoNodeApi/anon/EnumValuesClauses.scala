package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesClauses extends StObject {
  
  var enumValues: Clauses
}
object EnumValuesClauses {
  
  @scala.inline
  def apply(enumValues: Clauses): EnumValuesClauses = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesClauses]
  }
  
  @scala.inline
  implicit class EnumValuesClausesMutableBuilder[Self <: EnumValuesClauses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Clauses): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
