package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesCreateBranchPermissionRequired extends StObject {
  
  var enumValues: CreateBranchPermissionRequired = js.native
}
object EnumValuesCreateBranchPermissionRequired {
  
  @scala.inline
  def apply(enumValues: CreateBranchPermissionRequired): EnumValuesCreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCreateBranchPermissionRequired]
  }
  
  @scala.inline
  implicit class EnumValuesCreateBranchPermissionRequiredMutableBuilder[Self <: EnumValuesCreateBranchPermissionRequired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: CreateBranchPermissionRequired): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
