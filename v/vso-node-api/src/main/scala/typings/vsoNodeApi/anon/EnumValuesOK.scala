package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesOK extends StObject {
  
  var enumValues: OK
}
object EnumValuesOK {
  
  inline def apply(enumValues: OK): EnumValuesOK = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesOK]
  }
  
  extension [Self <: EnumValuesOK](x: Self) {
    
    inline def setEnumValues(value: OK): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
