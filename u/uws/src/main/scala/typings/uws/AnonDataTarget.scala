package typings.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTarget extends js.Object {
  var data: js.Any
  var target: this.type
  var `type`: String
}

object AnonDataTarget {
  @scala.inline
  def apply(data: js.Any, target: AnonDataTarget, `type`: String): AnonDataTarget = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataTarget]
  }
}

