package typings.wepy.anon

import typings.wepy.wepyStrings.`0`
import typings.wepy.wepyStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankAccount extends js.Object {
  
  var bankAccount: String = js.native
  
  var bankName: String = js.native
  
  var companyAddress: String = js.native
  
  var errMsg: String = js.native
  
  var taxNumber: String = js.native
  
  var telephone: String = js.native
  
  var title: String = js.native
  
  var `type`: `0` | `1` = js.native
}
object BankAccount {
  
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
  ): BankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccount]
  }
  
  @scala.inline
  implicit class BankAccountOps[Self <: BankAccount] (val x: Self) extends AnyVal {
    
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
