package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesUndelete extends StObject {
  
  var enumValues: Undelete
}
object EnumValuesUndelete {
  
  inline def apply(enumValues: Undelete): EnumValuesUndelete = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesUndelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesUndelete] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Undelete): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
