package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesContainer extends StObject {
  
  var enumValues: Container
}
object EnumValuesContainer {
  
  inline def apply(enumValues: Container): EnumValuesContainer = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesContainer] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Container): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
