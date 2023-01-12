package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesInProgress_ extends StObject {
  
  var enumValues: InProgress_
}
object EnumValuesInProgress_ {
  
  inline def apply(enumValues: InProgress_): EnumValuesInProgress_ = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInProgress_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesInProgress_] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: InProgress_): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
