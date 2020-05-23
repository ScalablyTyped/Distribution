package typings.wordpressShortcode.anon

import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: String
  var `type`: closed
}

object Content {
  @scala.inline
  def apply(content: String, `type`: closed): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

