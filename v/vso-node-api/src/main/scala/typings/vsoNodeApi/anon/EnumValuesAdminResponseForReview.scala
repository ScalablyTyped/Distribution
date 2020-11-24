package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAdminResponseForReview extends js.Object {
  
  var enumValues: AdminResponseForReview = js.native
}
object EnumValuesAdminResponseForReview {
  
  @scala.inline
  def apply(enumValues: AdminResponseForReview): EnumValuesAdminResponseForReview = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdminResponseForReview]
  }
  
  @scala.inline
  implicit class EnumValuesAdminResponseForReviewOps[Self <: EnumValuesAdminResponseForReview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnumValues(value: AdminResponseForReview): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
}
