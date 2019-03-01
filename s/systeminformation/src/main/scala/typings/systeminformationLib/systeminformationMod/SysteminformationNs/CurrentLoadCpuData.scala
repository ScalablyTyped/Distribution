package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentLoadCpuData extends js.Object {
  var load: scala.Double
  var load_irq: scala.Double
  var load_nice: scala.Double
  var load_system: scala.Double
  var load_user: scala.Double
}

object CurrentLoadCpuData {
  @scala.inline
  def apply(
    load: scala.Double,
    load_irq: scala.Double,
    load_nice: scala.Double,
    load_system: scala.Double,
    load_user: scala.Double
  ): CurrentLoadCpuData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("load_irq")(load_irq)
    __obj.updateDynamic("load_nice")(load_nice)
    __obj.updateDynamic("load_system")(load_system)
    __obj.updateDynamic("load_user")(load_user)
    __obj.asInstanceOf[CurrentLoadCpuData]
  }
}

