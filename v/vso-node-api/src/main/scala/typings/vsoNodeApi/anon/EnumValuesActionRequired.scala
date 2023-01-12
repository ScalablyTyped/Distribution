package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesActionRequired extends StObject {
  
  var enumValues: ActionRequired
}
object EnumValuesActionRequired {
  
  inline def apply(enumValues: ActionRequired): EnumValuesActionRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesActionRequired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesActionRequired] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: ActionRequired): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
