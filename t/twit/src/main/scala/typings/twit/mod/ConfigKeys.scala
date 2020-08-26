package typings.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigKeys extends js.Object {
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
  implicit class ConfigKeysOps[Self <: ConfigKeys] (val x: Self) extends AnyVal {
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
    def setConsumer_key(value: String): Self = this.set("consumer_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumer_secret(value: String): Self = this.set("consumer_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setAccess_token_secret(value: String): Self = this.set("access_token_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token_secret: Self = this.set("access_token_secret", js.undefined)
  }
  
}

