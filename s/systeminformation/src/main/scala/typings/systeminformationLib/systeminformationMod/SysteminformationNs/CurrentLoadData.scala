package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentLoadData extends js.Object {
  var avgload: scala.Double
  var cpus: js.Array[CurrentLoadCpuData]
  var currentload: scala.Double
  var currentload_irq: scala.Double
  var currentload_nice: scala.Double
  var currentload_system: scala.Double
  var currentload_user: scala.Double
}

object CurrentLoadData {
  @scala.inline
  def apply(
    avgload: scala.Double,
    cpus: js.Array[CurrentLoadCpuData],
    currentload: scala.Double,
    currentload_irq: scala.Double,
    currentload_nice: scala.Double,
    currentload_system: scala.Double,
    currentload_user: scala.Double
  ): CurrentLoadData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avgload")(avgload)
    __obj.updateDynamic("cpus")(cpus)
    __obj.updateDynamic("currentload")(currentload)
    __obj.updateDynamic("currentload_irq")(currentload_irq)
    __obj.updateDynamic("currentload_nice")(currentload_nice)
    __obj.updateDynamic("currentload_system")(currentload_system)
    __obj.updateDynamic("currentload_user")(currentload_user)
    __obj.asInstanceOf[CurrentLoadData]
  }
}

