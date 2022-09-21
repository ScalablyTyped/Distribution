package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSupportPaymentRequest extends StObject {
  
  /**
    * Does Browser support Payment Request API
    */
  var browserSupportPaymentRequest: Boolean
  
  /**
    * Does this device have card to make payment
    */
  var canMakePaymentWithActiveCard: Boolean
}
object BrowserSupportPaymentRequest {
  
  inline def apply(browserSupportPaymentRequest: Boolean, canMakePaymentWithActiveCard: Boolean): BrowserSupportPaymentRequest = {
    val __obj = js.Dynamic.literal(browserSupportPaymentRequest = browserSupportPaymentRequest.asInstanceOf[js.Any], canMakePaymentWithActiveCard = canMakePaymentWithActiveCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserSupportPaymentRequest]
  }
  
  extension [Self <: BrowserSupportPaymentRequest](x: Self) {
    
    inline def setBrowserSupportPaymentRequest(value: Boolean): Self = StObject.set(x, "browserSupportPaymentRequest", value.asInstanceOf[js.Any])
    
    inline def setCanMakePaymentWithActiveCard(value: Boolean): Self = StObject.set(x, "canMakePaymentWithActiveCard", value.asInstanceOf[js.Any])
  }
}
