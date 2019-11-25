package typings.atWordpressShortcode

import typings.atWordpressShortcode.atWordpressShortcodeStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Closed extends js.Object {
  var content: String
  var `type`: closed
}

object Anon_Closed {
  @scala.inline
  def apply(content: String, `type`: closed): Anon_Closed = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Closed]
  }
}

