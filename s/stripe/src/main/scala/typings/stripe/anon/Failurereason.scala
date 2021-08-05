package typings.stripe.anon

import typings.stripe.stripeStrings.declined
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.not_required
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.processing_error
import typings.stripe.stripeStrings.succeeded
import typings.stripe.stripeStrings.user_abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failurereason extends StObject {
  
  var failure_reason: js.UndefOr[user_abort | declined | processing_error] = js.undefined
  
  var return_url: String
  
  var status: pending | succeeded | not_required | failed
  
  var url: String
}
object Failurereason {
  
  inline def apply(return_url: String, status: pending | succeeded | not_required | failed, url: String): Failurereason = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failurereason]
  }
  
  extension [Self <: Failurereason](x: Self) {
    
    inline def setFailure_reason(value: user_abort | declined | processing_error): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
    
    inline def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
    
    inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: pending | succeeded | not_required | failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
