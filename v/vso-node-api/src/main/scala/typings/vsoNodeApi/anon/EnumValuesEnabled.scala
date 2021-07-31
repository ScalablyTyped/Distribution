package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesEnabled extends StObject {
  
  var enumValues: Enabled
}
object EnumValuesEnabled {
  
  @scala.inline
  def apply(enumValues: Enabled): EnumValuesEnabled = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEnabled]
  }
  
  @scala.inline
  implicit class EnumValuesEnabledMutableBuilder[Self <: EnumValuesEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Enabled): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
