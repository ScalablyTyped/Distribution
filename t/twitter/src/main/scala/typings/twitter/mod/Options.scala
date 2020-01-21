package typings.twitter.mod

import typings.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var consumer_key: String
  var consumer_secret: String
  var media_base: js.UndefOr[String] = js.undefined
  var request_options: js.UndefOr[CoreOptions] = js.undefined
  var rest_base: js.UndefOr[String] = js.undefined
  var site_stream_base: js.UndefOr[String] = js.undefined
  var stream_base: js.UndefOr[String] = js.undefined
  var user_stream_base: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    consumer_key: String,
    consumer_secret: String,
    media_base: String = null,
    request_options: CoreOptions = null,
    rest_base: String = null,
    site_stream_base: String = null,
    stream_base: String = null,
    user_stream_base: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    if (media_base != null) __obj.updateDynamic("media_base")(media_base.asInstanceOf[js.Any])
    if (request_options != null) __obj.updateDynamic("request_options")(request_options.asInstanceOf[js.Any])
    if (rest_base != null) __obj.updateDynamic("rest_base")(rest_base.asInstanceOf[js.Any])
    if (site_stream_base != null) __obj.updateDynamic("site_stream_base")(site_stream_base.asInstanceOf[js.Any])
    if (stream_base != null) __obj.updateDynamic("stream_base")(stream_base.asInstanceOf[js.Any])
    if (user_stream_base != null) __obj.updateDynamic("user_stream_base")(user_stream_base.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

