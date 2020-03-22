package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultType extends js.Object {
  var default: String
  var `type`: js.Any
}

object AnonDefaultType {
  @scala.inline
  def apply(default: String, `type`: js.Any): AnonDefaultType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultType]
  }
}

