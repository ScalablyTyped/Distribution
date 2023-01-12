package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBacklogInError extends StObject {
  
  var enumValues: BacklogInError
}
object EnumValuesBacklogInError {
  
  inline def apply(enumValues: BacklogInError): EnumValuesBacklogInError = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBacklogInError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesBacklogInError] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: BacklogInError): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
