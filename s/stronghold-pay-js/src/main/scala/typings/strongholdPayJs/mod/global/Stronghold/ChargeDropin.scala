package typings.strongholdPayJs.mod.global.Stronghold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChargeDropin extends js.Object {
  
  /**
    * The amount to charge, specified in the smallest divisible currency unit. For example, number of cents of United States dollar.
    */
  var amount: Double = js.native
  
  var externalId: js.UndefOr[String] = js.native
  
  var paymentSourceId: String = js.native
}
object ChargeDropin {
  
  @scala.inline
  def apply(amount: Double, paymentSourceId: String): ChargeDropin = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeDropin]
  }
  
  @scala.inline
  implicit class ChargeDropinOps[Self <: ChargeDropin] (val x: Self) extends AnyVal {
    
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
    def setPaymentSourceId(value: String): Self = this.set("paymentSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
  }
}
