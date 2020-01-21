package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultTypeAny extends js.Object {
  var default: String
  var `type`: js.Any
}

object AnonDefaultTypeAny {
  @scala.inline
  def apply(default: String, `type`: js.Any): AnonDefaultTypeAny = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultTypeAny]
  }
}

