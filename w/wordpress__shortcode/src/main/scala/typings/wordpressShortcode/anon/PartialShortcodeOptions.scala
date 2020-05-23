package typings.wordpressShortcode.anon

import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/shortcode.@wordpress/shortcode.ShortcodeOptions> */
trait PartialShortcodeOptions extends js.Object {
  var attrs: js.UndefOr[PartialShortcodeAttrs | String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[closed | `self-closing` | single] = js.undefined
}

object PartialShortcodeOptions {
  @scala.inline
  def apply(
    attrs: PartialShortcodeAttrs | String = null,
    content: String = null,
    tag: String = null,
    `type`: closed | `self-closing` | single = null
  ): PartialShortcodeOptions = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialShortcodeOptions]
  }
}

