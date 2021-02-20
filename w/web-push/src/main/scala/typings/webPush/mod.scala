package typings.webPush

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web-push", "WebPushError")
  @js.native
  class WebPushError protected () extends Error {
    def this(message: String, statusCode: Double, headers: Headers, body: String, endpoint: String) = this()
    
    val body: String = js.native
    
    val endpoint: String = js.native
    
    val headers: Headers = js.native
    
    val statusCode: Double = js.native
  }
  
  @JSImport("web-push", "encrypt")
  @js.native
  def encrypt(userPublicKey: String, userAuth: String, payload: String, contentEncoding: ContentEncoding): EncryptionResult = js.native
  @JSImport("web-push", "encrypt")
  @js.native
  def encrypt(userPublicKey: String, userAuth: String, payload: Buffer, contentEncoding: ContentEncoding): EncryptionResult = js.native
  
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails(subscription: PushSubscription): RequestDetailsbodynull = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails(subscription: PushSubscription, payload: js.UndefOr[scala.Nothing], options: RequestOptions): RequestDetailsbodynull = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails(subscription: PushSubscription, payload: String): RequestDetails = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetailsbodynull = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails(subscription: PushSubscription, payload: Buffer): RequestDetails = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetails(subscription: PushSubscription): RequestDetails = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetails(subscription: PushSubscription, payload: js.UndefOr[scala.Nothing], options: RequestOptions): RequestDetails = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription): RequestDetailsbodyBuffer = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: js.UndefOr[scala.Nothing], options: RequestOptions): RequestDetailsbodyBuffer = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: String): RequestDetailsbodyBuffer = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetailsbodyBuffer = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: Buffer): RequestDetailsbodyBuffer = js.native
  @JSImport("web-push", "generateRequestDetails")
  @js.native
  def generateRequestDetails_RequestDetailsbodyBuffer(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetailsbodyBuffer = js.native
  
  @JSImport("web-push", "generateVAPIDKeys")
  @js.native
  def generateVAPIDKeys(): VapidKeys = js.native
  
  @JSImport("web-push", "getVapidHeaders")
  @js.native
  def getVapidHeaders(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding
  ): AuthorizationCryptoKey = js.native
  @JSImport("web-push", "getVapidHeaders")
  @js.native
  def getVapidHeaders(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding,
    expiration: Double
  ): AuthorizationCryptoKey = js.native
  @JSImport("web-push", "getVapidHeaders")
  @js.native
  def getVapidHeaders_aes128gcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm
  ): Authorization = js.native
  @JSImport("web-push", "getVapidHeaders")
  @js.native
  def getVapidHeaders_aes128gcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm,
    expiration: Double
  ): Authorization = js.native
  @JSImport("web-push", "getVapidHeaders")
  @js.native
  def getVapidHeaders_aesgcm(audience: String, subject: String, publicKey: String, privateKey: String, contentEncoding: aesgcm): CryptoKey = js.native
  @JSImport("web-push", "getVapidHeaders")
  @js.native
  def getVapidHeaders_aesgcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aesgcm,
    expiration: Double
  ): CryptoKey = js.native
  
  @JSImport("web-push", "sendNotification")
  @js.native
  def sendNotification(subscription: PushSubscription): js.Promise[SendResult] = js.native
  @JSImport("web-push", "sendNotification")
  @js.native
  def sendNotification(subscription: PushSubscription, payload: js.UndefOr[scala.Nothing], options: RequestOptions): js.Promise[SendResult] = js.native
  @JSImport("web-push", "sendNotification")
  @js.native
  def sendNotification(subscription: PushSubscription, payload: String): js.Promise[SendResult] = js.native
  @JSImport("web-push", "sendNotification")
  @js.native
  def sendNotification(subscription: PushSubscription, payload: String, options: RequestOptions): js.Promise[SendResult] = js.native
  @JSImport("web-push", "sendNotification")
  @js.native
  def sendNotification(subscription: PushSubscription, payload: Null, options: RequestOptions): js.Promise[SendResult] = js.native
  @JSImport("web-push", "sendNotification")
  @js.native
  def sendNotification(subscription: PushSubscription, payload: Buffer): js.Promise[SendResult] = js.native
  @JSImport("web-push", "sendNotification")
  @js.native
  def sendNotification(subscription: PushSubscription, payload: Buffer, options: RequestOptions): js.Promise[SendResult] = js.native
  
  @JSImport("web-push", "setGCMAPIKey")
  @js.native
  def setGCMAPIKey(): Unit = js.native
  @JSImport("web-push", "setGCMAPIKey")
  @js.native
  def setGCMAPIKey(apiKey: String): Unit = js.native
  
  @JSImport("web-push", "setVapidDetails")
  @js.native
  def setVapidDetails(subject: String, publicKey: String, privateKey: String): Unit = js.native
  
  object supportedContentEncodings {
    
    @JSImport("web-push", "supportedContentEncodings.AES_128_GCM")
    @js.native
    val AES_128_GCM: aws128gcm with ContentEncoding = js.native
    
    @JSImport("web-push", "supportedContentEncodings.AES_GCM")
    @js.native
    val AES_GCM: aesgcm with ContentEncoding = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webPush.webPushStrings.aesgcm
    - typings.webPush.webPushStrings.aes128gcm
  */
  trait ContentEncoding extends StObject
  object ContentEncoding {
    
    @scala.inline
    def aes128gcm: typings.webPush.webPushStrings.aes128gcm = "aes128gcm".asInstanceOf[typings.webPush.webPushStrings.aes128gcm]
    
    @scala.inline
    def aesgcm: typings.webPush.webPushStrings.aesgcm = "aesgcm".asInstanceOf[typings.webPush.webPushStrings.aesgcm]
  }
  
  @js.native
  trait EncryptionResult extends StObject {
    
    var cipherText: Buffer = js.native
    
    var localPublicKey: String = js.native
    
    var salt: String = js.native
  }
  object EncryptionResult {
    
    @scala.inline
    def apply(cipherText: Buffer, localPublicKey: String, salt: String): EncryptionResult = {
      val __obj = js.Dynamic.literal(cipherText = cipherText.asInstanceOf[js.Any], localPublicKey = localPublicKey.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptionResult]
    }
    
    @scala.inline
    implicit class EncryptionResultMutableBuilder[Self <: EncryptionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCipherText(value: Buffer): Self = StObject.set(x, "cipherText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPublicKey(value: String): Self = StObject.set(x, "localPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String]
  
  @js.native
  trait PushSubscription extends StObject {
    
    var endpoint: String = js.native
    
    var keys: Auth = js.native
  }
  object PushSubscription {
    
    @scala.inline
    def apply(endpoint: String, keys: Auth): PushSubscription = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushSubscription]
    }
    
    @scala.inline
    implicit class PushSubscriptionMutableBuilder[Self <: PushSubscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeys(value: Auth): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestDetails extends StObject {
    
    var body: Buffer | Null = js.native
    
    var endpoint: String = js.native
    
    var headers: Headers = js.native
    
    var method: POST = js.native
    
    var proxy: js.UndefOr[String] = js.native
  }
  object RequestDetails {
    
    @scala.inline
    def apply(endpoint: String, headers: Headers, method: POST): RequestDetails = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestDetails]
    }
    
    @scala.inline
    implicit class RequestDetailsMutableBuilder[Self <: RequestDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    var TTL: js.UndefOr[Double] = js.native
    
    // a value in seconds that describes how long a push message is retained by the push service (by default, four weeks).
    var contentEncoding: js.UndefOr[ContentEncoding] = js.native
    
    var gcmAPIKey: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    // the type of push encoding to use (e.g. 'aesgcm', by default, or 'aes128gcm').
    var proxy: js.UndefOr[String] = js.native
    
    // can be a GCM API key to be used for this request and this request only. This overrides any API key set via setGCMAPIKey().
    var vapidDetails: js.UndefOr[PrivateKey] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setGcmAPIKey(value: String): Self = StObject.set(x, "gcmAPIKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGcmAPIKeyUndefined: Self = StObject.set(x, "gcmAPIKey", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setTTL(value: Double): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTTLUndefined: Self = StObject.set(x, "TTL", js.undefined)
      
      @scala.inline
      def setVapidDetails(value: PrivateKey): Self = StObject.set(x, "vapidDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVapidDetailsUndefined: Self = StObject.set(x, "vapidDetails", js.undefined)
    }
  }
  
  @js.native
  trait SendResult extends StObject {
    
    var body: String = js.native
    
    var headers: Headers = js.native
    
    var statusCode: Double = js.native
  }
  object SendResult {
    
    @scala.inline
    def apply(body: String, headers: Headers, statusCode: Double): SendResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendResult]
    }
    
    @scala.inline
    implicit class SendResultMutableBuilder[Self <: SendResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VapidKeys extends StObject {
    
    var privateKey: String = js.native
    
    var publicKey: String = js.native
  }
  object VapidKeys {
    
    @scala.inline
    def apply(privateKey: String, publicKey: String): VapidKeys = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[VapidKeys]
    }
    
    @scala.inline
    implicit class VapidKeysMutableBuilder[Self <: VapidKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
