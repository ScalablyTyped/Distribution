package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesLocked extends StObject {
  
  var enumValues: Locked
}
object EnumValuesLocked {
  
  inline def apply(enumValues: Locked): EnumValuesLocked = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesLocked]
  }
  
  extension [Self <: EnumValuesLocked](x: Self) {
    
    inline def setEnumValues(value: Locked): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
