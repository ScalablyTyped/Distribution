package typings.webPush

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpsMod.Agent
import typings.std.Error
import typings.webPush.anon.Auth
import typings.webPush.anon.Authorization
import typings.webPush.anon.AuthorizationCryptoKey
import typings.webPush.anon.CryptoKey
import typings.webPush.anon.PrivateKey
import typings.webPush.anon.RequestDetailsbodyBuffer
import typings.webPush.anon.RequestDetailsbodynull
import typings.webPush.webPushStrings.POST
import typings.webPush.webPushStrings.aes128gcm
import typings.webPush.webPushStrings.aesgcm
import typings.webPush.webPushStrings.aws128gcm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web-push", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("web-push", "WebPushError")
  @js.native
  open class WebPushError protected ()
    extends StObject
       with Error {
    def this(message: String, statusCode: Double, headers: Headers, body: String, endpoint: String) = this()
    
    val body: String = js.native
    
    val endpoint: String = js.native
    
    val headers: Headers = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val statusCode: Double = js.native
  }
  
  inline def encrypt(userPublicKey: String, userAuth: String, payload: String, contentEncoding: ContentEncoding): EncryptionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(userPublicKey.asInstanceOf[js.Any], userAuth.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any])).asInstanceOf[EncryptionResult]
  inline def encrypt(userPublicKey: String, userAuth: String, payload: Buffer, contentEncoding: ContentEncoding): EncryptionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(userPublicKey.asInstanceOf[js.Any], userAuth.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any])).asInstanceOf[EncryptionResult]
  
  inline def generateRequestDetails(subscription: PushSubscription): RequestDetailsbodynull = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any]).asInstanceOf[RequestDetailsbodynull]
  inline def generateRequestDetails(subscription: PushSubscription, payload: String): RequestDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RequestDetails]
  inline def generateRequestDetails(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetails]
  inline def generateRequestDetails(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetailsbodynull = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetailsbodynull]
  inline def generateRequestDetails(subscription: PushSubscription, payload: Unit, options: RequestOptions): RequestDetailsbodynull = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetailsbodynull]
  inline def generateRequestDetails(subscription: PushSubscription, payload: Buffer): RequestDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RequestDetails]
  inline def generateRequestDetails(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetails]
  
  inline def generateRequestDetails_RequestDetails(subscription: PushSubscription): RequestDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any]).asInstanceOf[RequestDetails]
  inline def generateRequestDetails_RequestDetails(subscription: PushSubscription, payload: Unit, options: RequestOptions): RequestDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetails]
  
  inline def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription): RequestDetailsbodyBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any]).asInstanceOf[RequestDetailsbodyBuffer]
  inline def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: String): RequestDetailsbodyBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RequestDetailsbodyBuffer]
  inline def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetailsbodyBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetailsbodyBuffer]
  inline def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: Unit, options: RequestOptions): RequestDetailsbodyBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetailsbodyBuffer]
  inline def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: Buffer): RequestDetailsbodyBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[RequestDetailsbodyBuffer]
  inline def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetailsbodyBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateRequestDetails")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestDetailsbodyBuffer]
  
  inline def generateVAPIDKeys(): VapidKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("generateVAPIDKeys")().asInstanceOf[VapidKeys]
  
  inline def getVapidHeaders(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding
  ): AuthorizationCryptoKey = (^.asInstanceOf[js.Dynamic].applyDynamic("getVapidHeaders")(audience.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any])).asInstanceOf[AuthorizationCryptoKey]
  inline def getVapidHeaders(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding,
    expiration: Double
  ): AuthorizationCryptoKey = (^.asInstanceOf[js.Dynamic].applyDynamic("getVapidHeaders")(audience.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[AuthorizationCryptoKey]
  
  inline def getVapidHeaders_aes128gcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm
  ): Authorization = (^.asInstanceOf[js.Dynamic].applyDynamic("getVapidHeaders")(audience.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any])).asInstanceOf[Authorization]
  inline def getVapidHeaders_aes128gcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm,
    expiration: Double
  ): Authorization = (^.asInstanceOf[js.Dynamic].applyDynamic("getVapidHeaders")(audience.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[Authorization]
  
  inline def getVapidHeaders_aesgcm(audience: String, subject: String, publicKey: String, privateKey: String, contentEncoding: aesgcm): CryptoKey = (^.asInstanceOf[js.Dynamic].applyDynamic("getVapidHeaders")(audience.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any])).asInstanceOf[CryptoKey]
  inline def getVapidHeaders_aesgcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aesgcm,
    expiration: Double
  ): CryptoKey = (^.asInstanceOf[js.Dynamic].applyDynamic("getVapidHeaders")(audience.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], contentEncoding.asInstanceOf[js.Any], expiration.asInstanceOf[js.Any])).asInstanceOf[CryptoKey]
  
  inline def sendNotification(subscription: PushSubscription): js.Promise[SendResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendNotification")(subscription.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SendResult]]
  inline def sendNotification(subscription: PushSubscription, payload: String): js.Promise[SendResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNotification")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendResult]]
  inline def sendNotification(subscription: PushSubscription, payload: String, options: RequestOptions): js.Promise[SendResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNotification")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendResult]]
  inline def sendNotification(subscription: PushSubscription, payload: Null, options: RequestOptions): js.Promise[SendResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNotification")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendResult]]
  inline def sendNotification(subscription: PushSubscription, payload: Unit, options: RequestOptions): js.Promise[SendResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNotification")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendResult]]
  inline def sendNotification(subscription: PushSubscription, payload: Buffer): js.Promise[SendResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNotification")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendResult]]
  inline def sendNotification(subscription: PushSubscription, payload: Buffer, options: RequestOptions): js.Promise[SendResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNotification")(subscription.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendResult]]
  
  inline def setGCMAPIKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGCMAPIKey")().asInstanceOf[Unit]
  inline def setGCMAPIKey(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGCMAPIKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setVapidDetails(subject: String, publicKey: String, privateKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVapidDetails")(subject.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object supportedContentEncodings {
    
    @JSImport("web-push", "supportedContentEncodings.AES_128_GCM")
    @js.native
    val AES_128_GCM: aws128gcm & ContentEncoding = js.native
    
    @JSImport("web-push", "supportedContentEncodings.AES_GCM")
    @js.native
    val AES_GCM: aesgcm & ContentEncoding = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webPush.webPushStrings.aesgcm
    - typings.webPush.webPushStrings.aes128gcm
  */
  trait ContentEncoding extends StObject
  object ContentEncoding {
    
    inline def aes128gcm: typings.webPush.webPushStrings.aes128gcm = "aes128gcm".asInstanceOf[typings.webPush.webPushStrings.aes128gcm]
    
    inline def aesgcm: typings.webPush.webPushStrings.aesgcm = "aesgcm".asInstanceOf[typings.webPush.webPushStrings.aesgcm]
  }
  
  trait EncryptionResult extends StObject {
    
    var cipherText: Buffer
    
    var localPublicKey: String
    
    var salt: String
  }
  object EncryptionResult {
    
    inline def apply(cipherText: Buffer, localPublicKey: String, salt: String): EncryptionResult = {
      val __obj = js.Dynamic.literal(cipherText = cipherText.asInstanceOf[js.Any], localPublicKey = localPublicKey.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptionResult]
    }
    
    extension [Self <: EncryptionResult](x: Self) {
      
      inline def setCipherText(value: Buffer): Self = StObject.set(x, "cipherText", value.asInstanceOf[js.Any])
      
      inline def setLocalPublicKey(value: String): Self = StObject.set(x, "localPublicKey", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String]
  
  trait PushSubscription extends StObject {
    
    var endpoint: String
    
    var keys: Auth
  }
  object PushSubscription {
    
    inline def apply(endpoint: String, keys: Auth): PushSubscription = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushSubscription]
    }
    
    extension [Self <: PushSubscription](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Auth): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestDetails extends StObject {
    
    var body: Buffer | Null
    
    var endpoint: String
    
    var headers: Headers
    
    var method: POST
    
    var proxy: js.UndefOr[String] = js.undefined
  }
  object RequestDetails {
    
    inline def apply(endpoint: String, headers: Headers): RequestDetails = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = "POST", body = null)
      __obj.asInstanceOf[RequestDetails]
    }
    
    extension [Self <: RequestDetails](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  trait RequestOptions extends StObject {
    
    var TTL: js.UndefOr[Double] = js.undefined
    
    /** Is the HTTPS Agent instance which will be used in the https.request method. If the proxy options defined, agent will be ignored! */
    var agent: js.UndefOr[Agent] = js.undefined
    
    // a value in seconds that describes how long a push message is retained by the push service (by default, four weeks).
    var contentEncoding: js.UndefOr[ContentEncoding] = js.undefined
    
    var gcmAPIKey: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    // the type of push encoding to use (e.g. 'aesgcm', by default, or 'aes128gcm').
    var proxy: js.UndefOr[String] = js.undefined
    
    // proxy hostname/ip and a port to tunnel your requests through (eg. http://< hostname >:< port >).
    /**
      * Is the timeout to receive the full response. So if you have a socket timeout of 1 second, and a response comprised of 3 TCP packets,
      * where each response packet takes 0.9 seconds to arrive, for a total response time of 2.7 seconds, then there will be no timeout.
      * Once a socket 'timeout' triggers the request will be aborted by the library (by default undefined).
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    // can be a GCM API key to be used for this request and this request only. This overrides any API key set via setGCMAPIKey().
    var vapidDetails: js.UndefOr[PrivateKey] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      inline def setGcmAPIKey(value: String): Self = StObject.set(x, "gcmAPIKey", value.asInstanceOf[js.Any])
      
      inline def setGcmAPIKeyUndefined: Self = StObject.set(x, "gcmAPIKey", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setTTL(value: Double): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
      
      inline def setTTLUndefined: Self = StObject.set(x, "TTL", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setVapidDetails(value: PrivateKey): Self = StObject.set(x, "vapidDetails", value.asInstanceOf[js.Any])
      
      inline def setVapidDetailsUndefined: Self = StObject.set(x, "vapidDetails", js.undefined)
    }
  }
  
  trait SendResult extends StObject {
    
    var body: String
    
    var headers: Headers
    
    var statusCode: Double
  }
  object SendResult {
    
    inline def apply(body: String, headers: Headers, statusCode: Double): SendResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendResult]
    }
    
    extension [Self <: SendResult](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait VapidKeys extends StObject {
    
    var privateKey: String
    
    var publicKey: String
  }
  object VapidKeys {
    
    inline def apply(privateKey: String, publicKey: String): VapidKeys = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[VapidKeys]
    }
    
    extension [Self <: VapidKeys](x: Self) {
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
