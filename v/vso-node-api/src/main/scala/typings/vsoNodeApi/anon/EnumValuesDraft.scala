package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDraft extends StObject {
  
  var enumValues: Draft
}
object EnumValuesDraft {
  
  inline def apply(enumValues: Draft): EnumValuesDraft = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDraft]
  }
  
  extension [Self <: EnumValuesDraft](x: Self) {
    
    inline def setEnumValues(value: Draft): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
