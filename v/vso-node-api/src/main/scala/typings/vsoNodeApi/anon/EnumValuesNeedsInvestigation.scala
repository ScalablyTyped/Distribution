package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNeedsInvestigation extends StObject {
  
  var enumValues: NeedsInvestigation
}
object EnumValuesNeedsInvestigation {
  
  inline def apply(enumValues: NeedsInvestigation): EnumValuesNeedsInvestigation = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNeedsInvestigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesNeedsInvestigation] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: NeedsInvestigation): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
