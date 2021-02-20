package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesDefault extends StObject {
  
  var enumValues: Default = js.native
}
object EnumValuesDefault {
  
  @scala.inline
  def apply(enumValues: Default): EnumValuesDefault = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDefault]
  }
  
  @scala.inline
  implicit class EnumValuesDefaultMutableBuilder[Self <: EnumValuesDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Default): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
