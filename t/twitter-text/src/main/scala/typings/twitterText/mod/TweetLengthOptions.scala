package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweetLengthOptions extends js.Object {
  var short_url_length: Double = js.native
  var short_url_length_https: Double = js.native
}

object TweetLengthOptions {
  @scala.inline
  def apply(short_url_length: Double, short_url_length_https: Double): TweetLengthOptions = {
    val __obj = js.Dynamic.literal(short_url_length = short_url_length.asInstanceOf[js.Any], short_url_length_https = short_url_length_https.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweetLengthOptions]
  }
  @scala.inline
  implicit class TweetLengthOptionsOps[Self <: TweetLengthOptions] (val x: Self) extends AnyVal {
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
    def setShort_url_length(value: Double): Self = this.set("short_url_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort_url_length_https(value: Double): Self = this.set("short_url_length_https", value.asInstanceOf[js.Any])
  }
  
}

