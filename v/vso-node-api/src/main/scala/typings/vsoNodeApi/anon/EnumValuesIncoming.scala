package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesIncoming extends StObject {
  
  var enumValues: Incoming
}
object EnumValuesIncoming {
  
  @scala.inline
  def apply(enumValues: Incoming): EnumValuesIncoming = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIncoming]
  }
  
  @scala.inline
  implicit class EnumValuesIncomingMutableBuilder[Self <: EnumValuesIncoming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Incoming): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
