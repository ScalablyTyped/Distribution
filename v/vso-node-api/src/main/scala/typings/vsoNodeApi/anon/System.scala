package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System extends js.Object {
  var none: scala.Double
  var system: scala.Double
  var user: scala.Double
}

object System {
  @scala.inline
  def apply(none: scala.Double, system: scala.Double, user: scala.Double): System = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
}

