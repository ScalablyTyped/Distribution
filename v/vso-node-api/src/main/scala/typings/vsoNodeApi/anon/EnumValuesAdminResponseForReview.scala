package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAdminResponseForReview extends StObject {
  
  var enumValues: AdminResponseForReview
}
object EnumValuesAdminResponseForReview {
  
  inline def apply(enumValues: AdminResponseForReview): EnumValuesAdminResponseForReview = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdminResponseForReview]
  }
  
  extension [Self <: EnumValuesAdminResponseForReview](x: Self) {
    
    inline def setEnumValues(value: AdminResponseForReview): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
