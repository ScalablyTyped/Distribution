package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCreateBranchPermissionRequired extends StObject {
  
  var enumValues: CreateBranchPermissionRequired
}
object EnumValuesCreateBranchPermissionRequired {
  
  inline def apply(enumValues: CreateBranchPermissionRequired): EnumValuesCreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCreateBranchPermissionRequired]
  }
  
  extension [Self <: EnumValuesCreateBranchPermissionRequired](x: Self) {
    
    inline def setEnumValues(value: CreateBranchPermissionRequired): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
