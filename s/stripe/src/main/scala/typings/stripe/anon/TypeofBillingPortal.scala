package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.BillingPortal.ConfigurationsResource
import typings.stripe.mod.Stripe.BillingPortal.SessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBillingPortal extends StObject {
  
  val Configuration: TypeofConfiguration
  
  val ConfigurationCreateParams: TypeofConfigurationCreate
  
  val ConfigurationUpdateParams: TypeofConfigurationUpdate
  
  var ConfigurationsResource: Instantiable0[typings.stripe.mod.Stripe.BillingPortal.ConfigurationsResource]
  
  val Session: Any
  
  val SessionCreateParams: Any
  
  var SessionsResource: Instantiable0[typings.stripe.mod.Stripe.BillingPortal.SessionsResource]
}
object TypeofBillingPortal {
  
  inline def apply(
    Configuration: TypeofConfiguration,
    ConfigurationCreateParams: TypeofConfigurationCreate,
    ConfigurationUpdateParams: TypeofConfigurationUpdate,
    ConfigurationsResource: Instantiable0[ConfigurationsResource],
    Session: Any,
    SessionCreateParams: Any,
    SessionsResource: Instantiable0[SessionsResource]
  ): TypeofBillingPortal = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ConfigurationCreateParams = ConfigurationCreateParams.asInstanceOf[js.Any], ConfigurationUpdateParams = ConfigurationUpdateParams.asInstanceOf[js.Any], ConfigurationsResource = ConfigurationsResource.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SessionCreateParams = SessionCreateParams.asInstanceOf[js.Any], SessionsResource = SessionsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBillingPortal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBillingPortal] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: TypeofConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationCreateParams(value: TypeofConfigurationCreate): Self = StObject.set(x, "ConfigurationCreateParams", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUpdateParams(value: TypeofConfigurationUpdate): Self = StObject.set(x, "ConfigurationUpdateParams", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsResource(value: Instantiable0[ConfigurationsResource]): Self = StObject.set(x, "ConfigurationsResource", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Any): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionCreateParams(value: Any): Self = StObject.set(x, "SessionCreateParams", value.asInstanceOf[js.Any])
    
    inline def setSessionsResource(value: Instantiable0[SessionsResource]): Self = StObject.set(x, "SessionsResource", value.asInstanceOf[js.Any])
  }
}
