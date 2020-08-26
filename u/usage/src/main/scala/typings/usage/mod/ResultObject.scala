package typings.usage.mod

import typings.usage.anon.Rss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultObject extends js.Object {
  var cpu: Double = js.native
  var memory: Double = js.native
  var memoryInfo: Rss = js.native
}

object ResultObject {
  @scala.inline
  def apply(cpu: Double, memory: Double, memoryInfo: Rss): ResultObject = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryInfo = memoryInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultObject]
  }
  @scala.inline
  implicit class ResultObjectOps[Self <: ResultObject] (val x: Self) extends AnyVal {
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
    def setCpu(value: Double): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemoryInfo(value: Rss): Self = this.set("memoryInfo", value.asInstanceOf[js.Any])
  }
  
}

