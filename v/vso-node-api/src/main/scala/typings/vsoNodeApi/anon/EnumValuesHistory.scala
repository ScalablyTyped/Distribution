package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesHistory extends StObject {
  
  var enumValues: History
}
object EnumValuesHistory {
  
  @scala.inline
  def apply(enumValues: History): EnumValuesHistory = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesHistory]
  }
  
  @scala.inline
  implicit class EnumValuesHistoryMutableBuilder[Self <: EnumValuesHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: History): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
