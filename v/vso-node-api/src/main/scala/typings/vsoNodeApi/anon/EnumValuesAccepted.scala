package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAccepted extends StObject {
  
  var enumValues: Accepted = js.native
}
object EnumValuesAccepted {
  
  @scala.inline
  def apply(enumValues: Accepted): EnumValuesAccepted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAccepted]
  }
  
  @scala.inline
  implicit class EnumValuesAcceptedMutableBuilder[Self <: EnumValuesAccepted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Accepted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
