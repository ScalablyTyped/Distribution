package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Terminal.ConfigurationsResource
import typings.stripe.mod.Stripe.Terminal.ConnectionTokensResource
import typings.stripe.mod.Stripe.Terminal.LocationsResource
import typings.stripe.mod.Stripe.Terminal.ReadersResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTerminal extends StObject {
  
  val Configuration: TypeofConfigurationTipping
  
  val ConfigurationCreateParams: TypeofConfigurationCreateTipping
  
  val ConfigurationUpdateParams: TypeofConfigurationUpdateTipping
  
  var ConfigurationsResource: Instantiable0[typings.stripe.mod.Stripe.Terminal.ConfigurationsResource]
  
  var ConnectionTokensResource: Instantiable0[typings.stripe.mod.Stripe.Terminal.ConnectionTokensResource]
  
  val LocationCreateParams: Any
  
  var LocationsResource: Instantiable0[typings.stripe.mod.Stripe.Terminal.LocationsResource]
  
  val Reader: TypeofReader
  
  val ReaderListParams: Any
  
  val ReaderProcessPaymentIntentParams: TypeofReaderProcessPaymen
  
  val ReaderSetReaderDisplayParams: TypeofReaderSetReaderDisp
  
  var ReadersResource: Instantiable0[typings.stripe.mod.Stripe.Terminal.ReadersResource]
}
object TypeofTerminal {
  
  inline def apply(
    Configuration: TypeofConfigurationTipping,
    ConfigurationCreateParams: TypeofConfigurationCreateTipping,
    ConfigurationUpdateParams: TypeofConfigurationUpdateTipping,
    ConfigurationsResource: Instantiable0[ConfigurationsResource],
    ConnectionTokensResource: Instantiable0[ConnectionTokensResource],
    LocationCreateParams: Any,
    LocationsResource: Instantiable0[LocationsResource],
    Reader: TypeofReader,
    ReaderListParams: Any,
    ReaderProcessPaymentIntentParams: TypeofReaderProcessPaymen,
    ReaderSetReaderDisplayParams: TypeofReaderSetReaderDisp,
    ReadersResource: Instantiable0[ReadersResource]
  ): TypeofTerminal = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ConfigurationCreateParams = ConfigurationCreateParams.asInstanceOf[js.Any], ConfigurationUpdateParams = ConfigurationUpdateParams.asInstanceOf[js.Any], ConfigurationsResource = ConfigurationsResource.asInstanceOf[js.Any], ConnectionTokensResource = ConnectionTokensResource.asInstanceOf[js.Any], LocationCreateParams = LocationCreateParams.asInstanceOf[js.Any], LocationsResource = LocationsResource.asInstanceOf[js.Any], Reader = Reader.asInstanceOf[js.Any], ReaderListParams = ReaderListParams.asInstanceOf[js.Any], ReaderProcessPaymentIntentParams = ReaderProcessPaymentIntentParams.asInstanceOf[js.Any], ReaderSetReaderDisplayParams = ReaderSetReaderDisplayParams.asInstanceOf[js.Any], ReadersResource = ReadersResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTerminal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTerminal] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: TypeofConfigurationTipping): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationCreateParams(value: TypeofConfigurationCreateTipping): Self = StObject.set(x, "ConfigurationCreateParams", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUpdateParams(value: TypeofConfigurationUpdateTipping): Self = StObject.set(x, "ConfigurationUpdateParams", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsResource(value: Instantiable0[ConfigurationsResource]): Self = StObject.set(x, "ConfigurationsResource", value.asInstanceOf[js.Any])
    
    inline def setConnectionTokensResource(value: Instantiable0[ConnectionTokensResource]): Self = StObject.set(x, "ConnectionTokensResource", value.asInstanceOf[js.Any])
    
    inline def setLocationCreateParams(value: Any): Self = StObject.set(x, "LocationCreateParams", value.asInstanceOf[js.Any])
    
    inline def setLocationsResource(value: Instantiable0[LocationsResource]): Self = StObject.set(x, "LocationsResource", value.asInstanceOf[js.Any])
    
    inline def setReader(value: TypeofReader): Self = StObject.set(x, "Reader", value.asInstanceOf[js.Any])
    
    inline def setReaderListParams(value: Any): Self = StObject.set(x, "ReaderListParams", value.asInstanceOf[js.Any])
    
    inline def setReaderProcessPaymentIntentParams(value: TypeofReaderProcessPaymen): Self = StObject.set(x, "ReaderProcessPaymentIntentParams", value.asInstanceOf[js.Any])
    
    inline def setReaderSetReaderDisplayParams(value: TypeofReaderSetReaderDisp): Self = StObject.set(x, "ReaderSetReaderDisplayParams", value.asInstanceOf[js.Any])
    
    inline def setReadersResource(value: Instantiable0[ReadersResource]): Self = StObject.set(x, "ReadersResource", value.asInstanceOf[js.Any])
  }
}
