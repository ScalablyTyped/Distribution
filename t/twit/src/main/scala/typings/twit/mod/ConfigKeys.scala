package typings.twit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigKeys extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var access_token_secret: js.UndefOr[String] = js.undefined
  
  var consumer_key: String
  
  var consumer_secret: String
}
object ConfigKeys {
  
  inline def apply(consumer_key: String, consumer_secret: String): ConfigKeys = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigKeys]
  }
  
  extension [Self <: ConfigKeys](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setAccess_token_secret(value: String): Self = StObject.set(x, "access_token_secret", value.asInstanceOf[js.Any])
    
    inline def setAccess_token_secretUndefined: Self = StObject.set(x, "access_token_secret", js.undefined)
    
    inline def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
    
    inline def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
  }
}
