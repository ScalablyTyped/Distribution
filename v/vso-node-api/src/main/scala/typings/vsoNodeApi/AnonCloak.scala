package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloak extends js.Object {
  var cloak: Double
  var map: Double
}

object AnonCloak {
  @scala.inline
  def apply(cloak: Double, map: Double): AnonCloak = {
    val __obj = js.Dynamic.literal(cloak = cloak.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloak]
  }
}

