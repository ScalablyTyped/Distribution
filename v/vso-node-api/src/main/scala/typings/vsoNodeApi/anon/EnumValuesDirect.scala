package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDirect extends StObject {
  
  var enumValues: Direct
}
object EnumValuesDirect {
  
  inline def apply(enumValues: Direct): EnumValuesDirect = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDirect]
  }
  
  extension [Self <: EnumValuesDirect](x: Self) {
    
    inline def setEnumValues(value: Direct): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
