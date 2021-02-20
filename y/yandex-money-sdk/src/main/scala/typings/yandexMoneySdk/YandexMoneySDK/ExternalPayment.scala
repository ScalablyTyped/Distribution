package typings.yandexMoneySdk.YandexMoneySDK

import org.scalablytyped.runtime.StringDictionary
import typings.yandexMoneySdk.anon.Dictkey
import typings.yandexMoneySdk.anon.Moneysourcetoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExternalPayment {
  
  @js.native
  trait GetInstanceIdResult extends StObject {
    
    var error: js.UndefOr[String] = js.native
    
    var instance_id: js.UndefOr[String] = js.native
    
    var status: String = js.native
  }
  object GetInstanceIdResult {
    
    @scala.inline
    def apply(status: String): GetInstanceIdResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceIdResult]
    }
    
    @scala.inline
    implicit class GetInstanceIdResultMutableBuilder[Self <: GetInstanceIdResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInstance_id(value: String): Self = StObject.set(x, "instance_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance_idUndefined: Self = StObject.set(x, "instance_id", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessOptions extends StObject {
    
    var csc: js.UndefOr[String] = js.native
    
    var ext_auth_fail_uri: String = js.native
    
    // instance_id: string; // the method always overwrites this value
    var ext_auth_success_uri: String = js.native
    
    var money_source_token: js.UndefOr[String] = js.native
    
    var request_id: String = js.native
    
    var request_token: js.UndefOr[Boolean] = js.native
  }
  object ProcessOptions {
    
    @scala.inline
    def apply(ext_auth_fail_uri: String, ext_auth_success_uri: String, request_id: String): ProcessOptions = {
      val __obj = js.Dynamic.literal(ext_auth_fail_uri = ext_auth_fail_uri.asInstanceOf[js.Any], ext_auth_success_uri = ext_auth_success_uri.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessOptions]
    }
    
    @scala.inline
    implicit class ProcessOptionsMutableBuilder[Self <: ProcessOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsc(value: String): Self = StObject.set(x, "csc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscUndefined: Self = StObject.set(x, "csc", js.undefined)
      
      @scala.inline
      def setExt_auth_fail_uri(value: String): Self = StObject.set(x, "ext_auth_fail_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt_auth_success_uri(value: String): Self = StObject.set(x, "ext_auth_success_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoney_source_token(value: String): Self = StObject.set(x, "money_source_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoney_source_tokenUndefined: Self = StObject.set(x, "money_source_token", js.undefined)
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_token(value: Boolean): Self = StObject.set(x, "request_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_tokenUndefined: Self = StObject.set(x, "request_token", js.undefined)
    }
  }
  
  @js.native
  trait ProcessResult extends StObject {
    
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
    implicit class ProcessResultMutableBuilder[Self <: ProcessResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcs_params(value: Dictkey): Self = StObject.set(x, "acs_params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcs_paramsUndefined: Self = StObject.set(x, "acs_params", js.undefined)
      
      @scala.inline
      def setAcs_uri(value: String): Self = StObject.set(x, "acs_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcs_uriUndefined: Self = StObject.set(x, "acs_uri", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_idUndefined: Self = StObject.set(x, "invoice_id", js.undefined)
      
      @scala.inline
      def setMoney_source(value: Moneysourcetoken): Self = StObject.set(x, "money_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoney_sourceUndefined: Self = StObject.set(x, "money_source", js.undefined)
      
      @scala.inline
      def setNext_retry(value: Double): Self = StObject.set(x, "next_retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_retryUndefined: Self = StObject.set(x, "next_retry", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setAmount_due(value: Double): Self = StObject.set(x, "amount_due", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_dueUndefined: Self = StObject.set(x, "amount_due", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPattern_id(value: String): Self = StObject.set(x, "pattern_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait RequestResult extends StObject {
    
    var contract_amount: js.UndefOr[Double] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var request_id: js.UndefOr[String] = js.native
    
    var status: String = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object RequestResult {
    
    @scala.inline
    def apply(status: String): RequestResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    @scala.inline
    implicit class RequestResultMutableBuilder[Self <: RequestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContract_amount(value: Double): Self = StObject.set(x, "contract_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContract_amountUndefined: Self = StObject.set(x, "contract_amount", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
