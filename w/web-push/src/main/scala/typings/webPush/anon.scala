package typings.webPush

import typings.node.bufferMod.global.Buffer
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
    
    inline def apply(auth: String, p256dh: String): Auth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setP256dh(value: String): Self = StObject.set(x, "p256dh", value.asInstanceOf[js.Any])
    }
  }
  
  trait Authorization extends StObject {
    
    var Authorization: String
  }
  object Authorization {
    
    inline def apply(Authorization: String): Authorization = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorization]
    }
    
    extension [Self <: Authorization](x: Self) {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorizationCryptoKey extends StObject {
    
    var Authorization: String
    
    var `Crypto-Key`: js.UndefOr[String] = js.undefined
  }
  object AuthorizationCryptoKey {
    
    inline def apply(Authorization: String): AuthorizationCryptoKey = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationCryptoKey]
    }
    
    extension [Self <: AuthorizationCryptoKey](x: Self) {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      inline def `setCrypto-Key`(value: String): Self = StObject.set(x, "Crypto-Key", value.asInstanceOf[js.Any])
      
      inline def `setCrypto-KeyUndefined`: Self = StObject.set(x, "Crypto-Key", js.undefined)
    }
  }
  
  trait CryptoKey extends StObject {
    
    var Authorization: String
    
    var `Crypto-Key`: String
  }
  object CryptoKey {
    
    inline def apply(Authorization: String, `Crypto-Key`: String): CryptoKey = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Crypto-Key")(`Crypto-Key`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoKey]
    }
    
    extension [Self <: CryptoKey](x: Self) {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      inline def `setCrypto-Key`(value: String): Self = StObject.set(x, "Crypto-Key", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrivateKey extends StObject {
    
    var privateKey: String
    
    var publicKey: String
    
    // should be an object with subject, publicKey and privateKey values defined. These values should follow the VAPID Spec. (https://tools.ietf.org/html/draft-thomson-webpush-vapid)
    var subject: String
  }
  object PrivateKey {
    
    inline def apply(privateKey: String, publicKey: String, subject: String): PrivateKey = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKey]
    }
    
    extension [Self <: PrivateKey](x: Self) {
      
      inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined web-push.web-push.RequestDetails & {  body :node.buffer.<global>.Buffer} */
  trait RequestDetailsbodyBuffer extends StObject {
    
    var body: Buffer | Null
    
    var endpoint: String
    
    var headers: Headers
    
    var method: POST
    
    var proxy: js.UndefOr[String] = js.undefined
  }
  object RequestDetailsbodyBuffer {
    
    inline def apply(endpoint: String, headers: Headers): RequestDetailsbodyBuffer = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = "POST", body = null)
      __obj.asInstanceOf[RequestDetailsbodyBuffer]
    }
    
    extension [Self <: RequestDetailsbodyBuffer](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  /* Inlined web-push.web-push.RequestDetails & {  body :null} */
  trait RequestDetailsbodynull extends StObject {
    
    var body: Buffer | Null
    
    var endpoint: String
    
    var headers: Headers
    
    var method: POST
    
    var proxy: js.UndefOr[String] = js.undefined
  }
  object RequestDetailsbodynull {
    
    inline def apply(endpoint: String, headers: Headers): RequestDetailsbodynull = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = "POST", body = null)
      __obj.asInstanceOf[RequestDetailsbodynull]
    }
    
    extension [Self <: RequestDetailsbodynull](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
}
