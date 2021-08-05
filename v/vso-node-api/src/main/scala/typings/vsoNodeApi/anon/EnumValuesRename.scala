package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRename extends StObject {
  
  var enumValues: Rename
}
object EnumValuesRename {
  
  inline def apply(enumValues: Rename): EnumValuesRename = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRename]
  }
  
  extension [Self <: EnumValuesRename](x: Self) {
    
    inline def setEnumValues(value: Rename): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
