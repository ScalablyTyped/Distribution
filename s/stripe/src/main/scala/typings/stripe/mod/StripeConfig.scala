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
  
  inline def apply(): StripeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeConfig]
  }
  
  extension [Self <: StripeConfig](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
    
    inline def setHttpAgentNull: Self = StObject.set(x, "httpAgent", null)
    
    inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
    
    inline def setMaxNetworkRetries(value: Double): Self = StObject.set(x, "maxNetworkRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxNetworkRetriesUndefined: Self = StObject.set(x, "maxNetworkRetries", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
