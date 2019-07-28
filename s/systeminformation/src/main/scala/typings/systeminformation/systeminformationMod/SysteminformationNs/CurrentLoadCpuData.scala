package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentLoadCpuData extends js.Object {
  var load: Double
  var load_irq: Double
  var load_nice: Double
  var load_system: Double
  var load_user: Double
}

object CurrentLoadCpuData {
  @scala.inline
  def apply(load: Double, load_irq: Double, load_nice: Double, load_system: Double, load_user: Double): CurrentLoadCpuData = {
    val __obj = js.Dynamic.literal(load = load, load_irq = load_irq, load_nice = load_nice, load_system = load_system, load_user = load_user)
  
    __obj.asInstanceOf[CurrentLoadCpuData]
  }
}

