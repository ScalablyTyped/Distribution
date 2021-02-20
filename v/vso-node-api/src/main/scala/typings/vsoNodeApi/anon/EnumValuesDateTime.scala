package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDateTime extends StObject {
  
  var enumValues: DateTime = js.native
}
object EnumValuesDateTime {
  
  @scala.inline
  def apply(enumValues: DateTime): EnumValuesDateTime = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDateTime]
  }
  
  @scala.inline
  implicit class EnumValuesDateTimeMutableBuilder[Self <: EnumValuesDateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: DateTime): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
