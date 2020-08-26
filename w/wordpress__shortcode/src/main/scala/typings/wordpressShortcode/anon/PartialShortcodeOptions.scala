package typings.wordpressShortcode.anon

import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeOptions> */
@js.native
trait PartialShortcodeOptions extends js.Object {
  var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.native
  var content: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[closed | `self-closing` | single] = js.native
}

object PartialShortcodeOptions {
  @scala.inline
  def apply(): PartialShortcodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShortcodeOptions]
  }
  @scala.inline
  implicit class PartialShortcodeOptionsOps[Self <: PartialShortcodeOptions] (val x: Self) extends AnyVal {
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
    def setAttrs(value: PartialShortcodeAttrs | String): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setType(value: closed | `self-closing` | single): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

