package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAscending extends StObject {
  
  var enumValues: Ascending = js.native
}
object EnumValuesAscending {
  
  @scala.inline
  def apply(enumValues: Ascending): EnumValuesAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAscending]
  }
  
  @scala.inline
  implicit class EnumValuesAscendingMutableBuilder[Self <: EnumValuesAscending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Ascending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
