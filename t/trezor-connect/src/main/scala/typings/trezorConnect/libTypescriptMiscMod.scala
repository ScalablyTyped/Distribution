package typings.trezorConnect

import typings.node.bufferMod.global.Buffer
import typings.std.JSON
import typings.trezorConnect.anon.Params
import typings.trezorConnect.libTypescriptParamsMod.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptMiscMod {
  
  trait CipherKeyValue extends StObject {
    
    var askOnDecrypt: js.UndefOr[Boolean] = js.undefined
    
    var askOnEncrypt: js.UndefOr[Boolean] = js.undefined
    
    var encrypt: js.UndefOr[Boolean] = js.undefined
    
    var iv: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var path: String | js.Array[Double]
    
    var value: String | Buffer
  }
  object CipherKeyValue {
    
    inline def apply(key: String, path: String | js.Array[Double], value: String | Buffer): CipherKeyValue = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherKeyValue]
    }
    
    extension [Self <: CipherKeyValue](x: Self) {
      
      inline def setAskOnDecrypt(value: Boolean): Self = StObject.set(x, "askOnDecrypt", value.asInstanceOf[js.Any])
      
      inline def setAskOnDecryptUndefined: Self = StObject.set(x, "askOnDecrypt", js.undefined)
      
      inline def setAskOnEncrypt(value: Boolean): Self = StObject.set(x, "askOnEncrypt", value.asInstanceOf[js.Any])
      
      inline def setAskOnEncryptUndefined: Self = StObject.set(x, "askOnEncrypt", js.undefined)
      
      inline def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
      
      inline def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CipheredValue extends StObject {
    
    var value: String
  }
  object CipheredValue {
    
    inline def apply(value: String): CipheredValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipheredValue]
    }
    
    extension [Self <: CipheredValue](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomMessage extends StObject {
    
    def callback(request: Any): js.Promise[Params]
    
    var message: String
    
    var messages: js.UndefOr[JSON | js.Object] = js.undefined
    
    var params: JSON | js.Object
  }
  object CustomMessage {
    
    inline def apply(callback: Any => js.Promise[Params], message: String, params: JSON | js.Object): CustomMessage = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMessage]
    }
    
    extension [Self <: CustomMessage](x: Self) {
      
      inline def setCallback(value: Any => js.Promise[Params]): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: JSON | js.Object): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setParams(value: JSON | js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait Login extends StObject {
    
    var address: String
    
    var publicKey: String
    
    var signature: String
  }
  object Login {
    
    inline def apply(address: String, publicKey: String, signature: String): Login = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Login]
    }
    
    extension [Self <: Login](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoginChallenge extends StObject {
    
    var challengeHidden: String
    
    var challengeVisual: String
  }
  object LoginChallenge {
    
    inline def apply(challengeHidden: String, challengeVisual: String): LoginChallenge = {
      val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginChallenge]
    }
    
    extension [Self <: LoginChallenge](x: Self) {
      
      inline def setChallengeHidden(value: String): Self = StObject.set(x, "challengeHidden", value.asInstanceOf[js.Any])
      
      inline def setChallengeVisual(value: String): Self = StObject.set(x, "challengeVisual", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestLoginAsync extends StObject {
    
    var asyncChallenge: js.UndefOr[Boolean] = js.undefined
    
    def callback(): LoginChallenge
  }
  object RequestLoginAsync {
    
    inline def apply(callback: () => LoginChallenge): RequestLoginAsync = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
      __obj.asInstanceOf[RequestLoginAsync]
    }
    
    extension [Self <: RequestLoginAsync](x: Self) {
      
      inline def setAsyncChallenge(value: Boolean): Self = StObject.set(x, "asyncChallenge", value.asInstanceOf[js.Any])
      
      inline def setAsyncChallengeUndefined: Self = StObject.set(x, "asyncChallenge", js.undefined)
      
      inline def setCallback(value: () => LoginChallenge): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    }
  }
  
  trait SetProxy extends StObject {
    
    var proxy: js.UndefOr[Proxy] = js.undefined
    
    var useOnionLinks: js.UndefOr[Boolean] = js.undefined
  }
  object SetProxy {
    
    inline def apply(): SetProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetProxy]
    }
    
    extension [Self <: SetProxy](x: Self) {
      
      inline def setProxy(value: Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setUseOnionLinks(value: Boolean): Self = StObject.set(x, "useOnionLinks", value.asInstanceOf[js.Any])
      
      inline def setUseOnionLinksUndefined: Self = StObject.set(x, "useOnionLinks", js.undefined)
    }
  }
}
