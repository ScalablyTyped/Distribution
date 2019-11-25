package typings.atWordpressShortcode

import typings.atWordpressShortcode.atWordpressShortcodeStrings.`self-closing`
import typings.atWordpressShortcode.atWordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Selfclosing extends js.Object {
  var `type`: `self-closing` | single
}

object Anon_Selfclosing {
  @scala.inline
  def apply(`type`: `self-closing` | single): Anon_Selfclosing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Selfclosing]
  }
}

