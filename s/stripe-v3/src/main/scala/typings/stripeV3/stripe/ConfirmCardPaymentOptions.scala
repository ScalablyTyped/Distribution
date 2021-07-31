package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmCardPaymentOptions extends StObject {
  
  /*
    * Set this to false if you want to handle next actions yourself, or if
    * you want to defer next action handling until later (e.g. for use in
    * the PaymentRequest API). Default is true.
    */
  var handleActions: js.UndefOr[Boolean] = js.undefined
}
object ConfirmCardPaymentOptions {
  
  @scala.inline
  def apply(): ConfirmCardPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardPaymentOptions]
  }
  
  @scala.inline
  implicit class ConfirmCardPaymentOptionsMutableBuilder[Self <: ConfirmCardPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleActions(value: Boolean): Self = StObject.set(x, "handleActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleActionsUndefined: Self = StObject.set(x, "handleActions", js.undefined)
  }
}
