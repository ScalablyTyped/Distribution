package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFailingSince extends StObject {
  
  var enumValues: FailingSince
}
object EnumValuesFailingSince {
  
  inline def apply(enumValues: FailingSince): EnumValuesFailingSince = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFailingSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesFailingSince] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: FailingSince): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
