package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoneSystem extends js.Object {
  var none: Double
  var system: Double
  var user: Double
}

object AnonNoneSystem {
  @scala.inline
  def apply(none: Double, system: Double, user: Double): AnonNoneSystem = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNoneSystem]
  }
}

