package typings.tpdirect

import typings.tpdirect.anon.BaseResultMerchantReferen
import typings.tpdirect.anon.BrowserSupportPaymentRequest
import typings.tpdirect.anon.CountryCode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestApi extends StObject {
  
  /**
    * ```markdown
    * `true` support payment request api
    * `false` doesn't support payment request api
    * ```
    */
  def checkAvailability(): Boolean
  
  def getPrime(callback: js.Function1[/* result */ BaseResultMerchantReferen, Unit]): Unit
  
  def setupApplePay(applePaySetting: CountryCode_): Unit
  
  def setupPaymentRequest(
    paymentRequestData: PaymentRequestData,
    callback: js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]
  ): Unit
}
object PaymentRequestApi {
  
  inline def apply(
    checkAvailability: () => Boolean,
    getPrime: js.Function1[/* result */ BaseResultMerchantReferen, Unit] => Unit,
    setupApplePay: CountryCode_ => Unit,
    setupPaymentRequest: (PaymentRequestData, js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]) => Unit
  ): PaymentRequestApi = {
    val __obj = js.Dynamic.literal(checkAvailability = js.Any.fromFunction0(checkAvailability), getPrime = js.Any.fromFunction1(getPrime), setupApplePay = js.Any.fromFunction1(setupApplePay), setupPaymentRequest = js.Any.fromFunction2(setupPaymentRequest))
    __obj.asInstanceOf[PaymentRequestApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentRequestApi] (val x: Self) extends AnyVal {
    
    inline def setCheckAvailability(value: () => Boolean): Self = StObject.set(x, "checkAvailability", js.Any.fromFunction0(value))
    
    inline def setGetPrime(value: js.Function1[/* result */ BaseResultMerchantReferen, Unit] => Unit): Self = StObject.set(x, "getPrime", js.Any.fromFunction1(value))
    
    inline def setSetupApplePay(value: CountryCode_ => Unit): Self = StObject.set(x, "setupApplePay", js.Any.fromFunction1(value))
    
    inline def setSetupPaymentRequest(value: (PaymentRequestData, js.Function1[/* result */ BrowserSupportPaymentRequest, Unit]) => Unit): Self = StObject.set(x, "setupPaymentRequest", js.Any.fromFunction2(value))
  }
}
