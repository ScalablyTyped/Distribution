package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentLoadData extends js.Object {
  var avgload: Double
  var cpus: js.Array[CurrentLoadCpuData]
  var currentload: Double
  var currentload_irq: Double
  var currentload_nice: Double
  var currentload_system: Double
  var currentload_user: Double
}

object CurrentLoadData {
  @scala.inline
  def apply(
    avgload: Double,
    cpus: js.Array[CurrentLoadCpuData],
    currentload: Double,
    currentload_irq: Double,
    currentload_nice: Double,
    currentload_system: Double,
    currentload_user: Double
  ): CurrentLoadData = {
    val __obj = js.Dynamic.literal(avgload = avgload, cpus = cpus, currentload = currentload, currentload_irq = currentload_irq, currentload_nice = currentload_nice, currentload_system = currentload_system, currentload_user = currentload_user)
  
    __obj.asInstanceOf[CurrentLoadData]
  }
}

