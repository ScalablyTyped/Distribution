package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCanceled extends StObject {
  
  var enumValues: Canceled
}
object EnumValuesCanceled {
  
  inline def apply(enumValues: Canceled): EnumValuesCanceled = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCanceled]
  }
  
  extension [Self <: EnumValuesCanceled](x: Self) {
    
    inline def setEnumValues(value: Canceled): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
