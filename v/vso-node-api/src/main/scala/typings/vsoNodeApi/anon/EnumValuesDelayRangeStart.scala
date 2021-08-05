package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDelayRangeStart extends StObject {
  
  var enumValues: DelayRangeStart
}
object EnumValuesDelayRangeStart {
  
  inline def apply(enumValues: DelayRangeStart): EnumValuesDelayRangeStart = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDelayRangeStart]
  }
  
  extension [Self <: EnumValuesDelayRangeStart](x: Self) {
    
    inline def setEnumValues(value: DelayRangeStart): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
