package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNotFound extends StObject {
  
  var enumValues: NotFound
}
object EnumValuesNotFound {
  
  inline def apply(enumValues: NotFound): EnumValuesNotFound = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotFound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesNotFound] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: NotFound): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
