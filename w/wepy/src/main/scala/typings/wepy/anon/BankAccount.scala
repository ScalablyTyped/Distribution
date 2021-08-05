package typings.wepy.anon

import typings.wepy.wepyStrings.`0`
import typings.wepy.wepyStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankAccount extends StObject {
  
  var bankAccount: String
  
  var bankName: String
  
  var companyAddress: String
  
  var errMsg: String
  
  var taxNumber: String
  
  var telephone: String
  
  var title: String
  
  var `type`: `0` | `1`
}
object BankAccount {
  
  inline def apply(
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
  
  extension [Self <: BankAccount](x: Self) {
    
    inline def setBankAccount(value: String): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    inline def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
    
    inline def setCompanyAddress(value: String): Self = StObject.set(x, "companyAddress", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setTaxNumber(value: String): Self = StObject.set(x, "taxNumber", value.asInstanceOf[js.Any])
    
    inline def setTelephone(value: String): Self = StObject.set(x, "telephone", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0` | `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
