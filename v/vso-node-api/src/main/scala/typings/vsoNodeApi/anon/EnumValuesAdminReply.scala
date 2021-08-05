package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAdminReply extends StObject {
  
  var enumValues: AdminReply
}
object EnumValuesAdminReply {
  
  inline def apply(enumValues: AdminReply): EnumValuesAdminReply = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdminReply]
  }
  
  extension [Self <: EnumValuesAdminReply](x: Self) {
    
    inline def setEnumValues(value: AdminReply): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
