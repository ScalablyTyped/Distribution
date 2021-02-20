package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesIdAscending extends StObject {
  
  var enumValues: IdAscending = js.native
}
object EnumValuesIdAscending {
  
  @scala.inline
  def apply(enumValues: IdAscending): EnumValuesIdAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIdAscending]
  }
  
  @scala.inline
  implicit class EnumValuesIdAscendingMutableBuilder[Self <: EnumValuesIdAscending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: IdAscending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
