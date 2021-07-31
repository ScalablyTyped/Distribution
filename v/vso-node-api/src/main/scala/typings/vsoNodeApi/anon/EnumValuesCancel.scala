package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCancel extends StObject {
  
  var enumValues: Cancel
}
object EnumValuesCancel {
  
  @scala.inline
  def apply(enumValues: Cancel): EnumValuesCancel = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCancel]
  }
  
  @scala.inline
  implicit class EnumValuesCancelMutableBuilder[Self <: EnumValuesCancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Cancel): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
