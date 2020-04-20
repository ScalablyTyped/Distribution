package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var custom: Double
  var default: Double
  var upgrade: Double
}

object AnonDefault {
  @scala.inline
  def apply(custom: Double, default: Double, upgrade: Double): AnonDefault = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

