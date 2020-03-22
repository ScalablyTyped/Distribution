package typings.wordpressShortcode

import typings.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typings.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: `self-closing` | single
}

object AnonType {
  @scala.inline
  def apply(`type`: `self-closing` | single): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

