package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDefinitionNameAscending extends StObject {
  
  var enumValues: DefinitionNameAscending = js.native
}
object EnumValuesDefinitionNameAscending {
  
  @scala.inline
  def apply(enumValues: DefinitionNameAscending): EnumValuesDefinitionNameAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDefinitionNameAscending]
  }
  
  @scala.inline
  implicit class EnumValuesDefinitionNameAscendingMutableBuilder[Self <: EnumValuesDefinitionNameAscending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: DefinitionNameAscending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
