package typings.stripe.mod.paymentIntents

import typings.stripe.anon.Returnurl
import typings.stripe.stripeStrings.redirect_to_url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentIntentNextActionRedirectToUrl extends StObject {
  
  /**
    * Contains instructions for authenticating a payment by redirecting your customer to another page or application.
    */
  var redirect_to_url: Returnurl
  
  var `type`: redirect_to_url
}
object IPaymentIntentNextActionRedirectToUrl {
  
  @scala.inline
  def apply(redirect_to_url: Returnurl): IPaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("redirect_to_url")
    __obj.asInstanceOf[IPaymentIntentNextActionRedirectToUrl]
  }
  
  @scala.inline
  implicit class IPaymentIntentNextActionRedirectToUrlMutableBuilder[Self <: IPaymentIntentNextActionRedirectToUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirect_to_url(value: Returnurl): Self = StObject.set(x, "redirect_to_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: redirect_to_url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
