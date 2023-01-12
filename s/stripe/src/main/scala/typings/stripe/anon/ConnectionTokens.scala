package typings.stripe.anon

import typings.stripe.mod.Stripe.Terminal.ConfigurationsResource
import typings.stripe.mod.Stripe.Terminal.ConnectionTokensResource
import typings.stripe.mod.Stripe.Terminal.LocationsResource
import typings.stripe.mod.Stripe.Terminal.ReadersResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionTokens extends StObject {
  
  var configurations: ConfigurationsResource
  
  var connectionTokens: ConnectionTokensResource
  
  var locations: LocationsResource
  
  var readers: ReadersResource
}
object ConnectionTokens {
  
  inline def apply(
    configurations: ConfigurationsResource,
    connectionTokens: ConnectionTokensResource,
    locations: LocationsResource,
    readers: ReadersResource
  ): ConnectionTokens = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], connectionTokens = connectionTokens.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], readers = readers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionTokens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionTokens] (val x: Self) extends AnyVal {
    
    inline def setConfigurations(value: ConfigurationsResource): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConnectionTokens(value: ConnectionTokensResource): Self = StObject.set(x, "connectionTokens", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setReaders(value: ReadersResource): Self = StObject.set(x, "readers", value.asInstanceOf[js.Any])
  }
}
