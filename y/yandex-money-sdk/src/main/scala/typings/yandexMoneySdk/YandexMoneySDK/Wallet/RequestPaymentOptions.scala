package typings.yandexMoneySdk.YandexMoneySDK.Wallet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPaymentOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var amount: js.UndefOr[Double] = js.native
  
  var amount_due: js.UndefOr[Double] = js.native
  
  var codepro: js.UndefOr[Boolean] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var expire_period: js.UndefOr[Double] = js.native
  
  var hold_for_pickup: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var pattern_id: String = js.native
  
  var `phone-number`: js.UndefOr[String] = js.native
  
  var test_card: js.UndefOr[String] = js.native
  
  var test_payment: js.UndefOr[Boolean] = js.native
  
  var test_result: js.UndefOr[String] = js.native
  
  var to: js.UndefOr[String] = js.native
}
object RequestPaymentOptions {
  
  @scala.inline
  def apply(pattern_id: String): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal(pattern_id = pattern_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentOptions]
  }
  
  @scala.inline
  implicit class RequestPaymentOptionsOps[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
    
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
    def setPattern_id(value: String): Self = this.set("pattern_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setAmount_due(value: Double): Self = this.set("amount_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount_due: Self = this.set("amount_due", js.undefined)
    
    @scala.inline
    def setCodepro(value: Boolean): Self = this.set("codepro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodepro: Self = this.set("codepro", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setExpire_period(value: Double): Self = this.set("expire_period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpire_period: Self = this.set("expire_period", js.undefined)
    
    @scala.inline
    def setHold_for_pickup(value: Boolean): Self = this.set("hold_for_pickup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHold_for_pickup: Self = this.set("hold_for_pickup", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def `setPhone-number`(value: String): Self = this.set("phone-number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePhone-number`: Self = this.set("phone-number", js.undefined)
    
    @scala.inline
    def setTest_card(value: String): Self = this.set("test_card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest_card: Self = this.set("test_card", js.undefined)
    
    @scala.inline
    def setTest_payment(value: Boolean): Self = this.set("test_payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest_payment: Self = this.set("test_payment", js.undefined)
    
    @scala.inline
    def setTest_result(value: String): Self = this.set("test_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest_result: Self = this.set("test_result", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
