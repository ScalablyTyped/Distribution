package typings.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigKeys extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var access_token_secret: js.UndefOr[String] = js.undefined
  var consumer_key: String
  var consumer_secret: String
}

object ConfigKeys {
  @scala.inline
  def apply(
    consumer_key: String,
    consumer_secret: String,
    access_token: String = null,
    access_token_secret: String = null
  ): ConfigKeys = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (access_token_secret != null) __obj.updateDynamic("access_token_secret")(access_token_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigKeys]
  }
}

