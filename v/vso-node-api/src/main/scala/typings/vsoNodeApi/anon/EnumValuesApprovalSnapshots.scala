package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesApprovalSnapshots extends StObject {
  
  var enumValues: ApprovalSnapshots = js.native
}
object EnumValuesApprovalSnapshots {
  
  @scala.inline
  def apply(enumValues: ApprovalSnapshots): EnumValuesApprovalSnapshots = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesApprovalSnapshots]
  }
  
  @scala.inline
  implicit class EnumValuesApprovalSnapshotsMutableBuilder[Self <: EnumValuesApprovalSnapshots] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: ApprovalSnapshots): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
