package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesUndelete extends StObject {
  
  var enumValues: Undelete = js.native
}
object EnumValuesUndelete {
  
  @scala.inline
  def apply(enumValues: Undelete): EnumValuesUndelete = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesUndelete]
  }
  
  @scala.inline
  implicit class EnumValuesUndeleteMutableBuilder[Self <: EnumValuesUndelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Undelete): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
