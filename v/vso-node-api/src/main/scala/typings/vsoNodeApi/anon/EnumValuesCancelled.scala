package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancelled extends StObject {
  
  var enumValues: Cancelled
}
object EnumValuesCancelled {
  
  inline def apply(enumValues: Cancelled): EnumValuesCancelled = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancelled]
  }
  
  extension [Self <: EnumValuesCancelled](x: Self) {
    
    inline def setEnumValues(value: Cancelled): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
