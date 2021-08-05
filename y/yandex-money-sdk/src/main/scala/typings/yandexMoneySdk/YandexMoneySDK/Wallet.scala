package typings.yandexMoneySdk.YandexMoneySDK

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.yandexMoneySdk.anon.Amount
import typings.yandexMoneySdk.anon.Article
import typings.yandexMoneySdk.anon.Available
import typings.yandexMoneySdk.anon.Cards
import typings.yandexMoneySdk.anon.Dictkey
import typings.yandexMoneySdk.anon.Panfragment
import typings.yandexMoneySdk.anon.Ts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wallet {
  
  trait AccountInfoResult extends StObject {
    
    var account: String
    
    var account_status: String
    
    var account_type: String
    
    var avatar: js.UndefOr[Ts] = js.undefined
    
    var balance: Double
    
    var balance_details: js.UndefOr[Available] = js.undefined
    
    var cards_linked: js.UndefOr[js.Array[Panfragment]] = js.undefined
    
    var currency: String
  }
  object AccountInfoResult {
    
    inline def apply(account: String, account_status: String, account_type: String, balance: Double, currency: String): AccountInfoResult = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], account_status = account_status.asInstanceOf[js.Any], account_type = account_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfoResult]
    }
    
    extension [Self <: AccountInfoResult](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccount_status(value: String): Self = StObject.set(x, "account_status", value.asInstanceOf[js.Any])
      
      inline def setAccount_type(value: String): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
      
      inline def setAvatar(value: Ts): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setBalance_details(value: Available): Self = StObject.set(x, "balance_details", value.asInstanceOf[js.Any])
      
      inline def setBalance_detailsUndefined: Self = StObject.set(x, "balance_details", js.undefined)
      
      inline def setCards_linked(value: js.Array[Panfragment]): Self = StObject.set(x, "cards_linked", value.asInstanceOf[js.Any])
      
      inline def setCards_linkedUndefined: Self = StObject.set(x, "cards_linked", js.undefined)
      
      inline def setCards_linkedVarargs(value: Panfragment*): Self = StObject.set(x, "cards_linked", js.Array(value :_*))
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAccessTokenResult extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
  }
  object GetAccessTokenResult {
    
    inline def apply(): GetAccessTokenResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAccessTokenResult]
    }
    
    extension [Self <: GetAccessTokenResult](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait IncomingTransferAcceptResult extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var ext_action_uri: js.UndefOr[String] = js.undefined
    
    var protection_code_attempts_available: js.UndefOr[Double] = js.undefined
    
    var status: String
  }
  object IncomingTransferAcceptResult {
    
    inline def apply(status: String): IncomingTransferAcceptResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingTransferAcceptResult]
    }
    
    extension [Self <: IncomingTransferAcceptResult](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExt_action_uri(value: String): Self = StObject.set(x, "ext_action_uri", value.asInstanceOf[js.Any])
      
      inline def setExt_action_uriUndefined: Self = StObject.set(x, "ext_action_uri", js.undefined)
      
      inline def setProtection_code_attempts_available(value: Double): Self = StObject.set(x, "protection_code_attempts_available", value.asInstanceOf[js.Any])
      
      inline def setProtection_code_attempts_availableUndefined: Self = StObject.set(x, "protection_code_attempts_available", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncomingTransferRejectResult extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var status: String
  }
  object IncomingTransferRejectResult {
    
    inline def apply(status: String): IncomingTransferRejectResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingTransferRejectResult]
    }
    
    extension [Self <: IncomingTransferRejectResult](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait OperationDetailsResult extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var amount_due: js.UndefOr[Double] = js.undefined
    
    var answer_datetime: js.UndefOr[String] = js.undefined
    
    var codepro: js.UndefOr[Boolean] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var datetime: js.UndefOr[String] = js.undefined
    
    var details: js.UndefOr[String] = js.undefined
    
    var digital_goods: js.UndefOr[Article] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[String] = js.undefined
    
    var fee: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var operation_id: js.UndefOr[String] = js.undefined
    
    var pattern_id: js.UndefOr[String] = js.undefined
    
    var protection_code: js.UndefOr[String] = js.undefined
    
    var recipient: js.UndefOr[String] = js.undefined
    
    var recipient_type: js.UndefOr[String] = js.undefined
    
    var sender: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OperationDetailsResult {
    
    inline def apply(): OperationDetailsResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDetailsResult]
    }
    
    extension [Self <: OperationDetailsResult](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setAmount_due(value: Double): Self = StObject.set(x, "amount_due", value.asInstanceOf[js.Any])
      
      inline def setAmount_dueUndefined: Self = StObject.set(x, "amount_due", js.undefined)
      
      inline def setAnswer_datetime(value: String): Self = StObject.set(x, "answer_datetime", value.asInstanceOf[js.Any])
      
      inline def setAnswer_datetimeUndefined: Self = StObject.set(x, "answer_datetime", js.undefined)
      
      inline def setCodepro(value: Boolean): Self = StObject.set(x, "codepro", value.asInstanceOf[js.Any])
      
      inline def setCodeproUndefined: Self = StObject.set(x, "codepro", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDigital_goods(value: Article): Self = StObject.set(x, "digital_goods", value.asInstanceOf[js.Any])
      
      inline def setDigital_goodsUndefined: Self = StObject.set(x, "digital_goods", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
      
      inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOperation_id(value: String): Self = StObject.set(x, "operation_id", value.asInstanceOf[js.Any])
      
      inline def setOperation_idUndefined: Self = StObject.set(x, "operation_id", js.undefined)
      
      inline def setPattern_id(value: String): Self = StObject.set(x, "pattern_id", value.asInstanceOf[js.Any])
      
      inline def setPattern_idUndefined: Self = StObject.set(x, "pattern_id", js.undefined)
      
      inline def setProtection_code(value: String): Self = StObject.set(x, "protection_code", value.asInstanceOf[js.Any])
      
      inline def setProtection_codeUndefined: Self = StObject.set(x, "protection_code", js.undefined)
      
      inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
      
      inline def setRecipient_type(value: String): Self = StObject.set(x, "recipient_type", value.asInstanceOf[js.Any])
      
      inline def setRecipient_typeUndefined: Self = StObject.set(x, "recipient_type", js.undefined)
      
      inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OperationHistoryOptions extends StObject {
    
    var details: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[String | Date] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var records: js.UndefOr[Double] = js.undefined
    
    var start_record: js.UndefOr[String] = js.undefined
    
    var till: js.UndefOr[String | Date] = js.undefined
    
    var `type`: String
  }
  object OperationHistoryOptions {
    
    inline def apply(`type`: String): OperationHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationHistoryOptions]
    }
    
    extension [Self <: OperationHistoryOptions](x: Self) {
      
      inline def setDetails(value: Boolean): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setFrom(value: String | Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRecords(value: Double): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
      
      inline def setStart_record(value: String): Self = StObject.set(x, "start_record", value.asInstanceOf[js.Any])
      
      inline def setStart_recordUndefined: Self = StObject.set(x, "start_record", js.undefined)
      
      inline def setTill(value: String | Date): Self = StObject.set(x, "till", value.asInstanceOf[js.Any])
      
      inline def setTillUndefined: Self = StObject.set(x, "till", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OperationHistoryResult extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var next_record: js.UndefOr[String] = js.undefined
    
    var operations: js.UndefOr[js.Array[Amount]] = js.undefined
  }
  object OperationHistoryResult {
    
    inline def apply(): OperationHistoryResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationHistoryResult]
    }
    
    extension [Self <: OperationHistoryResult](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext_record(value: String): Self = StObject.set(x, "next_record", value.asInstanceOf[js.Any])
      
      inline def setNext_recordUndefined: Self = StObject.set(x, "next_record", js.undefined)
      
      inline def setOperations(value: js.Array[Amount]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(value: Amount*): Self = StObject.set(x, "operations", js.Array(value :_*))
    }
  }
  
  trait ProcessPaymentOptions extends StObject {
    
    var csc: js.UndefOr[String] = js.undefined
    
    var ext_auth_fail_uri: js.UndefOr[String] = js.undefined
    
    var ext_auth_success_uri: js.UndefOr[String] = js.undefined
    
    var money_source: js.UndefOr[String] = js.undefined
    
    var request_id: String
    
    var test_card: js.UndefOr[String] = js.undefined
    
    var test_payment: js.UndefOr[Boolean] = js.undefined
    
    var test_result: js.UndefOr[String] = js.undefined
  }
  object ProcessPaymentOptions {
    
    inline def apply(request_id: String): ProcessPaymentOptions = {
      val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessPaymentOptions]
    }
    
    extension [Self <: ProcessPaymentOptions](x: Self) {
      
      inline def setCsc(value: String): Self = StObject.set(x, "csc", value.asInstanceOf[js.Any])
      
      inline def setCscUndefined: Self = StObject.set(x, "csc", js.undefined)
      
      inline def setExt_auth_fail_uri(value: String): Self = StObject.set(x, "ext_auth_fail_uri", value.asInstanceOf[js.Any])
      
      inline def setExt_auth_fail_uriUndefined: Self = StObject.set(x, "ext_auth_fail_uri", js.undefined)
      
      inline def setExt_auth_success_uri(value: String): Self = StObject.set(x, "ext_auth_success_uri", value.asInstanceOf[js.Any])
      
      inline def setExt_auth_success_uriUndefined: Self = StObject.set(x, "ext_auth_success_uri", js.undefined)
      
      inline def setMoney_source(value: String): Self = StObject.set(x, "money_source", value.asInstanceOf[js.Any])
      
      inline def setMoney_sourceUndefined: Self = StObject.set(x, "money_source", js.undefined)
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setTest_card(value: String): Self = StObject.set(x, "test_card", value.asInstanceOf[js.Any])
      
      inline def setTest_cardUndefined: Self = StObject.set(x, "test_card", js.undefined)
      
      inline def setTest_payment(value: Boolean): Self = StObject.set(x, "test_payment", value.asInstanceOf[js.Any])
      
      inline def setTest_paymentUndefined: Self = StObject.set(x, "test_payment", js.undefined)
      
      inline def setTest_result(value: String): Self = StObject.set(x, "test_result", value.asInstanceOf[js.Any])
      
      inline def setTest_resultUndefined: Self = StObject.set(x, "test_result", js.undefined)
    }
  }
  
  trait ProcessPaymentResult extends StObject {
    
    var account_unblock_uri: js.UndefOr[String] = js.undefined
    
    var acs_params: js.UndefOr[Dictkey] = js.undefined
    
    var acs_uri: js.UndefOr[String] = js.undefined
    
    var balance: js.UndefOr[Double] = js.undefined
    
    var credit_amount: js.UndefOr[Double] = js.undefined
    
    var digital_goods: js.UndefOr[Article] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var hold_for_pickup_link: js.UndefOr[String] = js.undefined
    
    var invoice_id: js.UndefOr[String] = js.undefined
    
    var next_retry: js.UndefOr[Double] = js.undefined
    
    var payee: js.UndefOr[String] = js.undefined
    
    var payer: js.UndefOr[String] = js.undefined
    
    var payment_id: js.UndefOr[String] = js.undefined
    
    var status: String
  }
  object ProcessPaymentResult {
    
    inline def apply(status: String): ProcessPaymentResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessPaymentResult]
    }
    
    extension [Self <: ProcessPaymentResult](x: Self) {
      
      inline def setAccount_unblock_uri(value: String): Self = StObject.set(x, "account_unblock_uri", value.asInstanceOf[js.Any])
      
      inline def setAccount_unblock_uriUndefined: Self = StObject.set(x, "account_unblock_uri", js.undefined)
      
      inline def setAcs_params(value: Dictkey): Self = StObject.set(x, "acs_params", value.asInstanceOf[js.Any])
      
      inline def setAcs_paramsUndefined: Self = StObject.set(x, "acs_params", js.undefined)
      
      inline def setAcs_uri(value: String): Self = StObject.set(x, "acs_uri", value.asInstanceOf[js.Any])
      
      inline def setAcs_uriUndefined: Self = StObject.set(x, "acs_uri", js.undefined)
      
      inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
      
      inline def setCredit_amount(value: Double): Self = StObject.set(x, "credit_amount", value.asInstanceOf[js.Any])
      
      inline def setCredit_amountUndefined: Self = StObject.set(x, "credit_amount", js.undefined)
      
      inline def setDigital_goods(value: Article): Self = StObject.set(x, "digital_goods", value.asInstanceOf[js.Any])
      
      inline def setDigital_goodsUndefined: Self = StObject.set(x, "digital_goods", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHold_for_pickup_link(value: String): Self = StObject.set(x, "hold_for_pickup_link", value.asInstanceOf[js.Any])
      
      inline def setHold_for_pickup_linkUndefined: Self = StObject.set(x, "hold_for_pickup_link", js.undefined)
      
      inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
      
      inline def setInvoice_idUndefined: Self = StObject.set(x, "invoice_id", js.undefined)
      
      inline def setNext_retry(value: Double): Self = StObject.set(x, "next_retry", value.asInstanceOf[js.Any])
      
      inline def setNext_retryUndefined: Self = StObject.set(x, "next_retry", js.undefined)
      
      inline def setPayee(value: String): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
      
      inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
      
      inline def setPayer(value: String): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
      
      inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
      
      inline def setPayment_id(value: String): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
      
      inline def setPayment_idUndefined: Self = StObject.set(x, "payment_id", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestPaymentOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var amount_due: js.UndefOr[Double] = js.undefined
    
    var codepro: js.UndefOr[Boolean] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var expire_period: js.UndefOr[Double] = js.undefined
    
    var hold_for_pickup: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var pattern_id: String
    
    var `phone-number`: js.UndefOr[String] = js.undefined
    
    var test_card: js.UndefOr[String] = js.undefined
    
    var test_payment: js.UndefOr[Boolean] = js.undefined
    
    var test_result: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object RequestPaymentOptions {
    
    inline def apply(pattern_id: String): RequestPaymentOptions = {
      val __obj = js.Dynamic.literal(pattern_id = pattern_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPaymentOptions]
    }
    
    extension [Self <: RequestPaymentOptions](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setAmount_due(value: Double): Self = StObject.set(x, "amount_due", value.asInstanceOf[js.Any])
      
      inline def setAmount_dueUndefined: Self = StObject.set(x, "amount_due", js.undefined)
      
      inline def setCodepro(value: Boolean): Self = StObject.set(x, "codepro", value.asInstanceOf[js.Any])
      
      inline def setCodeproUndefined: Self = StObject.set(x, "codepro", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setExpire_period(value: Double): Self = StObject.set(x, "expire_period", value.asInstanceOf[js.Any])
      
      inline def setExpire_periodUndefined: Self = StObject.set(x, "expire_period", js.undefined)
      
      inline def setHold_for_pickup(value: Boolean): Self = StObject.set(x, "hold_for_pickup", value.asInstanceOf[js.Any])
      
      inline def setHold_for_pickupUndefined: Self = StObject.set(x, "hold_for_pickup", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPattern_id(value: String): Self = StObject.set(x, "pattern_id", value.asInstanceOf[js.Any])
      
      inline def `setPhone-number`(value: String): Self = StObject.set(x, "phone-number", value.asInstanceOf[js.Any])
      
      inline def `setPhone-numberUndefined`: Self = StObject.set(x, "phone-number", js.undefined)
      
      inline def setTest_card(value: String): Self = StObject.set(x, "test_card", value.asInstanceOf[js.Any])
      
      inline def setTest_cardUndefined: Self = StObject.set(x, "test_card", js.undefined)
      
      inline def setTest_payment(value: Boolean): Self = StObject.set(x, "test_payment", value.asInstanceOf[js.Any])
      
      inline def setTest_paymentUndefined: Self = StObject.set(x, "test_payment", js.undefined)
      
      inline def setTest_result(value: String): Self = StObject.set(x, "test_result", value.asInstanceOf[js.Any])
      
      inline def setTest_resultUndefined: Self = StObject.set(x, "test_result", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait RequestPaymentResult extends StObject {
    
    var account_unblock_uri: js.UndefOr[String] = js.undefined
    
    var balance: js.UndefOr[Double] = js.undefined
    
    var contract_amount: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var ext_action_uri: js.UndefOr[String] = js.undefined
    
    var money_source: js.UndefOr[Cards] = js.undefined
    
    var protection_code: js.UndefOr[String] = js.undefined
    
    var recipient_account_status: js.UndefOr[String] = js.undefined
    
    var recipient_account_type: js.UndefOr[String] = js.undefined
    
    var request_id: js.UndefOr[String] = js.undefined
    
    var status: String
  }
  object RequestPaymentResult {
    
    inline def apply(status: String): RequestPaymentResult = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestPaymentResult]
    }
    
    extension [Self <: RequestPaymentResult](x: Self) {
      
      inline def setAccount_unblock_uri(value: String): Self = StObject.set(x, "account_unblock_uri", value.asInstanceOf[js.Any])
      
      inline def setAccount_unblock_uriUndefined: Self = StObject.set(x, "account_unblock_uri", js.undefined)
      
      inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
      
      inline def setContract_amount(value: Double): Self = StObject.set(x, "contract_amount", value.asInstanceOf[js.Any])
      
      inline def setContract_amountUndefined: Self = StObject.set(x, "contract_amount", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExt_action_uri(value: String): Self = StObject.set(x, "ext_action_uri", value.asInstanceOf[js.Any])
      
      inline def setExt_action_uriUndefined: Self = StObject.set(x, "ext_action_uri", js.undefined)
      
      inline def setMoney_source(value: Cards): Self = StObject.set(x, "money_source", value.asInstanceOf[js.Any])
      
      inline def setMoney_sourceUndefined: Self = StObject.set(x, "money_source", js.undefined)
      
      inline def setProtection_code(value: String): Self = StObject.set(x, "protection_code", value.asInstanceOf[js.Any])
      
      inline def setProtection_codeUndefined: Self = StObject.set(x, "protection_code", js.undefined)
      
      inline def setRecipient_account_status(value: String): Self = StObject.set(x, "recipient_account_status", value.asInstanceOf[js.Any])
      
      inline def setRecipient_account_statusUndefined: Self = StObject.set(x, "recipient_account_status", js.undefined)
      
      inline def setRecipient_account_type(value: String): Self = StObject.set(x, "recipient_account_type", value.asInstanceOf[js.Any])
      
      inline def setRecipient_account_typeUndefined: Self = StObject.set(x, "recipient_account_type", js.undefined)
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendAuthenticatedRequestParams extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var url: String
  }
  object SendAuthenticatedRequestParams {
    
    inline def apply(url: String): SendAuthenticatedRequestParams = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendAuthenticatedRequestParams]
    }
    
    extension [Self <: SendAuthenticatedRequestParams](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
