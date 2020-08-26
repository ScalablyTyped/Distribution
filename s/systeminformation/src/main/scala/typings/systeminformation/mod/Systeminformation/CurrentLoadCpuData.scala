package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentLoadCpuData extends js.Object {
  var load: Double = js.native
  var load_idle: Double = js.native
  var load_irq: Double = js.native
  var load_nice: Double = js.native
  var load_system: Double = js.native
  var load_user: Double = js.native
  var raw_load: Double = js.native
  var raw_load_idle: Double = js.native
  var raw_load_irq: Double = js.native
  var raw_load_nice: Double = js.native
  var raw_load_system: Double = js.native
  var raw_load_user: Double = js.native
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
  @scala.inline
  implicit class CurrentLoadCpuDataOps[Self <: CurrentLoadCpuData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoad(value: Double): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad_idle(value: Double): Self = this.set("load_idle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad_irq(value: Double): Self = this.set("load_irq", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad_nice(value: Double): Self = this.set("load_nice", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad_system(value: Double): Self = this.set("load_system", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad_user(value: Double): Self = this.set("load_user", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_load(value: Double): Self = this.set("raw_load", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_load_idle(value: Double): Self = this.set("raw_load_idle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_load_irq(value: Double): Self = this.set("raw_load_irq", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_load_nice(value: Double): Self = this.set("raw_load_nice", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_load_system(value: Double): Self = this.set("raw_load_system", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_load_user(value: Double): Self = this.set("raw_load_user", value.asInstanceOf[js.Any])
  }
  
}

