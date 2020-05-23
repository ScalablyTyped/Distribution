package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultType extends js.Object {
  var default: String
  var `type`: js.Any
}

object DefaultType {
  @scala.inline
  def apply(default: String, `type`: js.Any): DefaultType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultType]
  }
}

