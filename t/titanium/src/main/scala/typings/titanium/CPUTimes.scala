package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding the data for a logical cpu execution times.
  */
@js.native
trait CPUTimes extends js.Object {
  /**
    * The number of milliseconds the CPU has spent in idle mode.
    */
  var idle: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds the CPU has spent in irq mode.
    */
  var irq: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds the CPU has spent in nice mode.
    */
  var nice: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds the CPU has spent in sys mode.
    */
  var sys: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds the CPU has spent in user mode.
    */
  var user: js.UndefOr[Double] = js.native
}

object CPUTimes {
  @scala.inline
  def apply(): CPUTimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUTimes]
  }
  @scala.inline
  implicit class CPUTimesOps[Self <: CPUTimes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdle(value: Double): Self = this.set("idle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdle: Self = this.set("idle", js.undefined)
    @scala.inline
    def setIrq(value: Double): Self = this.set("irq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIrq: Self = this.set("irq", js.undefined)
    @scala.inline
    def setNice(value: Double): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
    @scala.inline
    def setSys(value: Double): Self = this.set("sys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSys: Self = this.set("sys", js.undefined)
    @scala.inline
    def setUser(value: Double): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

