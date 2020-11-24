package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramNumbers.`0`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseInvoiceTitleSuccessCallbackResult extends js.Object {
  
  /** 银行账号 */
  var bankAccount: String = js.native
  
  /** 银行名称 */
  var bankName: String = js.native
  
  /** 单位地址 */
  var companyAddress: String = js.native
  
  /** 错误信息 */
  var errMsg: String = js.native
  
  /** 抬头税号 */
  var taxNumber: String = js.native
  
  /** 手机号码 */
  var telephone: String = js.native
  
  /** 抬头名称 */
  var title: String = js.native
  
  /** 抬头类型
    *
    * 可选值：
    * - 0: 单位;
    * - 1: 个人; */
  var `type`: `0` | `1` = js.native
}
object ChooseInvoiceTitleSuccessCallbackResult {
  
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: `0` | `1`
  ): ChooseInvoiceTitleSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceTitleSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseInvoiceTitleSuccessCallbackResultOps[Self <: ChooseInvoiceTitleSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setBankAccount(value: String): Self = this.set("bankAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankName(value: String): Self = this.set("bankName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyAddress(value: String): Self = this.set("companyAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxNumber(value: String): Self = this.set("taxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephone(value: String): Self = this.set("telephone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0` | `1`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
