package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesInprogress extends StObject {
  
  var enumValues: Inprogress
}
object EnumValuesInprogress {
  
  inline def apply(enumValues: Inprogress): EnumValuesInprogress = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInprogress]
  }
  
  extension [Self <: EnumValuesInprogress](x: Self) {
    
    inline def setEnumValues(value: Inprogress): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
