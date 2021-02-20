package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDaily extends StObject {
  
  var enumValues: Daily = js.native
}
object EnumValuesDaily {
  
  @scala.inline
  def apply(enumValues: Daily): EnumValuesDaily = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDaily]
  }
  
  @scala.inline
  implicit class EnumValuesDailyMutableBuilder[Self <: EnumValuesDaily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Daily): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
