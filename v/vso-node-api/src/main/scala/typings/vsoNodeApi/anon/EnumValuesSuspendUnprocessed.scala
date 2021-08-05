package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesSuspendUnprocessed extends StObject {
  
  var enumValues: SuspendUnprocessed
}
object EnumValuesSuspendUnprocessed {
  
  inline def apply(enumValues: SuspendUnprocessed): EnumValuesSuspendUnprocessed = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesSuspendUnprocessed]
  }
  
  extension [Self <: EnumValuesSuspendUnprocessed](x: Self) {
    
    inline def setEnumValues(value: SuspendUnprocessed): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
