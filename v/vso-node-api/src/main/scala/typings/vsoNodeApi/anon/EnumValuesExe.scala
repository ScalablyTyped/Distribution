package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesExe extends StObject {
  
  var enumValues: Exe
}
object EnumValuesExe {
  
  inline def apply(enumValues: Exe): EnumValuesExe = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExe]
  }
  
  extension [Self <: EnumValuesExe](x: Self) {
    
    inline def setEnumValues(value: Exe): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
