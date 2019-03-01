package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoneSystem extends js.Object {
  var none: scala.Double
  var system: scala.Double
  var user: scala.Double
}

object Anon_NoneSystem {
  @scala.inline
  def apply(none: scala.Double, system: scala.Double, user: scala.Double): Anon_NoneSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("system")(system)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_NoneSystem]
  }
}

