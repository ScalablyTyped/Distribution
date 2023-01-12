package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesHosted extends StObject {
  
  var enumValues: Hosted
}
object EnumValuesHosted {
  
  inline def apply(enumValues: Hosted): EnumValuesHosted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesHosted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesHosted] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Hosted): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
