package typings.stripe.anon

import typings.stripe.mod.Stripe.BillingPortal.ConfigurationsResource
import typings.stripe.mod.Stripe.BillingPortal.SessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurations extends StObject {
  
  var configurations: ConfigurationsResource
  
  var sessions: SessionsResource
}
object Configurations {
  
  inline def apply(configurations: ConfigurationsResource, sessions: SessionsResource): Configurations = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurations]
  }
  
  extension [Self <: Configurations](x: Self) {
    
    inline def setConfigurations(value: ConfigurationsResource): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setSessions(value: SessionsResource): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
  }
}
