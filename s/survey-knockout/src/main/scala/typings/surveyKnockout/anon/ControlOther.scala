package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlOther extends js.Object {
  var control: String
  var other: String
  var root: String
}

object ControlOther {
  @scala.inline
  def apply(control: String, other: String, root: String): ControlOther = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOther]
  }
}

