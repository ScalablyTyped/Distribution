package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Checkout.SessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCheckout extends StObject {
  
  val Session: TypeofSessionAfterExpiration
  
  val SessionCreateParams: TypeofSessionCreateParamsAfterExpiration
  
  val SessionListParams: Any
  
  var SessionsResource: Instantiable0[typings.stripe.mod.Stripe.Checkout.SessionsResource]
}
object TypeofCheckout {
  
  inline def apply(
    Session: TypeofSessionAfterExpiration,
    SessionCreateParams: TypeofSessionCreateParamsAfterExpiration,
    SessionListParams: Any,
    SessionsResource: Instantiable0[SessionsResource]
  ): TypeofCheckout = {
    val __obj = js.Dynamic.literal(Session = Session.asInstanceOf[js.Any], SessionCreateParams = SessionCreateParams.asInstanceOf[js.Any], SessionListParams = SessionListParams.asInstanceOf[js.Any], SessionsResource = SessionsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCheckout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCheckout] (val x: Self) extends AnyVal {
    
    inline def setSession(value: TypeofSessionAfterExpiration): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionCreateParams(value: TypeofSessionCreateParamsAfterExpiration): Self = StObject.set(x, "SessionCreateParams", value.asInstanceOf[js.Any])
    
    inline def setSessionListParams(value: Any): Self = StObject.set(x, "SessionListParams", value.asInstanceOf[js.Any])
    
    inline def setSessionsResource(value: Instantiable0[SessionsResource]): Self = StObject.set(x, "SessionsResource", value.asInstanceOf[js.Any])
  }
}
