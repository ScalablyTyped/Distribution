package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIgnoreConstraints extends StObject {
  
  var enumValues: IgnoreConstraints
}
object EnumValuesIgnoreConstraints {
  
  inline def apply(enumValues: IgnoreConstraints): EnumValuesIgnoreConstraints = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIgnoreConstraints]
  }
  
  extension [Self <: EnumValuesIgnoreConstraints](x: Self) {
    
    inline def setEnumValues(value: IgnoreConstraints): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
