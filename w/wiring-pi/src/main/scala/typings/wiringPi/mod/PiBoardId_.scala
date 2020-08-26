package typings.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PiBoardId_ extends js.Object {
  var maker: Double = js.native
  var mem: Double = js.native
  var model: Double = js.native
  var overvolted: Double = js.native
  var rev: Double = js.native
}

object PiBoardId_ {
  @scala.inline
  def apply(maker: Double, mem: Double, model: Double, overvolted: Double, rev: Double): PiBoardId_ = {
    val __obj = js.Dynamic.literal(maker = maker.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], overvolted = overvolted.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiBoardId_]
  }
  @scala.inline
  implicit class PiBoardId_Ops[Self <: PiBoardId_] (val x: Self) extends AnyVal {
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
    def setMaker(value: Double): Self = this.set("maker", value.asInstanceOf[js.Any])
    @scala.inline
    def setMem(value: Double): Self = this.set("mem", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: Double): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setOvervolted(value: Double): Self = this.set("overvolted", value.asInstanceOf[js.Any])
    @scala.inline
    def setRev(value: Double): Self = this.set("rev", value.asInstanceOf[js.Any])
  }
  
}

