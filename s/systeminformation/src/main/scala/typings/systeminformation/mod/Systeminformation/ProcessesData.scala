package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessesData extends js.Object {
  
  var all: Double = js.native
  
  var blocked: Double = js.native
  
  var list: js.Array[ProcessesProcessData] = js.native
  
  var running: Double = js.native
  
  var sleeping: Double = js.native
  
  var unknown: Double = js.native
}
object ProcessesData {
  
  @scala.inline
  def apply(
    all: Double,
    blocked: Double,
    list: js.Array[ProcessesProcessData],
    running: Double,
    sleeping: Double,
    unknown: Double
  ): ProcessesData = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesData]
  }
  
  @scala.inline
  implicit class ProcessesDataOps[Self <: ProcessesData] (val x: Self) extends AnyVal {
    
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
    def setAll(value: Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked(value: Double): Self = this.set("blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: ProcessesProcessData*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[ProcessesProcessData]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunning(value: Double): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleeping(value: Double): Self = this.set("sleeping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
}
