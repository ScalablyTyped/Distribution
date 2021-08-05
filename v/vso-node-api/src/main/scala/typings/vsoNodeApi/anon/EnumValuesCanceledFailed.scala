package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCanceledFailed extends StObject {
  
  var enumValues: CanceledFailed
}
object EnumValuesCanceledFailed {
  
  inline def apply(enumValues: CanceledFailed): EnumValuesCanceledFailed = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCanceledFailed]
  }
  
  extension [Self <: EnumValuesCanceledFailed](x: Self) {
    
    inline def setEnumValues(value: CanceledFailed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
