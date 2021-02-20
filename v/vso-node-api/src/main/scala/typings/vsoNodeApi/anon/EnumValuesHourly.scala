package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesHourly extends StObject {
  
  var enumValues: Hourly = js.native
}
object EnumValuesHourly {
  
  @scala.inline
  def apply(enumValues: Hourly): EnumValuesHourly = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesHourly]
  }
  
  @scala.inline
  implicit class EnumValuesHourlyMutableBuilder[Self <: EnumValuesHourly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Hourly): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
