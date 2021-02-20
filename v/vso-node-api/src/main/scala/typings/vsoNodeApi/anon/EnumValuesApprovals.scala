package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesApprovals extends StObject {
  
  var enumValues: Approvals = js.native
}
object EnumValuesApprovals {
  
  @scala.inline
  def apply(enumValues: Approvals): EnumValuesApprovals = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesApprovals]
  }
  
  @scala.inline
  implicit class EnumValuesApprovalsMutableBuilder[Self <: EnumValuesApprovals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: Approvals): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
