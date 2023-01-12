package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCodeChange extends StObject {
  
  var enumValues: CodeChange
}
object EnumValuesCodeChange {
  
  inline def apply(enumValues: CodeChange): EnumValuesCodeChange = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCodeChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCodeChange] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: CodeChange): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
