package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFailed extends StObject {
  
  var enumValues: Failed
}
object EnumValuesFailed {
  
  inline def apply(enumValues: Failed): EnumValuesFailed = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFailed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesFailed] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Failed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
