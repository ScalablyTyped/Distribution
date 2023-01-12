package typings.tpdirect

import typings.tpdirect.anon.BaseResultMerchantReferenCard
import typings.tpdirect.anon.Countrycode
import typings.tpdirect.anon.Shape
import typings.tpdirect.anon.SupportedNetworks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamsungPay extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit]): Unit
  
  def setup(setting: Countrycode): Unit
  
  def setupPaymentRequest(paymentReqeuestData: SupportedNetworks): Unit
  
  def setupSamsungPayButton(element: String, setting: Shape): Unit
}
object SamsungPay {
  
  inline def apply(
    getPrime: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit] => Unit,
    setup: Countrycode => Unit,
    setupPaymentRequest: SupportedNetworks => Unit,
    setupSamsungPayButton: (String, Shape) => Unit
  ): SamsungPay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1(getPrime), setup = js.Any.fromFunction1(setup), setupPaymentRequest = js.Any.fromFunction1(setupPaymentRequest), setupSamsungPayButton = js.Any.fromFunction2(setupSamsungPayButton))
    __obj.asInstanceOf[SamsungPay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamsungPay] (val x: Self) extends AnyVal {
    
    inline def setGetPrime(value: js.Function1[/* result */ BaseResultMerchantReferenCard, Unit] => Unit): Self = StObject.set(x, "getPrime", js.Any.fromFunction1(value))
    
    inline def setSetup(value: Countrycode => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
    
    inline def setSetupPaymentRequest(value: SupportedNetworks => Unit): Self = StObject.set(x, "setupPaymentRequest", js.Any.fromFunction1(value))
    
    inline def setSetupSamsungPayButton(value: (String, Shape) => Unit): Self = StObject.set(x, "setupSamsungPayButton", js.Any.fromFunction2(value))
  }
}
