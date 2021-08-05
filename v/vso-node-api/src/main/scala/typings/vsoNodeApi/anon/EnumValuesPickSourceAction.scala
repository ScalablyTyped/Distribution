package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPickSourceAction extends StObject {
  
  var enumValues: PickSourceAction
}
object EnumValuesPickSourceAction {
  
  inline def apply(enumValues: PickSourceAction): EnumValuesPickSourceAction = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPickSourceAction]
  }
  
  extension [Self <: EnumValuesPickSourceAction](x: Self) {
    
    inline def setEnumValues(value: PickSourceAction): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
