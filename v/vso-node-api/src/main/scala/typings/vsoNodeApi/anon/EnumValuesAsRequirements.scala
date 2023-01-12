package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAsRequirements extends StObject {
  
  var enumValues: AsRequirements
}
object EnumValuesAsRequirements {
  
  inline def apply(enumValues: AsRequirements): EnumValuesAsRequirements = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAsRequirements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAsRequirements] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AsRequirements): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
