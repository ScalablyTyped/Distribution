package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDateTime extends StObject {
  
  var enumValues: DateTime
}
object EnumValuesDateTime {
  
  inline def apply(enumValues: DateTime): EnumValuesDateTime = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDateTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesDateTime] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: DateTime): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
