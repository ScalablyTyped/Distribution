package typings.twitterDashText.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweetLengthOptions extends js.Object {
  var short_url_length: Double
  var short_url_length_https: Double
}

object TweetLengthOptions {
  @scala.inline
  def apply(short_url_length: Double, short_url_length_https: Double): TweetLengthOptions = {
    val __obj = js.Dynamic.literal(short_url_length = short_url_length.asInstanceOf[js.Any], short_url_length_https = short_url_length_https.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TweetLengthOptions]
  }
}

