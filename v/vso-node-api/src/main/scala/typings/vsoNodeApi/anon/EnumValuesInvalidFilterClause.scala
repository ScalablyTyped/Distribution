package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesInvalidFilterClause extends StObject {
  
  var enumValues: InvalidFilterClause = js.native
}
object EnumValuesInvalidFilterClause {
  
  @scala.inline
  def apply(enumValues: InvalidFilterClause): EnumValuesInvalidFilterClause = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInvalidFilterClause]
  }
  
  @scala.inline
  implicit class EnumValuesInvalidFilterClauseMutableBuilder[Self <: EnumValuesInvalidFilterClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: InvalidFilterClause): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
