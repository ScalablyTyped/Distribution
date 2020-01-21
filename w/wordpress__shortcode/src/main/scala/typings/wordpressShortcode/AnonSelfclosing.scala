package typings.wordpressShortcode

import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelfclosing extends js.Object {
  var `type`: `self-closing` | single
}

object AnonSelfclosing {
  @scala.inline
  def apply(`type`: `self-closing` | single): AnonSelfclosing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelfclosing]
  }
}

