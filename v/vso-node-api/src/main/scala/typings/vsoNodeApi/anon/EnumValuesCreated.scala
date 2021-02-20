package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCreated extends StObject {
  
  var enumValues: Created = js.native
}
object EnumValuesCreated {
  
  @scala.inline
  def apply(enumValues: Created): EnumValuesCreated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCreated]
  }
  
  @scala.inline
  implicit class EnumValuesCreatedMutableBuilder[Self <: EnumValuesCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Created): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
