package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDeferred extends StObject {
  
  var enumValues: Deferred
}
object EnumValuesDeferred {
  
  inline def apply(enumValues: Deferred): EnumValuesDeferred = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDeferred]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesDeferred] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Deferred): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
