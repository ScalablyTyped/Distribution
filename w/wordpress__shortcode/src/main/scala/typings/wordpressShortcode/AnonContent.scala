package typings.wordpressShortcode

import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var `type`: closed
}

object AnonContent {
  @scala.inline
  def apply(content: String, `type`: closed): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

