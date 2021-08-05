package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesMachines extends StObject {
  
  var enumValues: Machines
}
object EnumValuesMachines {
  
  inline def apply(enumValues: Machines): EnumValuesMachines = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesMachines]
  }
  
  extension [Self <: EnumValuesMachines](x: Self) {
    
    inline def setEnumValues(value: Machines): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
