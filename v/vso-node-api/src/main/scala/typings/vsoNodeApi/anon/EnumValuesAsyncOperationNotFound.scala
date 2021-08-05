package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAsyncOperationNotFound extends StObject {
  
  var enumValues: AsyncOperationNotFound
}
object EnumValuesAsyncOperationNotFound {
  
  inline def apply(enumValues: AsyncOperationNotFound): EnumValuesAsyncOperationNotFound = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAsyncOperationNotFound]
  }
  
  extension [Self <: EnumValuesAsyncOperationNotFound](x: Self) {
    
    inline def setEnumValues(value: AsyncOperationNotFound): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
