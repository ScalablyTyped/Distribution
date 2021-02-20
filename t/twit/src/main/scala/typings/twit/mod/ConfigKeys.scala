package typings.twit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigKeys extends StObject {
  
  var access_token: js.UndefOr[String] = js.native
  
  var access_token_secret: js.UndefOr[String] = js.native
  
  var consumer_key: String = js.native
  
  var consumer_secret: String = js.native
}
object ConfigKeys {
  
  @scala.inline
  def apply(consumer_key: String, consumer_secret: String): ConfigKeys = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigKeys]
  }
  
  @scala.inline
  implicit class ConfigKeysMutableBuilder[Self <: ConfigKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setAccess_token_secret(value: String): Self = StObject.set(x, "access_token_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_token_secretUndefined: Self = StObject.set(x, "access_token_secret", js.undefined)
    
    @scala.inline
    def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
  }
}
