package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Available extends js.Object {
  var available: scala.Double
  var offline: scala.Double
  var unavailable: scala.Double
}

object Anon_Available {
  @scala.inline
  def apply(available: scala.Double, offline: scala.Double, unavailable: scala.Double): Anon_Available = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("offline")(offline)
    __obj.updateDynamic("unavailable")(unavailable)
    __obj.asInstanceOf[Anon_Available]
  }
}

