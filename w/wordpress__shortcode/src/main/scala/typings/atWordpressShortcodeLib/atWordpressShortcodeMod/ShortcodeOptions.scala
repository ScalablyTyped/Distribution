package typings
package atWordpressShortcodeLib.atWordpressShortcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeOptions extends js.Object {
  var attrs: js.UndefOr[stdLib.Partial[ShortcodeAttrs] | java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var tag: java.lang.String
  var `type`: js.UndefOr[
    atWordpressShortcodeLib.atWordpressShortcodeLibStrings.closed | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.`self-closing` | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.single
  ] = js.undefined
}

object ShortcodeOptions {
  @scala.inline
  def apply(
    tag: java.lang.String,
    attrs: stdLib.Partial[ShortcodeAttrs] | java.lang.String = null,
    content: java.lang.String = null,
    `type`: atWordpressShortcodeLib.atWordpressShortcodeLibStrings.closed | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.`self-closing` | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.single = null
  ): ShortcodeOptions = {
    val __obj = js.Dynamic.literal(tag = tag)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcodeOptions]
  }
}

