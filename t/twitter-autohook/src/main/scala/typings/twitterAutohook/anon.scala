package typings.twitterAutohook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Consumerkey extends StObject {
    
    var consumer_key: js.UndefOr[String] = js.undefined
    
    var consumer_secret: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ngrok_secret: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var token_secret: js.UndefOr[String] = js.undefined
  }
  object Consumerkey {
    
    inline def apply(): Consumerkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Consumerkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Consumerkey] (val x: Self) extends AnyVal {
      
      inline def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
      
      inline def setConsumer_keyUndefined: Self = StObject.set(x, "consumer_key", js.undefined)
      
      inline def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
      
      inline def setConsumer_secretUndefined: Self = StObject.set(x, "consumer_secret", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setHeaders(value: js.Array[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Any*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setNgrok_secret(value: String): Self = StObject.set(x, "ngrok_secret", value.asInstanceOf[js.Any])
      
      inline def setNgrok_secretUndefined: Self = StObject.set(x, "ngrok_secret", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setToken_secret(value: String): Self = StObject.set(x, "token_secret", value.asInstanceOf[js.Any])
      
      inline def setToken_secretUndefined: Self = StObject.set(x, "token_secret", js.undefined)
    }
  }
  
  trait Oauthtoken extends StObject {
    
    var oauth_token: String
    
    var oauth_token_secret: String
    
    var screen_name: js.UndefOr[String] = js.undefined
  }
  object Oauthtoken {
    
    inline def apply(oauth_token: String, oauth_token_secret: String): Oauthtoken = {
      val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oauthtoken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Oauthtoken] (val x: Self) extends AnyVal {
      
      inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      inline def setOauth_token_secret(value: String): Self = StObject.set(x, "oauth_token_secret", value.asInstanceOf[js.Any])
      
      inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
      
      inline def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
    }
  }
  
  trait Responsetoken extends StObject {
    
    var response_token: String
  }
  object Responsetoken {
    
    inline def apply(response_token: String): Responsetoken = {
      val __obj = js.Dynamic.literal(response_token = response_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Responsetoken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Responsetoken] (val x: Self) extends AnyVal {
      
      inline def setResponse_token(value: String): Self = StObject.set(x, "response_token", value.asInstanceOf[js.Any])
    }
  }
}
