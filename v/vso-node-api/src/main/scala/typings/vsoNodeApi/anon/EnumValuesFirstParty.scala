package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFirstParty extends StObject {
  
  var enumValues: FirstParty
}
object EnumValuesFirstParty {
  
  inline def apply(enumValues: FirstParty): EnumValuesFirstParty = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFirstParty]
  }
  
  extension [Self <: EnumValuesFirstParty](x: Self) {
    
    inline def setEnumValues(value: FirstParty): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
