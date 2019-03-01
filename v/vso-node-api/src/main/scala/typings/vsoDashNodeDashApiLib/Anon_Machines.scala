package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Machines extends js.Object {
  var machines: scala.Double
  var none: scala.Double
}

object Anon_Machines {
  @scala.inline
  def apply(machines: scala.Double, none: scala.Double): Anon_Machines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("machines")(machines)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_Machines]
  }
}

