package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAbusive extends StObject {
  
  var enumValues: Abusive
}
object EnumValuesAbusive {
  
  inline def apply(enumValues: Abusive): EnumValuesAbusive = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAbusive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAbusive] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Abusive): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
