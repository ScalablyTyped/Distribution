package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayAttributes extends StObject {
  
  /** action - Action URL */
  var action: js.UndefOr[String] = js.undefined
  
  /** bankAccountType - Bank account type for ach transactions. If set, payment method attribute must be provided and value should be set to ach-debit. defaults to consumer-checking */
  var bankAccountType: js.UndefOr[PayBankAccountType] = js.undefined
  
  /** chargeAmount - Amount to process. If value is greater than 0 then make the payment else create a payment token */
  var chargeAmount: js.UndefOr[String] = js.undefined
  
  /** currency - Currency of the amount attribute */
  var currency: js.UndefOr[String] = js.undefined
  
  /** description - Details regarding the payment */
  var description: js.UndefOr[String] = js.undefined
  
  /** input - Input type Twilio should accept */
  var input: js.UndefOr[PayInput] = js.undefined
  
  /** language - Language to use */
  var language: js.UndefOr[PayLanguage] = js.undefined
  
  /** maxAttempts - Maximum number of allowed retries when gathering input */
  var maxAttempts: js.UndefOr[Double] = js.undefined
  
  /** minPostalCodeLength - Prompt for minimum postal code length */
  var minPostalCodeLength: js.UndefOr[Double] = js.undefined
  
  /** paymentConnector - Unique name for payment connector */
  var paymentConnector: js.UndefOr[String] = js.undefined
  
  /** paymentMethod - Payment method to be used. defaults to credit-card */
  var paymentMethod: js.UndefOr[PayPaymentMethod] = js.undefined
  
  /** postalCode - Prompt for postal code and it should be true/false or default postal code */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /** securityCode - Prompt for security code */
  var securityCode: js.UndefOr[Boolean] = js.undefined
  
  /** statusCallback - Status callback URL */
  var statusCallback: js.UndefOr[String] = js.undefined
  
  /** statusCallbackMethod - Status callback method */
  var statusCallbackMethod: js.UndefOr[PayStatusCallbackMethod] = js.undefined
  
  /** timeout - Time to wait to gather input */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** tokenType - Type of token */
  var tokenType: js.UndefOr[PayTokenType] = js.undefined
  
  /** validCardTypes - Comma separated accepted card types */
  var validCardTypes: js.UndefOr[js.Array[PayValidCardTypes]] = js.undefined
}
object PayAttributes {
  
  inline def apply(): PayAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayAttributes] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBankAccountType(value: PayBankAccountType): Self = StObject.set(x, "bankAccountType", value.asInstanceOf[js.Any])
    
    inline def setBankAccountTypeUndefined: Self = StObject.set(x, "bankAccountType", js.undefined)
    
    inline def setChargeAmount(value: String): Self = StObject.set(x, "chargeAmount", value.asInstanceOf[js.Any])
    
    inline def setChargeAmountUndefined: Self = StObject.set(x, "chargeAmount", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInput(value: PayInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLanguage(value: PayLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    
    inline def setMinPostalCodeLength(value: Double): Self = StObject.set(x, "minPostalCodeLength", value.asInstanceOf[js.Any])
    
    inline def setMinPostalCodeLengthUndefined: Self = StObject.set(x, "minPostalCodeLength", js.undefined)
    
    inline def setPaymentConnector(value: String): Self = StObject.set(x, "paymentConnector", value.asInstanceOf[js.Any])
    
    inline def setPaymentConnectorUndefined: Self = StObject.set(x, "paymentConnector", js.undefined)
    
    inline def setPaymentMethod(value: PayPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setSecurityCode(value: Boolean): Self = StObject.set(x, "securityCode", value.asInstanceOf[js.Any])
    
    inline def setSecurityCodeUndefined: Self = StObject.set(x, "securityCode", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethod(value: PayStatusCallbackMethod): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTokenType(value: PayTokenType): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
    
    inline def setValidCardTypes(value: js.Array[PayValidCardTypes]): Self = StObject.set(x, "validCardTypes", value.asInstanceOf[js.Any])
    
    inline def setValidCardTypesUndefined: Self = StObject.set(x, "validCardTypes", js.undefined)
    
    inline def setValidCardTypesVarargs(value: PayValidCardTypes*): Self = StObject.set(x, "validCardTypes", js.Array(value*))
  }
}
