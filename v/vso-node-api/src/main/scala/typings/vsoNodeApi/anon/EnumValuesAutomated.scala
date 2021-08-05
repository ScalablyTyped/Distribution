package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAutomated extends StObject {
  
  var enumValues: Automated
}
object EnumValuesAutomated {
  
  inline def apply(enumValues: Automated): EnumValuesAutomated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutomated]
  }
  
  extension [Self <: EnumValuesAutomated](x: Self) {
    
    inline def setEnumValues(value: Automated): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
