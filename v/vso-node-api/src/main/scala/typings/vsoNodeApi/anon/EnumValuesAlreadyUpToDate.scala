package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAlreadyUpToDate extends StObject {
  
  var enumValues: AlreadyUpToDate
}
object EnumValuesAlreadyUpToDate {
  
  inline def apply(enumValues: AlreadyUpToDate): EnumValuesAlreadyUpToDate = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAlreadyUpToDate]
  }
  
  extension [Self <: EnumValuesAlreadyUpToDate](x: Self) {
    
    inline def setEnumValues(value: AlreadyUpToDate): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
