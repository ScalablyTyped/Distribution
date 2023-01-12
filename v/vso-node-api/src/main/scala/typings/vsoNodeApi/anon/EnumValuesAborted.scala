package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAborted extends StObject {
  
  var enumValues: Aborted
}
object EnumValuesAborted {
  
  inline def apply(enumValues: Aborted): EnumValuesAborted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAborted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAborted] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Aborted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
