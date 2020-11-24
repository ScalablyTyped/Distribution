package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardholderBusinessEntity extends js.Object {
  
  /**
    * Whether the company’s business ID number was provided.
    */
  var tax_id_provided: js.UndefOr[Boolean] = js.native
}
object ICardholderBusinessEntity {
  
  @scala.inline
  def apply(): ICardholderBusinessEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardholderBusinessEntity]
  }
  
  @scala.inline
  implicit class ICardholderBusinessEntityOps[Self <: ICardholderBusinessEntity] (val x: Self) extends AnyVal {
    
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
    def setTax_id_provided(value: Boolean): Self = this.set("tax_id_provided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_id_provided: Self = this.set("tax_id_provided", js.undefined)
  }
}
