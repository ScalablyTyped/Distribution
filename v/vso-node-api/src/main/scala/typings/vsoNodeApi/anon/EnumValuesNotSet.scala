package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNotSet extends StObject {
  
  var enumValues: NotSet
}
object EnumValuesNotSet {
  
  inline def apply(enumValues: NotSet): EnumValuesNotSet = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesNotSet] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: NotSet): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
