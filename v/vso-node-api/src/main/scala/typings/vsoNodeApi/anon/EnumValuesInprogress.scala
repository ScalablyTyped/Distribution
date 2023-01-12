package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesInprogress extends StObject {
  
  var enumValues: Inprogress
}
object EnumValuesInprogress {
  
  inline def apply(enumValues: Inprogress): EnumValuesInprogress = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInprogress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesInprogress] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Inprogress): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
