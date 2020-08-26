package typings.wordpressApiFetch.anon

import typings.wordpressApiFetch.mod.Schema.PostFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formats extends js.Object {
  var formats: js.Array[PostFormat] = js.native
  var `post-thumbnails`: Boolean = js.native
  var `responsive-embeds`: Boolean = js.native
}

object Formats {
  @scala.inline
  def apply(formats: js.Array[PostFormat], `post-thumbnails`: Boolean, `responsive-embeds`: Boolean): Formats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.updateDynamic("post-thumbnails")(`post-thumbnails`.asInstanceOf[js.Any])
    __obj.updateDynamic("responsive-embeds")(`responsive-embeds`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
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
    def setFormatsVarargs(value: PostFormat*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[PostFormat]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def `setPost-thumbnails`(value: Boolean): Self = this.set("post-thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def `setResponsive-embeds`(value: Boolean): Self = this.set("responsive-embeds", value.asInstanceOf[js.Any])
  }
  
}

