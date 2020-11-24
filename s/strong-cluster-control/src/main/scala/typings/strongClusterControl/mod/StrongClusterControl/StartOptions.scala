package typings.strongClusterControl.mod.StrongClusterControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOptions extends js.Object {
  
  var env: js.UndefOr[js.Object] = js.native
  
  var shutdownTimeout: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var terminateTimeout: js.UndefOr[Double] = js.native
  
  var throttleDelay: js.UndefOr[Double] = js.native
}
object StartOptions {
  
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  
  @scala.inline
  implicit class StartOptionsOps[Self <: StartOptions] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: js.Object): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setShutdownTimeout(value: Double): Self = this.set("shutdownTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutdownTimeout: Self = this.set("shutdownTimeout", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTerminateTimeout(value: Double): Self = this.set("terminateTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateTimeout: Self = this.set("terminateTimeout", js.undefined)
    
    @scala.inline
    def setThrottleDelay(value: Double): Self = this.set("throttleDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleDelay: Self = this.set("throttleDelay", js.undefined)
  }
}
