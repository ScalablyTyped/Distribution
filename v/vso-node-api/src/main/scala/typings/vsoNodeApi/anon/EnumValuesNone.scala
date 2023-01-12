package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNone extends StObject {
  
  var enumValues: None
}
object EnumValuesNone {
  
  inline def apply(enumValues: None): EnumValuesNone = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesNone] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: None): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
