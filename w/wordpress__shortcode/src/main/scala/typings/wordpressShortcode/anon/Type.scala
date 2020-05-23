package typings.wordpressShortcode.anon

import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: `self-closing` | single
}

object Type {
  @scala.inline
  def apply(`type`: `self-closing` | single): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

