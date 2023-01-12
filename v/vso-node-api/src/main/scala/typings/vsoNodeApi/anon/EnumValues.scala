package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValues extends StObject {
  
  var enumValues: Available
}
object EnumValues {
  
  inline def apply(enumValues: Available): EnumValues = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValues] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Available): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
