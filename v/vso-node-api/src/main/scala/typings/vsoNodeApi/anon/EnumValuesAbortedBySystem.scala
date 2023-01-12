package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAbortedBySystem extends StObject {
  
  var enumValues: AbortedBySystem
}
object EnumValuesAbortedBySystem {
  
  inline def apply(enumValues: AbortedBySystem): EnumValuesAbortedBySystem = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAbortedBySystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAbortedBySystem] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AbortedBySystem): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
