package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SysStats extends js.Object {
  
  var cpu: Double = js.native
  
  var external: Double = js.native
  
  var heapTotal: Double = js.native
  
  var heapUsed: Double = js.native
  
  var rss: Double = js.native
}
object SysStats {
  
  @scala.inline
  def apply(cpu: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): SysStats = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[SysStats]
  }
  
  @scala.inline
  implicit class SysStatsOps[Self <: SysStats] (val x: Self) extends AnyVal {
    
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
    def setExternal(value: Double): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapTotal(value: Double): Self = this.set("heapTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeapUsed(value: Double): Self = this.set("heapUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRss(value: Double): Self = this.set("rss", value.asInstanceOf[js.Any])
  }
}
