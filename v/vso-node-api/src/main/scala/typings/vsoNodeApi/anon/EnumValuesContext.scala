package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesContext extends StObject {
  
  var enumValues: Context
}
object EnumValuesContext {
  
  inline def apply(enumValues: Context): EnumValuesContext = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesContext] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Context): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
