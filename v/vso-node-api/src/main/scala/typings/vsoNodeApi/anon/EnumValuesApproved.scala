package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesApproved extends StObject {
  
  var enumValues: Approved = js.native
}
object EnumValuesApproved {
  
  @scala.inline
  def apply(enumValues: Approved): EnumValuesApproved = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesApproved]
  }
  
  @scala.inline
  implicit class EnumValuesApprovedMutableBuilder[Self <: EnumValuesApproved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Approved): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
