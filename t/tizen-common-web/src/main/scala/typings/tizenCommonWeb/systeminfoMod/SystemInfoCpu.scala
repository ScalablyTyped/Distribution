package typings.tizenCommonWeb.systeminfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoCpu extends SystemInfoProperty {
  
  /**
    *  An attribute to indicate the current CPU load, as a number between ***0.0 ***and ***1.0***, representing the minimum and maximum values allowed on this system.
    *
    * Any threshold parameter used in a watch function to monitor this property applies to this attribute.
    */
  val load: Double = js.native
}
object SystemInfoCpu {
  
  @scala.inline
  def apply(load: Double): SystemInfoCpu = {
    val __obj = js.Dynamic.literal(load = load.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoCpu]
  }
  
  @scala.inline
  implicit class SystemInfoCpuOps[Self <: SystemInfoCpu] (val x: Self) extends AnyVal {
    
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
  }
}
