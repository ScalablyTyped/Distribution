package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesInProgress_ extends StObject {
  
  var enumValues: InProgress_ = js.native
}
object EnumValuesInProgress_ {
  
  @scala.inline
  def apply(enumValues: InProgress_): EnumValuesInProgress_ = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInProgress_]
  }
  
  @scala.inline
  implicit class EnumValuesInProgress_MutableBuilder[Self <: EnumValuesInProgress_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: InProgress_): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
