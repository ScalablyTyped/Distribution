package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDelete extends StObject {
  
  var enumValues: Delete
}
object EnumValuesDelete {
  
  inline def apply(enumValues: Delete): EnumValuesDelete = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesDelete] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Delete): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
