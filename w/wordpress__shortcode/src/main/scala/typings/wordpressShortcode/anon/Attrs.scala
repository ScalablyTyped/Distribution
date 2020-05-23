package typings.wordpressShortcode.anon

import typings.wordpressShortcode.mod.ShortcodeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrs extends js.Object {
  var attrs: ShortcodeAttrs
  var tag: String
}

object Attrs {
  @scala.inline
  def apply(attrs: ShortcodeAttrs, tag: String): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
}

