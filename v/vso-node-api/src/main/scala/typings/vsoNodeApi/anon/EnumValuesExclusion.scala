package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesExclusion extends StObject {
  
  var enumValues: Exclusion
}
object EnumValuesExclusion {
  
  inline def apply(enumValues: Exclusion): EnumValuesExclusion = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExclusion]
  }
  
  extension [Self <: EnumValuesExclusion](x: Self) {
    
    inline def setEnumValues(value: Exclusion): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
