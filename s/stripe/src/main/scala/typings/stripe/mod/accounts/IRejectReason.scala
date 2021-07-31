package typings.stripe.mod.accounts

import typings.stripe.stripeStrings.fraud
import typings.stripe.stripeStrings.other
import typings.stripe.stripeStrings.terms_of_service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRejectReason extends StObject {
  
  /**
    * The reason for rejecting the account. May be one of "fraud",
    * "terms_of_service", or "other".
    */
  var reason: fraud | terms_of_service | other
}
object IRejectReason {
  
  @scala.inline
  def apply(reason: fraud | terms_of_service | other): IRejectReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRejectReason]
  }
  
  @scala.inline
  implicit class IRejectReasonMutableBuilder[Self <: IRejectReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: fraud | terms_of_service | other): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
