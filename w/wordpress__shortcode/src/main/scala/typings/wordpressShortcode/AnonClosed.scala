package typings.wordpressShortcode

import typings.wordpressShortcode.wordpressShortcodeStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosed extends js.Object {
  var content: String
  var `type`: closed
}

object AnonClosed {
  @scala.inline
  def apply(content: String, `type`: closed): AnonClosed = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosed]
  }
}

