package typings.stripe.mod

import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeConfig extends StObject {
  
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var httpAgent: js.UndefOr[Agent | Null] = js.undefined
  
  var maxNetworkRetries: js.UndefOr[Double] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var telemetry: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object StripeConfig {
  
  @scala.inline
  def apply(): StripeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeConfig]
  }
  
  @scala.inline
  implicit class StripeConfigMutableBuilder[Self <: StripeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpAgentNull: Self = StObject.set(x, "httpAgent", null)
    
    @scala.inline
    def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
    
    @scala.inline
    def setMaxNetworkRetries(value: Double): Self = StObject.set(x, "maxNetworkRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNetworkRetriesUndefined: Self = StObject.set(x, "maxNetworkRetries", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
