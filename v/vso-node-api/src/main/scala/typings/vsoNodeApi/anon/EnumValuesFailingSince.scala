package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFailingSince extends StObject {
  
  var enumValues: FailingSince
}
object EnumValuesFailingSince {
  
  inline def apply(enumValues: FailingSince): EnumValuesFailingSince = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFailingSince]
  }
  
  extension [Self <: EnumValuesFailingSince](x: Self) {
    
    inline def setEnumValues(value: FailingSince): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
