package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDaily extends StObject {
  
  var enumValues: Daily
}
object EnumValuesDaily {
  
  inline def apply(enumValues: Daily): EnumValuesDaily = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDaily]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesDaily] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Daily): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
