package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesRegex extends StObject {
  
  var enumValues: Regex = js.native
}
object EnumValuesRegex {
  
  @scala.inline
  def apply(enumValues: Regex): EnumValuesRegex = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRegex]
  }
  
  @scala.inline
  implicit class EnumValuesRegexMutableBuilder[Self <: EnumValuesRegex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Regex): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
