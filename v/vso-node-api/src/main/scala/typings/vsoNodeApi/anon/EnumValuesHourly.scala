package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesHourly extends StObject {
  
  var enumValues: Hourly
}
object EnumValuesHourly {
  
  inline def apply(enumValues: Hourly): EnumValuesHourly = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesHourly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesHourly] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Hourly): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
