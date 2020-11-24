package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseInvoiceTitleRes extends js.Object {
  
  /**
    * 银行账号
    */
  var bankAccount: js.UndefOr[String] = js.native
  
  /**
    * 银行名称
    */
  var bankName: js.UndefOr[String] = js.native
  
  /**
    * 单位地址
    */
  var companyAddress: js.UndefOr[String] = js.native
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 抬头税号
    */
  var taxNumber: js.UndefOr[String] = js.native
  
  /**
    * 手机号码
    */
  var telephone: js.UndefOr[String] = js.native
  
  /**
    * 抬头名称
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * 抬头类型（0：单位，1：个人）
    */
  var `type`: js.UndefOr[String] = js.native
}
object ChooseInvoiceTitleRes {
  
  @scala.inline
  def apply(): ChooseInvoiceTitleRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseInvoiceTitleRes]
  }
  
  @scala.inline
  implicit class ChooseInvoiceTitleResOps[Self <: ChooseInvoiceTitleRes] (val x: Self) extends AnyVal {
    
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
    def deleteBankAccount: Self = this.set("bankAccount", js.undefined)
    
    @scala.inline
    def setBankName(value: String): Self = this.set("bankName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankName: Self = this.set("bankName", js.undefined)
    
    @scala.inline
    def setCompanyAddress(value: String): Self = this.set("companyAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyAddress: Self = this.set("companyAddress", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrMsg: Self = this.set("errMsg", js.undefined)
    
    @scala.inline
    def setTaxNumber(value: String): Self = this.set("taxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxNumber: Self = this.set("taxNumber", js.undefined)
    
    @scala.inline
    def setTelephone(value: String): Self = this.set("telephone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelephone: Self = this.set("telephone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
