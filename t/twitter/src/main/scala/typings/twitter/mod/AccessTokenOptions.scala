package typings.twitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessTokenOptions extends Options {
  
  var access_token_key: String = js.native
  
  var access_token_secret: String = js.native
}
object AccessTokenOptions {
  
  @scala.inline
  def apply(
    access_token_key: String,
    access_token_secret: String,
    consumer_key: String,
    consumer_secret: String
  ): AccessTokenOptions = {
    val __obj = js.Dynamic.literal(access_token_key = access_token_key.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenOptions]
  }
  
  @scala.inline
  implicit class AccessTokenOptionsOps[Self <: AccessTokenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccess_token_key(value: String): Self = this.set("access_token_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_token_secret(value: String): Self = this.set("access_token_secret", value.asInstanceOf[js.Any])
  }
}
