package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFirstParent extends StObject {
  
  var enumValues: FirstParent
}
object EnumValuesFirstParent {
  
  inline def apply(enumValues: FirstParent): EnumValuesFirstParent = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFirstParent]
  }
  
  extension [Self <: EnumValuesFirstParent](x: Self) {
    
    inline def setEnumValues(value: FirstParent): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
