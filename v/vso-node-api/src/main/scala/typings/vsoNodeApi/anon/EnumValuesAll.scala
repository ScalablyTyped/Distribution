package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAll extends StObject {
  
  var enumValues: All
}
object EnumValuesAll {
  
  inline def apply(enumValues: All): EnumValuesAll = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAll] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: All): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
