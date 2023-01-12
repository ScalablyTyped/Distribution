package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAutomatic extends StObject {
  
  var enumValues: Automatic
}
object EnumValuesAutomatic {
  
  inline def apply(enumValues: Automatic): EnumValuesAutomatic = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAutomatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAutomatic] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Automatic): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
