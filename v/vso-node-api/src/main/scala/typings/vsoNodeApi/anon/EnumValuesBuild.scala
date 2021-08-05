package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBuild extends StObject {
  
  var enumValues: Build
}
object EnumValuesBuild {
  
  inline def apply(enumValues: Build): EnumValuesBuild = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBuild]
  }
  
  extension [Self <: EnumValuesBuild](x: Self) {
    
    inline def setEnumValues(value: Build): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
