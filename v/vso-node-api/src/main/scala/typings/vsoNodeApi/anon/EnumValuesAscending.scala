package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAscending extends StObject {
  
  var enumValues: Ascending
}
object EnumValuesAscending {
  
  inline def apply(enumValues: Ascending): EnumValuesAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAscending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAscending] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Ascending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
