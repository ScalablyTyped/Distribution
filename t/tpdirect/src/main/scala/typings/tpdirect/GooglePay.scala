package typings.tpdirect

import typings.tpdirect.anon.AllowPrepaidCards
import typings.tpdirect.anon.Color
import typings.tpdirect.anon.Msg
import typings.tpdirect.anon.PickBaseResultclientipcar
import typings.tpdirect.anon.PickBaseResultprime
import typings.tpdirect.anon.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePay extends StObject {
  
  /**
    * @description Use either TPDirect.googlePay.getPrime(callback) or TPDirect.googlePay.setupGooglePayButton({getPrimeCallback})
    */
  def getPrime(
    callback: js.Function3[
      /* err */ Msg, 
      /* prime */ PickBaseResultprime, 
      /* result */ PickBaseResultclientipcar, 
      Unit
    ]
  ): Unit
  
  def setupGooglePay(setting: AllowPrepaidCards): Unit
  
  def setupGooglePayButton(setting: Color): Unit
  
  def setupPaymentRequest(paymentReqeuestData: typings.tpdirect.anon.AllowedNetworks): Unit
  
  def setupTransactionPrice(transactionPrice: Price): Unit
}
object GooglePay {
  
  inline def apply(
    getPrime: js.Function3[
      /* err */ Msg, 
      /* prime */ PickBaseResultprime, 
      /* result */ PickBaseResultclientipcar, 
      Unit
    ] => Unit,
    setupGooglePay: AllowPrepaidCards => Unit,
    setupGooglePayButton: Color => Unit,
    setupPaymentRequest: typings.tpdirect.anon.AllowedNetworks => Unit,
    setupTransactionPrice: Price => Unit
  ): GooglePay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1(getPrime), setupGooglePay = js.Any.fromFunction1(setupGooglePay), setupGooglePayButton = js.Any.fromFunction1(setupGooglePayButton), setupPaymentRequest = js.Any.fromFunction1(setupPaymentRequest), setupTransactionPrice = js.Any.fromFunction1(setupTransactionPrice))
    __obj.asInstanceOf[GooglePay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePay] (val x: Self) extends AnyVal {
    
    inline def setGetPrime(
      value: js.Function3[
          /* err */ Msg, 
          /* prime */ PickBaseResultprime, 
          /* result */ PickBaseResultclientipcar, 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "getPrime", js.Any.fromFunction1(value))
    
    inline def setSetupGooglePay(value: AllowPrepaidCards => Unit): Self = StObject.set(x, "setupGooglePay", js.Any.fromFunction1(value))
    
    inline def setSetupGooglePayButton(value: Color => Unit): Self = StObject.set(x, "setupGooglePayButton", js.Any.fromFunction1(value))
    
    inline def setSetupPaymentRequest(value: typings.tpdirect.anon.AllowedNetworks => Unit): Self = StObject.set(x, "setupPaymentRequest", js.Any.fromFunction1(value))
    
    inline def setSetupTransactionPrice(value: Price => Unit): Self = StObject.set(x, "setupTransactionPrice", js.Any.fromFunction1(value))
  }
}
