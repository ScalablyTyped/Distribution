package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any], load_idle = load_idle.asInstanceOf[js.Any], load_irq = load_irq.asInstanceOf[js.Any], load_nice = load_nice.asInstanceOf[js.Any], load_system = load_system.asInstanceOf[js.Any], load_user = load_user.asInstanceOf[js.Any], raw_load = raw_load.asInstanceOf[js.Any], raw_load_idle = raw_load_idle.asInstanceOf[js.Any], raw_load_irq = raw_load_irq.asInstanceOf[js.Any], raw_load_nice = raw_load_nice.asInstanceOf[js.Any], raw_load_system = raw_load_system.asInstanceOf[js.Any], raw_load_user = raw_load_user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CurrentLoadCpuData]
  }
}

