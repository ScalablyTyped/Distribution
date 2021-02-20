package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesPreviousChange extends StObject {
  
  var enumValues: PreviousChange = js.native
}
object EnumValuesPreviousChange {
  
  @scala.inline
  def apply(enumValues: PreviousChange): EnumValuesPreviousChange = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPreviousChange]
  }
  
  @scala.inline
  implicit class EnumValuesPreviousChangeMutableBuilder[Self <: EnumValuesPreviousChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: PreviousChange): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
