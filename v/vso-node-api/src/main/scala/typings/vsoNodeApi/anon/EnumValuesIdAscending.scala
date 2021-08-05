package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIdAscending extends StObject {
  
  var enumValues: IdAscending
}
object EnumValuesIdAscending {
  
  inline def apply(enumValues: IdAscending): EnumValuesIdAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIdAscending]
  }
  
  extension [Self <: EnumValuesIdAscending](x: Self) {
    
    inline def setEnumValues(value: IdAscending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
