package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesImport extends StObject {
  
  var enumValues: Import
}
object EnumValuesImport {
  
  inline def apply(enumValues: Import): EnumValuesImport = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesImport]
  }
  
  extension [Self <: EnumValuesImport](x: Self) {
    
    inline def setEnumValues(value: Import): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
