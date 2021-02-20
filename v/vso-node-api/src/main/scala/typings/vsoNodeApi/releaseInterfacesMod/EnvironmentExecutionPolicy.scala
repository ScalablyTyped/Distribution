package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentExecutionPolicy extends StObject {
  
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
  implicit class EnvironmentExecutionPolicyMutableBuilder[Self <: EnvironmentExecutionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcurrencyCount(value: Double): Self = StObject.set(x, "concurrencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueDepthCount(value: Double): Self = StObject.set(x, "queueDepthCount", value.asInstanceOf[js.Any])
  }
}
