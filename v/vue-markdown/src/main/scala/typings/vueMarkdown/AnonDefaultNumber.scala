package typings.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultNumber extends js.Object {
  var default: Double
  var `type`: js.Any
}

object AnonDefaultNumber {
  @scala.inline
  def apply(default: Double, `type`: js.Any): AnonDefaultNumber = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultNumber]
  }
}

