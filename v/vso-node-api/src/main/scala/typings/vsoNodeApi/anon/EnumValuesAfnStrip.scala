package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAfnStrip extends StObject {
  
  var enumValues: AfnStrip
}
object EnumValuesAfnStrip {
  
  inline def apply(enumValues: AfnStrip): EnumValuesAfnStrip = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAfnStrip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAfnStrip] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: AfnStrip): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
