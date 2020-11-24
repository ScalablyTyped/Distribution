package typings.tensorflowTfjsBackendWebgl.backendWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUTimerQuery extends js.Object {
  
  var endMs: js.UndefOr[Double] = js.native
  
  var startMs: Double = js.native
}
object CPUTimerQuery {
  
  @scala.inline
  def apply(startMs: Double): CPUTimerQuery = {
    val __obj = js.Dynamic.literal(startMs = startMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUTimerQuery]
  }
  
  @scala.inline
  implicit class CPUTimerQueryOps[Self <: CPUTimerQuery] (val x: Self) extends AnyVal {
    
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
    def setStartMs(value: Double): Self = this.set("startMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMs(value: Double): Self = this.set("endMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndMs: Self = this.set("endMs", js.undefined)
  }
}
