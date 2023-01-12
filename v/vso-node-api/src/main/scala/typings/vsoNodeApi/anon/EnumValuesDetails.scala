package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDetails extends StObject {
  
  var enumValues: Details
}
object EnumValuesDetails {
  
  inline def apply(enumValues: Details): EnumValuesDetails = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesDetails] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Details): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
