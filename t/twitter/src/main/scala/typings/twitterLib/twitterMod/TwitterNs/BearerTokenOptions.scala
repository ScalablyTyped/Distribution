package typings
package twitterLib.twitterMod.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BearerTokenOptions extends Options {
  var bearer_token: java.lang.String
}

object BearerTokenOptions {
  @scala.inline
  def apply(
    bearer_token: java.lang.String,
    consumer_key: java.lang.String,
    consumer_secret: java.lang.String,
    media_base: java.lang.String = null,
    request_options: requestLib.requestMod.requestNs.CoreOptions = null,
    rest_base: java.lang.String = null,
    site_stream_base: java.lang.String = null,
    stream_base: java.lang.String = null,
    user_stream_base: java.lang.String = null
  ): BearerTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bearer_token")(bearer_token)
    __obj.updateDynamic("consumer_key")(consumer_key)
    __obj.updateDynamic("consumer_secret")(consumer_secret)
    if (media_base != null) __obj.updateDynamic("media_base")(media_base)
    if (request_options != null) __obj.updateDynamic("request_options")(request_options)
    if (rest_base != null) __obj.updateDynamic("rest_base")(rest_base)
    if (site_stream_base != null) __obj.updateDynamic("site_stream_base")(site_stream_base)
    if (stream_base != null) __obj.updateDynamic("stream_base")(stream_base)
    if (user_stream_base != null) __obj.updateDynamic("user_stream_base")(user_stream_base)
    __obj.asInstanceOf[BearerTokenOptions]
  }
}

