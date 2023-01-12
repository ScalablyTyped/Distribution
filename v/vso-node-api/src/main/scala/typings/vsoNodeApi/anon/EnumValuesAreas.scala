package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAreas extends StObject {
  
  var enumValues: Areas
}
object EnumValuesAreas {
  
  inline def apply(enumValues: Areas): EnumValuesAreas = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAreas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesAreas] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Areas): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
