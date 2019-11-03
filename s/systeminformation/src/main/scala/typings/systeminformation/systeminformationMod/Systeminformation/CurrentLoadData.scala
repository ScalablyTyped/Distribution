package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 7. Current Load, Processes & Services
trait CurrentLoadData extends js.Object {
  var avgload: Double
  var cpus: js.Array[CurrentLoadCpuData]
  var currentload: Double
  var currentload_idle: Double
  var currentload_irq: Double
  var currentload_nice: Double
  var currentload_system: Double
  var currentload_user: Double
  var raw_currentload: Double
  var raw_currentload_idle: Double
  var raw_currentload_irq: Double
  var raw_currentload_nice: Double
  var raw_currentload_system: Double
  var raw_currentload_user: Double
}

object CurrentLoadData {
  @scala.inline
  def apply(
    avgload: Double,
    cpus: js.Array[CurrentLoadCpuData],
    currentload: Double,
    currentload_idle: Double,
    currentload_irq: Double,
    currentload_nice: Double,
    currentload_system: Double,
    currentload_user: Double,
    raw_currentload: Double,
    raw_currentload_idle: Double,
    raw_currentload_irq: Double,
    raw_currentload_nice: Double,
    raw_currentload_system: Double,
    raw_currentload_user: Double
  ): CurrentLoadData = {
    val __obj = js.Dynamic.literal(avgload = avgload, cpus = cpus, currentload = currentload, currentload_idle = currentload_idle, currentload_irq = currentload_irq, currentload_nice = currentload_nice, currentload_system = currentload_system, currentload_user = currentload_user, raw_currentload = raw_currentload, raw_currentload_idle = raw_currentload_idle, raw_currentload_irq = raw_currentload_irq, raw_currentload_nice = raw_currentload_nice, raw_currentload_system = raw_currentload_system, raw_currentload_user = raw_currentload_user)
  
    __obj.asInstanceOf[CurrentLoadData]
  }
}

