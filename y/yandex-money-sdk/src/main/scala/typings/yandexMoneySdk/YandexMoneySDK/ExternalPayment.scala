package typings.yandexMoneySdk.YandexMoneySDK

import org.scalablytyped.runtime.StringDictionary
import typings.yandexMoneySdk.anon.Dictkey
import typings.yandexMoneySdk.anon.Moneysourcetoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExternalPayment {
  
  trait GetInstanceIdResult extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var instance_id: js.UndefOr[String] = js.undefined
    
    var status: String
  }
  object GetInstanceIdResult {
    
    inline def apply(status: String): GetInstanceIdResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceIdResult]
    }
    
    extension [Self <: GetInstanceIdResult](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
      
      inline def setInstance_idUndefined: Self = StObject.set(x, "instance_id", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessOptions extends StObject {
    
    var csc: js.UndefOr[String] = js.undefined
    
    var ext_auth_fail_uri: String
    
    // instance_id: string; // the method always overwrites this value
    var ext_auth_success_uri: String
    
    var money_source_token: js.UndefOr[String] = js.undefined
    
    var request_id: String
    
    var request_token: js.UndefOr[Boolean] = js.undefined
  }
  object ProcessOptions {
    
    inline def apply(ext_auth_fail_uri: String, ext_auth_success_uri: String, request_id: String): ProcessOptions = {
      val __obj = js.Dynamic.literal(ext_auth_fail_uri = ext_auth_fail_uri.asInstanceOf[js.Any], ext_auth_success_uri = ext_auth_success_uri.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessOptions]
    }
    
    extension [Self <: ProcessOptions](x: Self) {
      
      inline def setCsc(value: String): Self = StObject.set(x, "csc", value.asInstanceOf[js.Any])
      
      inline def setCscUndefined: Self = StObject.set(x, "csc", js.undefined)
      
      inline def setExt_auth_fail_uri(value: String): Self = StObject.set(x, "ext_auth_fail_uri", value.asInstanceOf[js.Any])
      
      inline def setExt_auth_success_uri(value: String): Self = StObject.set(x, "ext_auth_success_uri", value.asInstanceOf[js.Any])
      
      inline def setMoney_source_token(value: String): Self = StObject.set(x, "money_source_token", value.asInstanceOf[js.Any])
      
      inline def setMoney_source_tokenUndefined: Self = StObject.set(x, "money_source_token", js.undefined)
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setRequest_token(value: Boolean): Self = StObject.set(x, "request_token", value.asInstanceOf[js.Any])
      
      inline def setRequest_tokenUndefined: Self = StObject.set(x, "request_token", js.undefined)
    }
  }
  
  trait ProcessResult extends StObject {
    
    var acs_params: js.UndefOr[Dictkey] = js.undefined
    
    var acs_uri: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var invoice_id: js.UndefOr[String] = js.undefined
    
    var money_source: js.UndefOr[Moneysourcetoken] = js.undefined
    
    var next_retry: js.UndefOr[Double] = js.undefined
    
    var status: String
  }
  object ProcessResult {
    
    inline def apply(status: String): ProcessResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessResult]
    }
    
    extension [Self <: ProcessResult](x: Self) {
      
      inline def setAcs_params(value: Dictkey): Self = StObject.set(x, "acs_params", value.asInstanceOf[js.Any])
      
      inline def setAcs_paramsUndefined: Self = StObject.set(x, "acs_params", js.undefined)
      
      inline def setAcs_uri(value: String): Self = StObject.set(x, "acs_uri", value.asInstanceOf[js.Any])
      
      inline def setAcs_uriUndefined: Self = StObject.set(x, "acs_uri", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
      
      inline def setInvoice_idUndefined: Self = StObject.set(x, "invoice_id", js.undefined)
      
      inline def setMoney_source(value: Moneysourcetoken): Self = StObject.set(x, "money_source", value.asInstanceOf[js.Any])
      
      inline def setMoney_sourceUndefined: Self = StObject.set(x, "money_source", js.undefined)
      
      inline def setNext_retry(value: Double): Self = StObject.set(x, "next_retry", value.asInstanceOf[js.Any])
      
      inline def setNext_retryUndefined: Self = StObject.set(x, "next_retry", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var amount_due: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var pattern_id: String
    
    // instance_id: string; // the method always overwrites this value
    var to: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(pattern_id: String): RequestOptions = {
      val __obj = js.Dynamic.literal(pattern_id = pattern_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setAmount_due(value: Double): Self = StObject.set(x, "amount_due", value.asInstanceOf[js.Any])
      
      inline def setAmount_dueUndefined: Self = StObject.set(x, "amount_due", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPattern_id(value: String): Self = StObject.set(x, "pattern_id", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait RequestResult extends StObject {
    
    var contract_amount: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var request_id: js.UndefOr[String] = js.undefined
    
    var status: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object RequestResult {
    
    inline def apply(status: String): RequestResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    extension [Self <: RequestResult](x: Self) {
      
      inline def setContract_amount(value: Double): Self = StObject.set(x, "contract_amount", value.asInstanceOf[js.Any])
      
      inline def setContract_amountUndefined: Self = StObject.set(x, "contract_amount", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
