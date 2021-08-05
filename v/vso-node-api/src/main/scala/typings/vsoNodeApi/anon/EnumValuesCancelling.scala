package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancelling extends StObject {
  
  var enumValues: Cancelling
}
object EnumValuesCancelling {
  
  inline def apply(enumValues: Cancelling): EnumValuesCancelling = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancelling]
  }
  
  extension [Self <: EnumValuesCancelling](x: Self) {
    
    inline def setEnumValues(value: Cancelling): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
