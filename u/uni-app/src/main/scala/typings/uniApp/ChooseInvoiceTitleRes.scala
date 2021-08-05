package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseInvoiceTitleRes extends StObject {
  
  /**
    * 银行账号
    */
  var bankAccount: js.UndefOr[String] = js.undefined
  
  /**
    * 银行名称
    */
  var bankName: js.UndefOr[String] = js.undefined
  
  /**
    * 单位地址
    */
  var companyAddress: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 抬头税号
    */
  var taxNumber: js.UndefOr[String] = js.undefined
  
  /**
    * 手机号码
    */
  var telephone: js.UndefOr[String] = js.undefined
  
  /**
    * 抬头名称
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * 抬头类型（0：单位，1：个人）
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ChooseInvoiceTitleRes {
  
  inline def apply(): ChooseInvoiceTitleRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseInvoiceTitleRes]
  }
  
  extension [Self <: ChooseInvoiceTitleRes](x: Self) {
    
    inline def setBankAccount(value: String): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    inline def setBankAccountUndefined: Self = StObject.set(x, "bankAccount", js.undefined)
    
    inline def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
    
    inline def setBankNameUndefined: Self = StObject.set(x, "bankName", js.undefined)
    
    inline def setCompanyAddress(value: String): Self = StObject.set(x, "companyAddress", value.asInstanceOf[js.Any])
    
    inline def setCompanyAddressUndefined: Self = StObject.set(x, "companyAddress", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setTaxNumber(value: String): Self = StObject.set(x, "taxNumber", value.asInstanceOf[js.Any])
    
    inline def setTaxNumberUndefined: Self = StObject.set(x, "taxNumber", js.undefined)
    
    inline def setTelephone(value: String): Self = StObject.set(x, "telephone", value.asInstanceOf[js.Any])
    
    inline def setTelephoneUndefined: Self = StObject.set(x, "telephone", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
