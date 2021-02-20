package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesNotSet extends StObject {
  
  var enumValues: NotSet = js.native
}
object EnumValuesNotSet {
  
  @scala.inline
  def apply(enumValues: NotSet): EnumValuesNotSet = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotSet]
  }
  
  @scala.inline
  implicit class EnumValuesNotSetMutableBuilder[Self <: EnumValuesNotSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: NotSet): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
