package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCreated extends StObject {
  
  var enumValues: Created
}
object EnumValuesCreated {
  
  inline def apply(enumValues: Created): EnumValuesCreated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCreated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCreated] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Created): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
