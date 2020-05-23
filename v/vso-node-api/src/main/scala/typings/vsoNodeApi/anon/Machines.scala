package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Machines extends js.Object {
  var machines: scala.Double
  var none: scala.Double
}

object Machines {
  @scala.inline
  def apply(machines: scala.Double, none: scala.Double): Machines = {
    val __obj = js.Dynamic.literal(machines = machines.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Machines]
  }
}

