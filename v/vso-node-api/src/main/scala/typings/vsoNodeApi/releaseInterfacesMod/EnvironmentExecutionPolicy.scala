package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentExecutionPolicy extends js.Object {
  
  /**
    * This policy decides, how many environments would be with Environment Runner.
    */
  var concurrencyCount: Double = js.native
  
  /**
    * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it's policy] to take another environment for running.
    */
  var queueDepthCount: Double = js.native
}
object EnvironmentExecutionPolicy {
  
  @scala.inline
  def apply(concurrencyCount: Double, queueDepthCount: Double): EnvironmentExecutionPolicy = {
    val __obj = js.Dynamic.literal(concurrencyCount = concurrencyCount.asInstanceOf[js.Any], queueDepthCount = queueDepthCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentExecutionPolicy]
  }
  
  @scala.inline
  implicit class EnvironmentExecutionPolicyOps[Self <: EnvironmentExecutionPolicy] (val x: Self) extends AnyVal {
    
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
    def setConcurrencyCount(value: Double): Self = this.set("concurrencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueDepthCount(value: Double): Self = this.set("queueDepthCount", value.asInstanceOf[js.Any])
  }
}
