package typings.wordpressShortcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcodeMatch extends js.Object {
  var content: String = js.native
  var index: Double = js.native
  var shortcode: Shortcode_ = js.native
}

object ShortcodeMatch {
  @scala.inline
  def apply(content: String, index: Double, shortcode: Shortcode_): ShortcodeMatch = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], shortcode = shortcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeMatch]
  }
  @scala.inline
  implicit class ShortcodeMatchOps[Self <: ShortcodeMatch] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortcode(value: Shortcode_): Self = this.set("shortcode", value.asInstanceOf[js.Any])
  }
  
}

