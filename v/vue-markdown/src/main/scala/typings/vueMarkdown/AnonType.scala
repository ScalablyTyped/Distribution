package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var default: Boolean
  var `type`: js.Any
}

object AnonType {
  @scala.inline
  def apply(default: Boolean, `type`: js.Any): AnonType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

