package typings.webPush

import typings.node.Buffer
import typings.webPush.mod.Headers
import typings.webPush.webPushStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Auth extends StObject {
    
    var auth: String
    
    var p256dh: String
  }
  object Auth {
    
    @scala.inline
    def apply(auth: String, p256dh: String): Auth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256dh(value: String): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
    }
  }
  
  trait Authorization extends StObject {
    
    var Authorization: String
  }
  object Authorization {
    
    @scala.inline
    def apply(Authorization: String): Authorization = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorization]
    }
    
    @scala.inline
    implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorizationCryptoKey extends StObject {
    
    var Authorization: String
    
    var `Crypto-Key`: js.UndefOr[String] = js.undefined
  }
  object AuthorizationCryptoKey {
    
    @scala.inline
    def apply(Authorization: String): AuthorizationCryptoKey = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationCryptoKey]
    }
    
    @scala.inline
    implicit class AuthorizationCryptoKeyMutableBuilder[Self <: AuthorizationCryptoKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCrypto-Key`(value: String): Self = StObject.set(x, "Crypto-Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCrypto-KeyUndefined`: Self = StObject.set(x, "Crypto-Key", js.undefined)
    }
  }
  
  trait CryptoKey extends StObject {
    
    var Authorization: String
    
    var `Crypto-Key`: String
  }
  object CryptoKey {
    
    @scala.inline
    def apply(Authorization: String, `Crypto-Key`: String): CryptoKey = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoKey]
    }
    
    @scala.inline
    implicit class CryptoKeyMutableBuilder[Self <: CryptoKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCrypto-Key`(value: String): Self = StObject.set(x, "Crypto-Key", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrivateKey extends StObject {
    
    var privateKey: String
    
    var publicKey: String
    
    // should be an object with subject, publicKey and privateKey values defined. These values should follow the VAPID Spec. (https://tools.ietf.org/html/draft-thomson-webpush-vapid)
    var subject: String
  }
  object PrivateKey {
    
    @scala.inline
    def apply(privateKey: String, publicKey: String, subject: String): PrivateKey = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKey]
    }
    
    @scala.inline
    implicit class PrivateKeyMutableBuilder[Self <: PrivateKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined web-push.web-push.RequestDetails & {  body :node.Buffer} */
  trait RequestDetailsbodyBuffer extends StObject {
    
    var body: (Buffer | Null) & Buffer
    
    var endpoint: String
    
    var headers: Headers
    
    var method: POST
    
    var proxy: js.UndefOr[String] = js.undefined
  }
  object RequestDetailsbodyBuffer {
    
    @scala.inline
    def apply(body: (Buffer | Null) & Buffer, endpoint: String, headers: Headers): RequestDetailsbodyBuffer = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = "POST")
      __obj.asInstanceOf[RequestDetailsbodyBuffer]
    }
    
    @scala.inline
    implicit class RequestDetailsbodyBufferMutableBuilder[Self <: RequestDetailsbodyBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: (Buffer | Null) & Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined web-push.web-push.RequestDetails & {  body :null} */
  trait RequestDetailsbodynull extends StObject {
    
    var body: (Buffer | Null) & Null
    
    var endpoint: String
    
    var headers: Headers
    
    var method: POST
    
    var proxy: js.UndefOr[String] = js.undefined
  }
  object RequestDetailsbodynull {
    
    @scala.inline
    def apply(body: (Buffer | Null) & Null, endpoint: String, headers: Headers): RequestDetailsbodynull = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = "POST")
      __obj.asInstanceOf[RequestDetailsbodynull]
    }
    
    @scala.inline
    implicit class RequestDetailsbodynullMutableBuilder[Self <: RequestDetailsbodynull] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: (Buffer | Null) & Null): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
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
}
