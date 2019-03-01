package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweetLengthOptions extends js.Object {
  var short_url_length: scala.Double
  var short_url_length_https: scala.Double
}

object TweetLengthOptions {
  @scala.inline
  def apply(short_url_length: scala.Double, short_url_length_https: scala.Double): TweetLengthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("short_url_length")(short_url_length)
    __obj.updateDynamic("short_url_length_https")(short_url_length_https)
    __obj.asInstanceOf[TweetLengthOptions]
  }
}

