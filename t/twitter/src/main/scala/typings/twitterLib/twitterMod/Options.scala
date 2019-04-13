package typings
package twitterLib.twitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var consumer_key: java.lang.String
  var consumer_secret: java.lang.String
  var media_base: js.UndefOr[java.lang.String] = js.undefined
  var request_options: js.UndefOr[requestLib.requestMod.CoreOptions] = js.undefined
  var rest_base: js.UndefOr[java.lang.String] = js.undefined
  var site_stream_base: js.UndefOr[java.lang.String] = js.undefined
  var stream_base: js.UndefOr[java.lang.String] = js.undefined
  var user_stream_base: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    consumer_key: java.lang.String,
    consumer_secret: java.lang.String,
    media_base: java.lang.String = null,
    request_options: requestLib.requestMod.CoreOptions = null,
    rest_base: java.lang.String = null,
    site_stream_base: java.lang.String = null,
    stream_base: java.lang.String = null,
    user_stream_base: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key, consumer_secret = consumer_secret)
    if (media_base != null) __obj.updateDynamic("media_base")(media_base)
    if (request_options != null) __obj.updateDynamic("request_options")(request_options)
    if (rest_base != null) __obj.updateDynamic("rest_base")(rest_base)
    if (site_stream_base != null) __obj.updateDynamic("site_stream_base")(site_stream_base)
    if (stream_base != null) __obj.updateDynamic("stream_base")(stream_base)
    if (user_stream_base != null) __obj.updateDynamic("user_stream_base")(user_stream_base)
    __obj.asInstanceOf[Options]
  }
}

