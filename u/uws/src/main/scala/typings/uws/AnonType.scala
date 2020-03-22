package typings.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var data: js.Any
  var target: this.type
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(data: js.Any, target: AnonType, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

