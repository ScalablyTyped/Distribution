package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildResourceUsage extends StObject {
  
  /**
    * The number of build agents.
    */
  var distributedTaskAgents: Double
  
  /**
    * The number of paid private agent slots.
    */
  var paidPrivateAgentSlots: Double
  
  /**
    * The total usage.
    */
  var totalUsage: Double
  
  /**
    * The number of XAML controllers.
    */
  var xamlControllers: Double
}
object BuildResourceUsage {
  
  inline def apply(
    distributedTaskAgents: Double,
    paidPrivateAgentSlots: Double,
    totalUsage: Double,
    xamlControllers: Double
  ): BuildResourceUsage = {
    val __obj = js.Dynamic.literal(distributedTaskAgents = distributedTaskAgents.asInstanceOf[js.Any], paidPrivateAgentSlots = paidPrivateAgentSlots.asInstanceOf[js.Any], totalUsage = totalUsage.asInstanceOf[js.Any], xamlControllers = xamlControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildResourceUsage]
  }
  
  extension [Self <: BuildResourceUsage](x: Self) {
    
    inline def setDistributedTaskAgents(value: Double): Self = StObject.set(x, "distributedTaskAgents", value.asInstanceOf[js.Any])
    
    inline def setPaidPrivateAgentSlots(value: Double): Self = StObject.set(x, "paidPrivateAgentSlots", value.asInstanceOf[js.Any])
    
    inline def setTotalUsage(value: Double): Self = StObject.set(x, "totalUsage", value.asInstanceOf[js.Any])
    
    inline def setXamlControllers(value: Double): Self = StObject.set(x, "xamlControllers", value.asInstanceOf[js.Any])
  }
}
