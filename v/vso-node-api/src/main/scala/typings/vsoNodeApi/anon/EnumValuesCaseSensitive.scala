package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCaseSensitive extends StObject {
  
  var enumValues: CaseSensitive
}
object EnumValuesCaseSensitive {
  
  inline def apply(enumValues: CaseSensitive): EnumValuesCaseSensitive = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCaseSensitive]
  }
  
  extension [Self <: EnumValuesCaseSensitive](x: Self) {
    
    inline def setEnumValues(value: CaseSensitive): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
