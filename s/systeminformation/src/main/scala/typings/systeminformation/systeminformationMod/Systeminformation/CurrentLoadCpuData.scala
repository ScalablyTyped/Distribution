package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentLoadCpuData extends js.Object {
  var load: Double
  var load_idle: Double
  var load_irq: Double
  var load_nice: Double
  var load_system: Double
  var load_user: Double
  var raw_load: Double
  var raw_load_idle: Double
  var raw_load_irq: Double
  var raw_load_nice: Double
  var raw_load_system: Double
  var raw_load_user: Double
}

object CurrentLoadCpuData {
  @scala.inline
  def apply(
    load: Double,
    load_idle: Double,
    load_irq: Double,
    load_nice: Double,
    load_system: Double,
    load_user: Double,
    raw_load: Double,
    raw_load_idle: Double,
    raw_load_irq: Double,
    raw_load_nice: Double,
    raw_load_system: Double,
    raw_load_user: Double
  ): CurrentLoadCpuData = {
    val __obj = js.Dynamic.literal(load = load, load_idle = load_idle, load_irq = load_irq, load_nice = load_nice, load_system = load_system, load_user = load_user, raw_load = raw_load, raw_load_idle = raw_load_idle, raw_load_irq = raw_load_irq, raw_load_nice = raw_load_nice, raw_load_system = raw_load_system, raw_load_user = raw_load_user)
  
    __obj.asInstanceOf[CurrentLoadCpuData]
  }
}

