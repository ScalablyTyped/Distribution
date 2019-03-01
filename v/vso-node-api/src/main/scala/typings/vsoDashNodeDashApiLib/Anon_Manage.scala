package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Manage extends js.Object {
  var manage: scala.Double
  var none: scala.Double
  var use: scala.Double
}

object Anon_Manage {
  @scala.inline
  def apply(manage: scala.Double, none: scala.Double, use: scala.Double): Anon_Manage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manage")(manage)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Anon_Manage]
  }
}

