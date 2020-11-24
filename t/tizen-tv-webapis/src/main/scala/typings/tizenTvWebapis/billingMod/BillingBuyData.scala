package typings.tizenTvWebapis.billingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingBuyData extends js.Object {
  
  /**
    * Payment information. It is same with paymentDetails param of buyItem.
    */
  var payDetail: String = js.native
  
  /**
    * Payment result
    */
  var payResult: String = js.native
}
object BillingBuyData {
  
  @scala.inline
  def apply(payDetail: String, payResult: String): BillingBuyData = {
    val __obj = js.Dynamic.literal(payDetail = payDetail.asInstanceOf[js.Any], payResult = payResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingBuyData]
  }
  
  @scala.inline
  implicit class BillingBuyDataOps[Self <: BillingBuyData] (val x: Self) extends AnyVal {
    
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
    def setPayDetail(value: String): Self = this.set("payDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayResult(value: String): Self = this.set("payResult", value.asInstanceOf[js.Any])
  }
}
