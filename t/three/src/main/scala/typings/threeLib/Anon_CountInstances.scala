package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountInstances extends js.Object {
  var count: scala.Double
  var instances: scala.Double
  var start: scala.Double
}

object Anon_CountInstances {
  @scala.inline
  def apply(count: scala.Double, instances: scala.Double, start: scala.Double): Anon_CountInstances = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("instances")(instances)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_CountInstances]
  }
}

