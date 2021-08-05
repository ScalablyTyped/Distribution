package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDaily extends StObject {
  
  var enumValues: Daily
}
object EnumValuesDaily {
  
  inline def apply(enumValues: Daily): EnumValuesDaily = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDaily]
  }
  
  extension [Self <: EnumValuesDaily](x: Self) {
    
    inline def setEnumValues(value: Daily): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
