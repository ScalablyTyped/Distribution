package typings.tensorflowTfjsConverter.executionContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionContextInfo extends js.Object {
  
  var frameName: String = js.native
  
  var id: Double = js.native
  
  var iterationId: Double = js.native
}
object ExecutionContextInfo {
  
  @scala.inline
  def apply(frameName: String, id: Double, iterationId: Double): ExecutionContextInfo = {
    val __obj = js.Dynamic.literal(frameName = frameName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextInfo]
  }
  
  @scala.inline
  implicit class ExecutionContextInfoOps[Self <: ExecutionContextInfo] (val x: Self) extends AnyVal {
    
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
    def setFrameName(value: String): Self = this.set("frameName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationId(value: Double): Self = this.set("iterationId", value.asInstanceOf[js.Any])
  }
}
