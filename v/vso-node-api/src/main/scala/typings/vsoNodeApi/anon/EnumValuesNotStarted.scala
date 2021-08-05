package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNotStarted extends StObject {
  
  var enumValues: NotStarted
}
object EnumValuesNotStarted {
  
  inline def apply(enumValues: NotStarted): EnumValuesNotStarted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotStarted]
  }
  
  extension [Self <: EnumValuesNotStarted](x: Self) {
    
    inline def setEnumValues(value: NotStarted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
