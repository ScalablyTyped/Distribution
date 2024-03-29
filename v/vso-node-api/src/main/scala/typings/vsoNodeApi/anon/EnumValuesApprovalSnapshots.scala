package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesApprovalSnapshots extends StObject {
  
  var enumValues: ApprovalSnapshots
}
object EnumValuesApprovalSnapshots {
  
  inline def apply(enumValues: ApprovalSnapshots): EnumValuesApprovalSnapshots = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesApprovalSnapshots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesApprovalSnapshots] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: ApprovalSnapshots): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
