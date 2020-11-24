package typings.strongholdPayJs.mod.global.Stronghold

import typings.strongholdPayJs.anon.Displaymessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tip extends js.Object {
  
  var amount: Double = js.native
  
  var beneficiary_name: String = js.native
  
  var charge_id: String = js.native
  
  var created_at: String = js.native
  
  var details: js.UndefOr[Displaymessage] = js.native
  
  var id: String = js.native
  
  var payment_source_id: String = js.native
}
object Tip {
  
  @scala.inline
  def apply(
    amount: Double,
    beneficiary_name: String,
    charge_id: String,
    created_at: String,
    id: String,
    payment_source_id: String
  ): Tip = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], beneficiary_name = beneficiary_name.asInstanceOf[js.Any], charge_id = charge_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payment_source_id = payment_source_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
  
  @scala.inline
  implicit class TipOps[Self <: Tip] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeneficiary_name(value: String): Self = this.set("beneficiary_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharge_id(value: String): Self = this.set("charge_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_source_id(value: String): Self = this.set("payment_source_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Displaymessage): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
}
