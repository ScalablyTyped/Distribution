package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesPreviousChange extends StObject {
  
  var enumValues: PreviousChange
}
object EnumValuesPreviousChange {
  
  inline def apply(enumValues: PreviousChange): EnumValuesPreviousChange = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPreviousChange]
  }
  
  extension [Self <: EnumValuesPreviousChange](x: Self) {
    
    inline def setEnumValues(value: PreviousChange): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
