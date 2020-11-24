package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding the data for a logical cpu.
  */
@js.native
trait CPU extends js.Object {
  
  /**
    * General description of the CPU
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Speed of the CPU in MHz
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * A collection of timings for this logical CPU.
    */
  var times: js.UndefOr[CPUTimes] = js.native
}
object CPU {
  
  @scala.inline
  def apply(): CPU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPU]
  }
  
  @scala.inline
  implicit class CPUOps[Self <: CPU] (val x: Self) extends AnyVal {
    
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
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setTimes(value: CPUTimes): Self = this.set("times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimes: Self = this.set("times", js.undefined)
  }
}
