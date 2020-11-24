package typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var amount: js.UndefOr[Double] = js.native
  
  var amount_due: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var pattern_id: String = js.native
  
  // instance_id: string; // the method always overwrites this value
  var to: js.UndefOr[String] = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(pattern_id: String): RequestOptions = {
    val __obj = js.Dynamic.literal(pattern_id = pattern_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
