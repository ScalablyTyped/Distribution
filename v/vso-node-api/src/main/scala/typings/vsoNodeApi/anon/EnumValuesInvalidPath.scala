package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesInvalidPath extends StObject {
  
  var enumValues: InvalidPath
}
object EnumValuesInvalidPath {
  
  inline def apply(enumValues: InvalidPath): EnumValuesInvalidPath = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInvalidPath]
  }
  
  extension [Self <: EnumValuesInvalidPath](x: Self) {
    
    inline def setEnumValues(value: InvalidPath): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
