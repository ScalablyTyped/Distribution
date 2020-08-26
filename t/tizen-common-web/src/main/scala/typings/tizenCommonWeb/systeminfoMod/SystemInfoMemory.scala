package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.NORMAL
import typings.tizenCommonWeb.tizenCommonWebStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoMemory extends SystemInfoProperty {
  /**
    * Represents the low memory state.
    */
  val status: SystemInfoLowMemoryStatus | NORMAL | WARNING = js.native
}

object SystemInfoMemory {
  @scala.inline
  def apply(status: SystemInfoLowMemoryStatus | NORMAL | WARNING): SystemInfoMemory = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoMemory]
  }
  @scala.inline
  implicit class SystemInfoMemoryOps[Self <: SystemInfoMemory] (val x: Self) extends AnyVal {
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
    def setStatus(value: SystemInfoLowMemoryStatus | NORMAL | WARNING): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

