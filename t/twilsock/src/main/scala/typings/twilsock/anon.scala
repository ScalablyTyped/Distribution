package typings.twilsock

import typings.loglevel.mod.LogLevelDesc
import typings.std.Record
import typings.twilsock.mod.ContinuationTokenStatus
import typings.twilsock.mod.Headers
import typings.twilsock.mod.InitRegistration
import typings.twilsock.mod.MessageType
import typings.twilsock.mod.Registrations
import typings.twilsock.mod.Request
import typings.twilsock.mod.RetryPolicyType
import typings.twilsock.mod.StatusType
import typings.twilsock.mod.Transport
import typings.twilsock.mod.TwilsockChannel
import typings.twilsock.mod.TwilsockClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Backoffpolicy extends StObject {
    
    var backoff_policy: js.UndefOr[Reconnectmaxms] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
  }
  object Backoffpolicy {
    
    inline def apply(): Backoffpolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Backoffpolicy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Backoffpolicy] (val x: Self) extends AnyVal {
      
      inline def setBackoff_policy(value: Reconnectmaxms): Self = StObject.set(x, "backoff_policy", value.asInstanceOf[js.Any])
      
      inline def setBackoff_policyUndefined: Self = StObject.set(x, "backoff_policy", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  trait Capabilities extends StObject {
    
    var capabilities: js.Array[String]
    
    var continuation_token: String
    
    var continuation_token_status: js.UndefOr[ContinuationTokenStatus] = js.undefined
    
    var debug_info: String
    
    var http_headers: Headers
    
    var http_status: ErrorCode
    
    var init_registrations: String
    
    var offline_storage: String
  }
  object Capabilities {
    
    inline def apply(
      capabilities: js.Array[String],
      continuation_token: String,
      debug_info: String,
      http_headers: Headers,
      http_status: ErrorCode,
      init_registrations: String,
      offline_storage: String
    ): Capabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], continuation_token = continuation_token.asInstanceOf[js.Any], debug_info = debug_info.asInstanceOf[js.Any], http_headers = http_headers.asInstanceOf[js.Any], http_status = http_status.asInstanceOf[js.Any], init_registrations = init_registrations.asInstanceOf[js.Any], offline_storage = offline_storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setContinuation_token(value: String): Self = StObject.set(x, "continuation_token", value.asInstanceOf[js.Any])
      
      inline def setContinuation_token_status(value: ContinuationTokenStatus): Self = StObject.set(x, "continuation_token_status", value.asInstanceOf[js.Any])
      
      inline def setContinuation_token_statusUndefined: Self = StObject.set(x, "continuation_token_status", js.undefined)
      
      inline def setDebug_info(value: String): Self = StObject.set(x, "debug_info", value.asInstanceOf[js.Any])
      
      inline def setHttp_headers(value: Headers): Self = StObject.set(x, "http_headers", value.asInstanceOf[js.Any])
      
      inline def setHttp_status(value: ErrorCode): Self = StObject.set(x, "http_status", value.asInstanceOf[js.Any])
      
      inline def setInit_registrations(value: String): Self = StObject.set(x, "init_registrations", value.asInstanceOf[js.Any])
      
      inline def setOffline_storage(value: String): Self = StObject.set(x, "offline_storage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: Double
    
    var description: js.UndefOr[String] = js.undefined
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var status: String
  }
  object Code {
    
    inline def apply(code: Double, status: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorCode extends StObject {
    
    var code: Double
    
    var errorCode: js.UndefOr[String] = js.undefined
    
    var status: String
  }
  object ErrorCode {
    
    inline def apply(code: Double, status: String): ErrorCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorCode] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErsUrl extends StObject {
    
    var ersUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
  }
  object ErsUrl {
    
    inline def apply(): ErsUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErsUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErsUrl] (val x: Self) extends AnyVal {
      
      inline def setErsUrl(value: String): Self = StObject.set(x, "ersUrl", value.asInstanceOf[js.Any])
      
      inline def setErsUrlUndefined: Self = StObject.set(x, "ersUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  /* Inlined std.Partial<twilsock.twilsock.ClientOptionsType> */
  trait PartialClientOptionsType extends StObject {
    
    var Twilsock: js.UndefOr[Uri] = js.undefined
    
    var channel: js.UndefOr[TwilsockChannel] = js.undefined
    
    var clientMetadata: js.UndefOr[Record[String, Any]] = js.undefined
    
    var continuationToken: js.UndefOr[String | Null] = js.undefined
    
    var initRegistrations: js.UndefOr[js.Array[InitRegistration] | Null] = js.undefined
    
    var logLevel: js.UndefOr[LogLevelDesc] = js.undefined
    
    var notifications: js.UndefOr[ErsUrl] = js.undefined
    
    var productId: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var registrations: js.UndefOr[Registrations] = js.undefined
    
    var retryPolicy: js.UndefOr[RetryPolicyType] = js.undefined
    
    var transport: js.UndefOr[Transport] = js.undefined
    
    var tweaks: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
    
    var twilsock: js.UndefOr[Uri] = js.undefined
    
    var twilsockClient: js.UndefOr[TwilsockClient] = js.undefined
  }
  object PartialClientOptionsType {
    
    inline def apply(): PartialClientOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialClientOptionsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialClientOptionsType] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: TwilsockChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setClientMetadata(value: Record[String, Any]): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
      
      inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
      
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
      
      inline def setTweaksUndefined: Self = StObject.set(x, "tweaks", js.undefined)
      
      inline def setTwilsock(value: Uri): Self = StObject.set(x, "Twilsock", value.asInstanceOf[js.Any])
      
      inline def setTwilsockClient(value: TwilsockClient): Self = StObject.set(x, "twilsockClient", value.asInstanceOf[js.Any])
      
      inline def setTwilsockClientUndefined: Self = StObject.set(x, "twilsockClient", js.undefined)
      
      inline def setTwilsockUndefined: Self = StObject.set(x, "Twilsock", js.undefined)
    }
  }
  
  /* Inlined std.Partial<twilsock.twilsock.Header> */
  trait PartialHeader extends StObject {
    
    var active_grant: js.UndefOr[String] = js.undefined
    
    var capabilities: js.UndefOr[js.Array[String]] = js.undefined
    
    var client_update_type: js.UndefOr[String] = js.undefined
    
    var continuation_token: js.UndefOr[String | Null] = js.undefined
    
    var continuation_token_status: js.UndefOr[Record[String, Any]] = js.undefined
    
    var events: js.UndefOr[js.Array[Any]] = js.undefined
    
    var http_headers: js.UndefOr[Headers] = js.undefined
    
    var http_request: js.UndefOr[Request] = js.undefined
    
    var http_status: js.UndefOr[Record[String, Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var message_type: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[MessageType] = js.undefined
    
    var notification_ctx_id: js.UndefOr[String] = js.undefined
    
    var offline_storage: js.UndefOr[Record[String, Any]] = js.undefined
    
    var payload_size: js.UndefOr[Double] = js.undefined
    
    var payload_type: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[StatusType] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object PartialHeader {
    
    inline def apply(): PartialHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialHeader] (val x: Self) extends AnyVal {
      
      inline def setActive_grant(value: String): Self = StObject.set(x, "active_grant", value.asInstanceOf[js.Any])
      
      inline def setActive_grantUndefined: Self = StObject.set(x, "active_grant", js.undefined)
      
      inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setClient_update_type(value: String): Self = StObject.set(x, "client_update_type", value.asInstanceOf[js.Any])
      
      inline def setClient_update_typeUndefined: Self = StObject.set(x, "client_update_type", js.undefined)
      
      inline def setContinuation_token(value: String): Self = StObject.set(x, "continuation_token", value.asInstanceOf[js.Any])
      
      inline def setContinuation_tokenNull: Self = StObject.set(x, "continuation_token", null)
      
      inline def setContinuation_tokenUndefined: Self = StObject.set(x, "continuation_token", js.undefined)
      
      inline def setContinuation_token_status(value: Record[String, Any]): Self = StObject.set(x, "continuation_token_status", value.asInstanceOf[js.Any])
      
      inline def setContinuation_token_statusUndefined: Self = StObject.set(x, "continuation_token_status", js.undefined)
      
      inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setHttp_headers(value: Headers): Self = StObject.set(x, "http_headers", value.asInstanceOf[js.Any])
      
      inline def setHttp_headersUndefined: Self = StObject.set(x, "http_headers", js.undefined)
      
      inline def setHttp_request(value: Request): Self = StObject.set(x, "http_request", value.asInstanceOf[js.Any])
      
      inline def setHttp_requestUndefined: Self = StObject.set(x, "http_request", js.undefined)
      
      inline def setHttp_status(value: Record[String, Any]): Self = StObject.set(x, "http_status", value.asInstanceOf[js.Any])
      
      inline def setHttp_statusUndefined: Self = StObject.set(x, "http_status", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
      
      inline def setMessage_typeUndefined: Self = StObject.set(x, "message_type", js.undefined)
      
      inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNotification_ctx_id(value: String): Self = StObject.set(x, "notification_ctx_id", value.asInstanceOf[js.Any])
      
      inline def setNotification_ctx_idUndefined: Self = StObject.set(x, "notification_ctx_id", js.undefined)
      
      inline def setOffline_storage(value: Record[String, Any]): Self = StObject.set(x, "offline_storage", value.asInstanceOf[js.Any])
      
      inline def setOffline_storageUndefined: Self = StObject.set(x, "offline_storage", js.undefined)
      
      inline def setPayload_size(value: Double): Self = StObject.set(x, "payload_size", value.asInstanceOf[js.Any])
      
      inline def setPayload_sizeUndefined: Self = StObject.set(x, "payload_size", js.undefined)
      
      inline def setPayload_type(value: String): Self = StObject.set(x, "payload_type", value.asInstanceOf[js.Any])
      
      inline def setPayload_typeUndefined: Self = StObject.set(x, "payload_type", js.undefined)
      
      inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait Reconnectmaxms extends StObject {
    
    var reconnect_max_ms: Double
    
    var reconnect_min_ms: Double
  }
  object Reconnectmaxms {
    
    inline def apply(reconnect_max_ms: Double, reconnect_min_ms: Double): Reconnectmaxms = {
      val __obj = js.Dynamic.literal(reconnect_max_ms = reconnect_max_ms.asInstanceOf[js.Any], reconnect_min_ms = reconnect_min_ms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reconnectmaxms]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reconnectmaxms] (val x: Self) extends AnyVal {
      
      inline def setReconnect_max_ms(value: Double): Self = StObject.set(x, "reconnect_max_ms", value.asInstanceOf[js.Any])
      
      inline def setReconnect_min_ms(value: Double): Self = StObject.set(x, "reconnect_min_ms", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status extends StObject {
    
    var code: Double
    
    var status: String
  }
  object Status {
    
    inline def apply(code: Double, status: String): Status = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Uri extends StObject {
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Uri {
    
    inline def apply(): Uri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Uri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
