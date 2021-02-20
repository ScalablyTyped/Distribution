package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAdded extends StObject {
  
  var enumValues: Added = js.native
}
object EnumValuesAdded {
  
  @scala.inline
  def apply(enumValues: Added): EnumValuesAdded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdded]
  }
  
  @scala.inline
  implicit class EnumValuesAddedMutableBuilder[Self <: EnumValuesAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Added): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
