package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSystem extends js.Object {
  var none: Double
  var system: Double
  var user: Double
}

object AnonSystem {
  @scala.inline
  def apply(none: Double, system: Double, user: Double): AnonSystem = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSystem]
  }
}

