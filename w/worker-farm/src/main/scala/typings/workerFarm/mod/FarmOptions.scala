package typings.workerFarm.mod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FarmOptions extends js.Object {
  
  var autoStart: js.UndefOr[Boolean] = js.native
  
  var maxCallTime: js.UndefOr[Double] = js.native
  
  var maxCallsPerWorker: js.UndefOr[Double] = js.native
  
  var maxConcurrentCalls: js.UndefOr[Double] = js.native
  
  var maxConcurrentCallsPerWorker: js.UndefOr[Double] = js.native
  
  var maxConcurrentWorkers: js.UndefOr[Double] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var workerOptions: js.UndefOr[ForkOptions] = js.native
}
object FarmOptions {
  
  @scala.inline
  def apply(): FarmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FarmOptions]
  }
  
  @scala.inline
  implicit class FarmOptionsOps[Self <: FarmOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setMaxCallTime(value: Double): Self = this.set("maxCallTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCallTime: Self = this.set("maxCallTime", js.undefined)
    
    @scala.inline
    def setMaxCallsPerWorker(value: Double): Self = this.set("maxCallsPerWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCallsPerWorker: Self = this.set("maxCallsPerWorker", js.undefined)
    
    @scala.inline
    def setMaxConcurrentCalls(value: Double): Self = this.set("maxConcurrentCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentCalls: Self = this.set("maxConcurrentCalls", js.undefined)
    
    @scala.inline
    def setMaxConcurrentCallsPerWorker(value: Double): Self = this.set("maxConcurrentCallsPerWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentCallsPerWorker: Self = this.set("maxConcurrentCallsPerWorker", js.undefined)
    
    @scala.inline
    def setMaxConcurrentWorkers(value: Double): Self = this.set("maxConcurrentWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentWorkers: Self = this.set("maxConcurrentWorkers", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setWorkerOptions(value: ForkOptions): Self = this.set("workerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerOptions: Self = this.set("workerOptions", js.undefined)
  }
}
