package typings
package twitLib.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigKeys extends js.Object {
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  var access_token_secret: js.UndefOr[java.lang.String] = js.undefined
  var consumer_key: java.lang.String
  var consumer_secret: java.lang.String
}

object ConfigKeys {
  @scala.inline
  def apply(
    consumer_key: java.lang.String,
    consumer_secret: java.lang.String,
    access_token: java.lang.String = null,
    access_token_secret: java.lang.String = null
  ): ConfigKeys = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key, consumer_secret = consumer_secret)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (access_token_secret != null) __obj.updateDynamic("access_token_secret")(access_token_secret)
    __obj.asInstanceOf[ConfigKeys]
  }
}

