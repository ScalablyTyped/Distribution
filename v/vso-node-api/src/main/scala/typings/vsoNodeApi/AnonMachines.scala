package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMachines extends js.Object {
  var machines: Double
  var none: Double
}

object AnonMachines {
  @scala.inline
  def apply(machines: Double, none: Double): AnonMachines = {
    val __obj = js.Dynamic.literal(machines = machines.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMachines]
  }
}

