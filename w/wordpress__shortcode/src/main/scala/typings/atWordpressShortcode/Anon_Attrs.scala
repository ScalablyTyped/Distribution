package typings.atWordpressShortcode

import typings.atWordpressShortcode.atWordpressShortcodeMod.ShortcodeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attrs extends js.Object {
  var attrs: ShortcodeAttrs
  var tag: String
}

object Anon_Attrs {
  @scala.inline
  def apply(attrs: ShortcodeAttrs, tag: String): Anon_Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attrs]
  }
}

