package typings.wordpressShortcode

import typings.wordpressShortcode.mod.ShortcodeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttrs extends js.Object {
  var attrs: ShortcodeAttrs
  var tag: String
}

object AnonAttrs {
  @scala.inline
  def apply(attrs: ShortcodeAttrs, tag: String): AnonAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrs]
  }
}

