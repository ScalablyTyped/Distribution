package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends js.Object {
  var media: String = js.native
  var style: String = js.native
}

object Media {
  @scala.inline
  def apply(media: String, style: String): Media = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
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
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

