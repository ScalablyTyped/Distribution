package typings.twilsock.mod

import typings.loglevel.mod.LogLevelDesc
import typings.std.Record
import typings.twilsock.anon.ErsUrl
import typings.twilsock.anon.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptionsType extends StObject {
  
  var Twilsock: js.UndefOr[Uri] = js.undefined
  
  var channel: js.UndefOr[TwilsockChannel] = js.undefined
  
  var clientMetadata: Record[String, Any]
  
  var continuationToken: js.UndefOr[String | Null] = js.undefined
  
  var initRegistrations: js.UndefOr[js.Array[InitRegistration] | Null] = js.undefined
  
  var logLevel: js.UndefOr[LogLevelDesc] = js.undefined
  
  var notifications: js.UndefOr[ErsUrl] = js.undefined
  
  var productId: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var registrations: js.UndefOr[Registrations] = js.undefined
  
  var retryPolicy: js.UndefOr[RetryPolicyType] = js.undefined
  
  var transport: js.UndefOr[Transport] = js.undefined
  
  var tweaks: (Record[String, Any]) | Null
  
  var twilsock: js.UndefOr[Uri] = js.undefined
  
  var twilsockClient: js.UndefOr[TwilsockClient] = js.undefined
}
object ClientOptionsType {
  
  inline def apply(clientMetadata: Record[String, Any]): ClientOptionsType = {
    val __obj = js.Dynamic.literal(clientMetadata = clientMetadata.asInstanceOf[js.Any], tweaks = null)
    __obj.asInstanceOf[ClientOptionsType]
  }
  
  extension [Self <: ClientOptionsType](x: Self) {
    
    inline def setChannel(value: TwilsockChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setClientMetadata(value: Record[String, Any]): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenNull: Self = StObject.set(x, "continuationToken", null)
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    inline def setInitRegistrations(value: js.Array[InitRegistration]): Self = StObject.set(x, "initRegistrations", value.asInstanceOf[js.Any])
    
    inline def setInitRegistrationsNull: Self = StObject.set(x, "initRegistrations", null)
    
    inline def setInitRegistrationsUndefined: Self = StObject.set(x, "initRegistrations", js.undefined)
    
    inline def setInitRegistrationsVarargs(value: InitRegistration*): Self = StObject.set(x, "initRegistrations", js.Array(value*))
    
    inline def setLogLevel(value: LogLevelDesc): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setNotifications(value: ErsUrl): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRegistrations(value: Registrations): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsUndefined: Self = StObject.set(x, "registrations", js.undefined)
    
    inline def setRetryPolicy(value: RetryPolicyType): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setTweaks(value: Record[String, Any]): Self = StObject.set(x, "tweaks", value.asInstanceOf[js.Any])
    
    inline def setTweaksNull: Self = StObject.set(x, "tweaks", null)
    
    inline def setTwilsock(value: Uri): Self = StObject.set(x, "Twilsock", value.asInstanceOf[js.Any])
    
    inline def setTwilsockClient(value: TwilsockClient): Self = StObject.set(x, "twilsockClient", value.asInstanceOf[js.Any])
    
    inline def setTwilsockClientUndefined: Self = StObject.set(x, "twilsockClient", js.undefined)
    
    inline def setTwilsockUndefined: Self = StObject.set(x, "Twilsock", js.undefined)
  }
}
