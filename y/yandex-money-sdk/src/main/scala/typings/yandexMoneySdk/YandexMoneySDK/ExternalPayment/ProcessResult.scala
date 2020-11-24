package typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import typings.yandexMoneySdk.anon.Dictkey
import typings.yandexMoneySdk.anon.Moneysourcetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessResult extends js.Object {
  
  var acs_params: js.UndefOr[Dictkey] = js.native
  
  var acs_uri: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var invoice_id: js.UndefOr[String] = js.native
  
  var money_source: js.UndefOr[Moneysourcetoken] = js.native
  
  var next_retry: js.UndefOr[Double] = js.native
  
  var status: String = js.native
}
object ProcessResult {
  
  @scala.inline
  def apply(status: String): ProcessResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessResult]
  }
  
  @scala.inline
  implicit class ProcessResultOps[Self <: ProcessResult] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcs_params(value: Dictkey): Self = this.set("acs_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcs_params: Self = this.set("acs_params", js.undefined)
    
    @scala.inline
    def setAcs_uri(value: String): Self = this.set("acs_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcs_uri: Self = this.set("acs_uri", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInvoice_id(value: String): Self = this.set("invoice_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoice_id: Self = this.set("invoice_id", js.undefined)
    
    @scala.inline
    def setMoney_source(value: Moneysourcetoken): Self = this.set("money_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoney_source: Self = this.set("money_source", js.undefined)
    
    @scala.inline
    def setNext_retry(value: Double): Self = this.set("next_retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_retry: Self = this.set("next_retry", js.undefined)
  }
}
