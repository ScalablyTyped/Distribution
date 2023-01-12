package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIdAscending extends StObject {
  
  var enumValues: IdAscending
}
object EnumValuesIdAscending {
  
  inline def apply(enumValues: IdAscending): EnumValuesIdAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIdAscending]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesIdAscending] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: IdAscending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
