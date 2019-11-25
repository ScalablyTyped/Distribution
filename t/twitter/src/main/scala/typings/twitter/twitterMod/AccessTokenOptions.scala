package typings.twitter.twitterMod

import typings.request.requestMod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenOptions extends Options {
  var access_token_key: String
  var access_token_secret: String
}

object AccessTokenOptions {
  @scala.inline
  def apply(
    access_token_key: String,
    access_token_secret: String,
    consumer_key: String,
    consumer_secret: String,
    media_base: String = null,
    request_options: CoreOptions = null,
    rest_base: String = null,
    site_stream_base: String = null,
    stream_base: String = null,
    user_stream_base: String = null
  ): AccessTokenOptions = {
    val __obj = js.Dynamic.literal(access_token_key = access_token_key.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    if (media_base != null) __obj.updateDynamic("media_base")(media_base.asInstanceOf[js.Any])
    if (request_options != null) __obj.updateDynamic("request_options")(request_options.asInstanceOf[js.Any])
    if (rest_base != null) __obj.updateDynamic("rest_base")(rest_base.asInstanceOf[js.Any])
    if (site_stream_base != null) __obj.updateDynamic("site_stream_base")(site_stream_base.asInstanceOf[js.Any])
    if (stream_base != null) __obj.updateDynamic("stream_base")(stream_base.asInstanceOf[js.Any])
    if (user_stream_base != null) __obj.updateDynamic("user_stream_base")(user_stream_base.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenOptions]
  }
}

