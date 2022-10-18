package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentExecutionPolicy extends StObject {
  
  /**
    * This policy decides, how many environments would be with Environment Runner.
    */
  var concurrencyCount: Double
  
  /**
    * Queue depth in the EnvironmentQueue table, this table keeps the environment entries till Environment Runner is free [as per it's policy] to take another environment for running.
    */
  var queueDepthCount: Double
}
object EnvironmentExecutionPolicy {
  
  inline def apply(concurrencyCount: Double, queueDepthCount: Double): EnvironmentExecutionPolicy = {
    val __obj = js.Dynamic.literal(concurrencyCount = concurrencyCount.asInstanceOf[js.Any], queueDepthCount = queueDepthCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentExecutionPolicy]
  }
  
  extension [Self <: EnvironmentExecutionPolicy](x: Self) {
    
    inline def setConcurrencyCount(value: Double): Self = StObject.set(x, "concurrencyCount", value.asInstanceOf[js.Any])
    
    inline def setQueueDepthCount(value: Double): Self = StObject.set(x, "queueDepthCount", value.asInstanceOf[js.Any])
  }
}
