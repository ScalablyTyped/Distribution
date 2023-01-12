package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCopy extends StObject {
  
  var enumValues: Copy
}
object EnumValuesCopy {
  
  inline def apply(enumValues: Copy): EnumValuesCopy = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCopy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCopy] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Copy): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
