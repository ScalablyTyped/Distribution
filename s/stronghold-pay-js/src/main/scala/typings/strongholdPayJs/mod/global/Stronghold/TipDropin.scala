package typings.strongholdPayJs.mod.global.Stronghold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TipDropin extends TipDataDropin {
  
  var chargeId: String = js.native
  
  var paymentSourceId: String = js.native
}
object TipDropin {
  
  @scala.inline
  def apply(amount: Double, beneficiaryName: String, chargeId: String, paymentSourceId: String): TipDropin = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], beneficiaryName = beneficiaryName.asInstanceOf[js.Any], chargeId = chargeId.asInstanceOf[js.Any], paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipDropin]
  }
  
  @scala.inline
  implicit class TipDropinOps[Self <: TipDropin] (val x: Self) extends AnyVal {
    
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
    def setChargeId(value: String): Self = this.set("chargeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentSourceId(value: String): Self = this.set("paymentSourceId", value.asInstanceOf[js.Any])
  }
}
