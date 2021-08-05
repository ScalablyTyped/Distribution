package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesTestPlan extends StObject {
  
  var enumValues: TestPlan
}
object EnumValuesTestPlan {
  
  inline def apply(enumValues: TestPlan): EnumValuesTestPlan = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesTestPlan]
  }
  
  extension [Self <: EnumValuesTestPlan](x: Self) {
    
    inline def setEnumValues(value: TestPlan): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
