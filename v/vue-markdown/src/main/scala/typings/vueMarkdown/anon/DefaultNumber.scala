package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNumber extends js.Object {
  var default: Double
  var `type`: js.Any
}

object DefaultNumber {
  @scala.inline
  def apply(default: Double, `type`: js.Any): DefaultNumber = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNumber]
  }
}

