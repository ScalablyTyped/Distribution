package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCanOptOut extends StObject {
  
  var enumValues: CanOptOut
}
object EnumValuesCanOptOut {
  
  @scala.inline
  def apply(enumValues: CanOptOut): EnumValuesCanOptOut = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCanOptOut]
  }
  
  @scala.inline
  implicit class EnumValuesCanOptOutMutableBuilder[Self <: EnumValuesCanOptOut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CanOptOut): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
